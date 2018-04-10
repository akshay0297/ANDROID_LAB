package com.example.activity.lab4q3;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void kitkat(View v)
    {
        LinearLayout ll=new LinearLayout(this);
        TextView tv=new TextView(this);
        ImageView iv=new ImageView(this);
        tv.setText("kitkat");
        tv.setTextSize(20);
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        iv.setImageResource(R.drawable.k);
        ll.addView(tv);
        ll.addView(iv);
        Toast t=new Toast(this);

        t.setView(ll);

        t.show();
    }
    public void marshmallow(View v)
    {
        LinearLayout ll=new LinearLayout(this);
        TextView tv=new TextView(this);
        ImageView iv=new ImageView(this);
        tv.setText("marshmallow");
        tv.setTextSize(20);
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        iv.setImageResource(R.drawable.m);
        ll.addView(tv);
        ll.addView(iv);
        Toast t=new Toast(this);

        t.setView(ll);

        t.show();
    }
    public void lollipop(View v)
    {
        LinearLayout ll=new LinearLayout(this);
        TextView tv=new TextView(this);
        ImageView iv=new ImageView(this);
        tv.setText("lollipop");
        tv.setTextSize(20);
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        iv.setImageResource(R.drawable.l);
        ll.addView(tv);
        ll.addView(iv);
        Toast t=new Toast(this);

        t.setView(ll);

        t.show();

    }
}
