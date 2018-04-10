package com.example.akshay.storingindatabase;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<customData> dataList;
    ListView simplelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setContentView(R.layout.activity_main);

        dataList = new ArrayList<>();
        simplelist = (ListView) this.findViewById(R.id.listView);
        dataList.add(new customData(R.drawable.ic_launcher_background , "IMAGE1.png" , "25-FEB-2018"));
       CustomAdapter adapter = new CustomAdapter(this,R.layout.activity_main , dataList);

    }
}
