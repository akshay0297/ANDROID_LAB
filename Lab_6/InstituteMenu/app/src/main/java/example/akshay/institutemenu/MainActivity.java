package example.akshay.institutemenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    MenuItem l;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ex_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.home:
                setContentView(R.layout.activity_main);
                break;
            case R.id.contacts:
                setContentView(R.layout.contact_us);
                break;
            case R.id.about:
                setContentView(R.layout.about_me);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
