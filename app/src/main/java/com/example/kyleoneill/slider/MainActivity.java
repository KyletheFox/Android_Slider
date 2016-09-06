package com.example.kyleoneill.slider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO Say whatever needs to be done

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList a = new ArrayList<>();
//        a = null;   // Java garbage collect would delete the obj in memory.

        SeekBar sb = (SeekBar) findViewById(R.id.slider);
        message = (TextView) findViewById(R.id.textView2);

        sb.setProgress(100); // Set default alpha

        // Event Listener for slider
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Set alpha of Label

                Log.d("MainActivity", String.valueOf(progress));    // Debug logger when slider changes

                float alphaVal = (float)progress / 100;
                message.setAlpha(alphaVal);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
