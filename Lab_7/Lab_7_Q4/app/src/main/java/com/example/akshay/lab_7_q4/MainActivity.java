package com.example.akshay.lab_7_q4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends Activity {

    TextView tv = (TextView) this.findViewById(R.id.textv);
    Button b1 = (Button) this.findViewById(R.id.button);
    Button b2 = (Button) this.findViewById(R.id.search);
    EditText e;
    String sr , sorted = "" , ms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this , b1);
                popup.getMenuInflater().inflate(R.menu.menu_bar, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick( MenuItem item)
                    {
                        if(item.getItemId() == R.id.keyw)
                        {
                            e.setVisibility(View.VISIBLE);
                            b2.setVisibility(View.VISIBLE);

                            b2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    sr = e.getText().toString();
                                    ms = tv.getText().toString();

                                    if(ms.contains(sr))
                                    {
                                        Toast.makeText(MainActivity.this,"String Present",Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                    {
                                        Toast.makeText(MainActivity.this,"String Not Present",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }
                        else
                            if(item.getItemId() == R.id.sort)
                            {
                                ms = tv.getText().toString();

                                String strArray[] = ms.split(" ");
                                Arrays.sort(strArray);
                                for (int i = 0; i < strArray.length; i++) {
                                    sorted = sorted + strArray[i] + " ";
                                }
                                tv.setText(sorted);
                            }

                        return true;
                    }
                });

                popup.show();
            }
        });
    }

}
