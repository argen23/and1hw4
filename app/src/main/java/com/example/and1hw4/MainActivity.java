package com.example.and1hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.and1hw4.FirstFragment.FirstFragment;
import com.example.and1hw4.Models.User;
import com.example.and1hw4.SecondFragment.Adapter;
import com.example.and1hw4.SecondFragment.SecondFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.firstContainer,new FirstFragment(),null).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.secondContainer,new SecondFragment(),null).commit();
    }



}