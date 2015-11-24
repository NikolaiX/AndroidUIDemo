package com.example.nikolaia.multiscreentutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by NikolaiA on 24 Nov 15.
 */
public class App2Activity extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }
}
