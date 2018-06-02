package com.example.tacwin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button_id);
        final TextView tv = (TextView) findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            int i =0;
            public void onClick(View v) {
                tv.setText("Hello" + i);
                i++;
            }
        });



    }
}
