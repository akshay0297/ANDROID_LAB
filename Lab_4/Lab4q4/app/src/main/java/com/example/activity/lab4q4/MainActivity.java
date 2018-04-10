package com.example.activity.lab4q4;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    AudioManager am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    }
    public void myFunc(View v)
    {
        if(((ToggleButton)v).isChecked())
        {
            Toast.makeText(this, "Phone is in silent mode", Toast.LENGTH_SHORT).show();
            am.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        }
        else
        {
            Toast.makeText(this, "Phone is in ringing mode", Toast.LENGTH_SHORT).show();
            am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        }
    }
}
