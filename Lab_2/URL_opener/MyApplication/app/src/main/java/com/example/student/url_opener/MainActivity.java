package com.example.student.url_opener;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bu = (Button)findViewById(R.id.sub);
        final EditText tx = (EditText)findViewById(R.id.edi);
        bu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(tx.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Enter a URL", Toast.LENGTH_SHORT);
                    return;
                }
                String url = tx.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://"+url));
                startActivity(i);
            }
        });

    }


}
