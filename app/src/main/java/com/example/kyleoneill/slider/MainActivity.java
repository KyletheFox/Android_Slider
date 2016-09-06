package com.example.kyleoneill.slider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // TODO Say whatever needs to be done

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList a = new ArrayList<>();


        a = null;   // Java garbage collect would delete the obj in memory.
    }
}
