package com.example.android.runapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view pager for swiping between fragments
        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);

        // adapter which sets proper fragment for each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // setting adapter for view pager
        pager.setAdapter(adapter);

        // tab layout that shows the categories
        TabLayout categoryLayout = (TabLayout) findViewById(R.id.category);

        // setting tabs to work with view pager
        categoryLayout.setupWithViewPager(pager);
    }
}
