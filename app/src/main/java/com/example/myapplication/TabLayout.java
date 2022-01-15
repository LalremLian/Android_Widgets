package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class TabLayout extends AppCompatActivity {


    //Variables...
    //TabLayout tabLayout;
    ViewPager viewPager;
    com.google.android.material.tabs.TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        //Hooks...refers
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(),"Chats");
        vpAdapter.addFragment(new Fragment1(),"Status");
        vpAdapter.addFragment(new Fragment1(),"Calls");

        viewPager.setAdapter(vpAdapter);
    }
}