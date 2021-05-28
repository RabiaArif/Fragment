package com.rabia.arif.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ButtonOne(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.replace(R.id.fragment,firstFragment);
        fragmentTransaction.commit();
    }


    public void ButtonTwo(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        SecondFragment secondFragment = new SecondFragment();
        fragmentTransaction.replace(R.id.fragment,secondFragment);
        fragmentTransaction.commit();
    }

}