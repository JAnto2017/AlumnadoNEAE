package com.example.alumnadonecesidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Activity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    //---------------------------------------------------------------------------------------------- Retorno a MainActivity
    public void retornar(View v){
        finish();
    }
}
