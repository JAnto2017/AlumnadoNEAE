package com.example.alumnadonecesidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    //---------------------------------------------------------------------------------------------- Retorno a MainActivity
    public void retornar(View v){
        finish();
    }
}
