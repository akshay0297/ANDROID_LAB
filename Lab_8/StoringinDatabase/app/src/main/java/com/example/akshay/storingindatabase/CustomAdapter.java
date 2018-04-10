package com.example.akshay.storingindatabase;

import android.content.Context;
//import android.content.DialogInterface;
//import android.support.annotation.NotNull;
//import android.support.annotation.Nullable;
//import android.supportDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<customData> {

    List<customData> dL;
    Context context;
    int resource;

    public CustomAdapter(MainActivity mainActivity, @Nullable int activity_main, @NotNull List<customData> dataList)
    {
        super(mainActivity , activity_main , dataList);
        this.context = mainActivity;
        this.resource = activity_main;
        this.dL = dataList;


    }
    @NotNull
    @Override
    public View getView(final int position,  View convertView,  ViewGroup parent) {

        //we need to get the view of the xml for our list item
        //And for this we need a layoutinflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //getting the view
        View view = layoutInflater.inflate(resource, null, false);

        //getting the view elements of the list from the view
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewDate = view.findViewById(R.id.textViewDate);


        //getting the hero of the specified position
        customData hero = dL.get(position);

        //adding values to the list item
        imageView.setImageDrawable(context.getResources().getDrawable(hero.getImage()));
        textViewName.setText(hero.getName());
        textViewDate.setText(hero.getDate());

        //adding a click listener to the button to remove item from the list

        //finally returning the view
        return view;

    }
}
