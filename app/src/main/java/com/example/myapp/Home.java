package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    private int mLastDayNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mLastDayNightMode = AppCompatDelegate.getDefaultNightMode();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (AppCompatDelegate.getDefaultNightMode() != mLastDayNightMode){
            recreate();

        }
    }



    public  void  gotoMainActivity(View view){
        startActivity(new Intent(this,MainActivity.class));
    }

}
