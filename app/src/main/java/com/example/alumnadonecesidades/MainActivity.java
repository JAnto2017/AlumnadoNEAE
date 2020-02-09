package com.example.alumnadonecesidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //---------------------------------------------------------------------------------------------- ACTIVITY_2
    public void goActiv_2(View v){
        Intent i = new Intent(this,Activity_2.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- ACTIVITY_3
    public void goActiv_3(View v){
        Intent i = new Intent(this,Activity_3.class);
        startActivity(i);
    }

    //---------------------------------------------------------------------------------------------- ACTIVITY_4
    public void goActivi_4(View v){
        Intent i = new Intent(this,Activity_4.class);
        startActivity(i);
    }
}
