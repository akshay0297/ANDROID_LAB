package com.example.akshay.lab_7_q3;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageView iv1;
    ImageView iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this , iv1);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId() == R.id.one)
                        {
                            iv2.setVisibility(View.VISIBLE);
                            iv2.setImageResource(R.drawable.a);
                        }
                        if(item.getItemId() == R.id.two)
                        {
                            iv2.setVisibility(View.VISIBLE);
                            iv2.setImageResource(R.drawable.b);
                        }
                        Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popup.show();
                iv2.setVisibility(View.INVISIBLE);
            }

        });
    }
}
