package jajodia.aditya.com.lab4q5home;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView listView;
    Button b;
    String foods[];
    int order[];
    int cost[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foods= new String[]{"pizza", "burger", "chips", "fries", "pepsi"};
        order=new int[foods.length];
        cost=new int[foods.length];
        for(int i=0;i<foods.length;i++)
        {
            order[i]=0;
            cost[i]=(i+1)*10;
        }
        listView=(ListView)findViewById(R.id.listView);
        ListAdapter listAdapter=new CustomAdapter(this,R.layout.single_row,foods);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp=String.valueOf(parent.getItemAtPosition(position));

                CheckBox checkBox=(CheckBox)view.findViewById(R.id.checkBox);
                if(!checkBox.isChecked())
                {

                    order[position]=1;
                }
                else
                {
                    order[position]=0;
                }
                checkBox.setChecked(!checkBox.isChecked());

            }
        });


    }
    public void myFunc(View v)
    {
        int i;
        String temp="";
        int totalcost=0;
        for(i=0;i<foods.length;i++)
        {
            if(order[i]==1)
            {
                temp+=foods[i]+"\t"+cost[i]+"\n";
                totalcost+=cost[i];
            }
        }
        temp+="Your total amount is "+totalcost;
        Toast.makeText(this,temp, Toast.LENGTH_SHORT).show();

       // listView.setEnabled(false);
    }

}

