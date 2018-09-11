package com.example.faruksharif.buttonloginfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View view){

        EditText txt1=(EditText) findViewById(R.id.txt1);
        EditText txt2=(EditText) findViewById(R.id.txt2);

        Log.i("Button","Please click me!!!");
        Log.i("Values1",txt1.getText().toString());
        Log.i("Values2",txt2.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
