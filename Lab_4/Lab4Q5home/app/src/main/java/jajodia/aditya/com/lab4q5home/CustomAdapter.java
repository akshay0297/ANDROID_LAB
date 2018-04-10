package jajodia.aditya.com.lab4q5home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;



public class CustomAdapter extends ArrayAdapter {

    public CustomAdapter(Context context, int resource, String[] foods) {
        super(context, resource, foods);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater=LayoutInflater.from(getContext());
        View customView=myInflater.inflate(R.layout.single_row,parent,false);
        String fruit=getItem(position).toString();
        TextView textView=(TextView)customView.findViewById(R.id.textView);

        textView.setText(fruit);



        return customView;
    }
}
