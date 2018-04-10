package com.example.activity.lab4q2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void buttonFunc(View v)
    {
        Toast toast = new Toast(this);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.button);
        toast.setView(imageView);
        toast.show();
    }
    public void toggleFunc(View v)
    {
        if(((ToggleButton)v).isChecked())
        {
            Toast toast = new Toast(this);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.abc);
            toast.setView(imageView);
            toast.show();


        }
        else
        {
            Toast toast = new Toast(this);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.imageoff);
            toast.setView(imageView);
            toast.show();
        }

    }
}
