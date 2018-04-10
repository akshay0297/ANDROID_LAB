package sebanti.com.contacts_try;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

	private static final int RESULT_PICK_CONTACT = 85500;
	
	private TextView textView1;
	private TextView textView2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView1 = (TextView) findViewById(R.id.textView1);
		textView2 = (TextView) findViewById(R.id.textView2);
	}
	final GestureDetector gestureDetector = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
		public void onLongPress(MotionEvent e) {
			Log.e("", "Longpress detected");
		}
	});

	public boolean onTouchEvent(MotionEvent event) {
		return gestureDetector.onTouchEvent(event);
	}
	@TargetApi(Build.VERSION_CODES.ECLAIR)
	public void pickContact(View v)
	{
		Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
				ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
	    startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT);
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
            case RESULT_PICK_CONTACT:
                contactPicked(data);
                break;
            }

        } else {
        	Log.e("MainActivity", "Failed to pick contact");
        }
    }

	private void contactPicked(Intent data) {
		Cursor cursor = null;
        try {
        	String phoneNo = null ;
        	String name = null;
        	Uri uri = data.getData();
        	cursor = getContentResolver().query(uri, null, null, null, null);
        	cursor.moveToFirst();

        	int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
        	int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
        	
        	phoneNo = cursor.getString(phoneIndex);
        	name = cursor.getString(nameIndex);
        	
        	textView1.setText(name);
        	textView2.setText(phoneNo);
			textView1.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View view) {
					Toast.makeText(getBaseContext(), textView1.getText().toString(), Toast.LENGTH_SHORT).show();

					PopupMenu popup = new PopupMenu(getApplicationContext(), view);

					popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

					popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
						public boolean onMenuItemClick(MenuItem item) {
							Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();
							return true;
						}
					});
					popup.show();
					return false;
				}
			});


        } catch (Exception e) {
        	e.printStackTrace();
        }
		
	}
}
