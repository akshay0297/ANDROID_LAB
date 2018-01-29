package com.example.akshay.gridview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gv = (GridView) this.findViewById(R.id.gridview);
        gv.setAdapter(new ImageAdapter(this));
    final String names[] = {"India" , "China" , "Australia" , "Portugle" , "America" , "New Zealand"};
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this ,names[i] , Toast.LENGTH_SHORT).show();
            }
        });

    }

    public  class ImageAdapter extends BaseAdapter {
        private Context mcontext;

        public ImageAdapter(Context c)
        {
            mcontext = c;
        }
        public int getCount()
        {
            return mThumbIds.length;
        }



        public Object getItem(int position)
        {
            return  null;
        }

        public long getItemId(int position)
        {
            return  0;
        }

        public View getView(int position , View convertView , ViewGroup parent)
        {
            ImageView iv;
            if(convertView == null)
            {
                iv = new ImageView(mcontext);
                iv.setLayoutParams(new GridView.LayoutParams(170 ,170));
                iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
                iv.setPadding(30 ,30,30,30);
            }
            else
            {
                iv = (ImageView)convertView;
            }
            iv.setImageResource(mThumbIds[position]);
            return iv;
        }
        private  Integer[] mThumbIds = {
                R.drawable.india,
                R.drawable.china,
                R.drawable.australia,
                R.drawable.portugle,
                R.drawable.america,
                R.drawable.newzealand
        };
    }
}

