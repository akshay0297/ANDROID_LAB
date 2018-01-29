package com.example.akshay.lview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView simplelist;
    String names[] = {"India" , "China" , "Australia" , "Portugal" , "America" , "New Zealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplelist = (ListView) this.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this , R.layout.activity_list , R.id.textView , names);
        simplelist.setAdapter(arrayAdapter);

        simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this , names[i] , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
