package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


//        FragmentManager manager = getSupportFragmentManager();
//        Fragment fragment  = manager.findFragmentById(R.id.fragmentShoes);
//        manager.beginTransaction().add(R.id.fragmentContainerShoes,fragment).commit();
    }
}