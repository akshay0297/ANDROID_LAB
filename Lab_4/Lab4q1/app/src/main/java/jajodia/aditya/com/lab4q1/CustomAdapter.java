package jajodia.aditya.com.lab4q1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class CustomAdapter extends ArrayAdapter {
    String foods[];
    int img[];
    public CustomAdapter(Context context, int resource, String[] foods,int img[]) {
        super(context, resource, foods);
        this.foods=foods;
        this.img=img;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View customView=layoutInflater.inflate(R.layout.single_row,parent,false);
        TextView textView=(TextView)customView.findViewById(R.id.textView);
        textView.setText(foods[position]);
        ImageView imageView=(ImageView)customView.findViewById(R.id.imageView);
        imageView.setImageResource(img[position]);
        return customView;


    }
}
