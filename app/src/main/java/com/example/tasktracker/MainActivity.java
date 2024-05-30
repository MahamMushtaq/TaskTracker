package com.example.tasktracker;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bnv;
    private fragment1 f1 = new fragment1();
    private fragment2 f2 = new fragment2();
    private Fragment3 f3 = new Fragment3();
    private fragment4 f4 = new fragment4();
    private fragment6 f6 = new fragment6();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bottomNavigationView);
        bnv.setOnNavigationItemSelectedListener(this);

        // Load the default fragment when the app starts
        getSupportFragmentManager().beginTransaction().replace(R.id.frame1, f1).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, f1).commit();
            return true;
        } else if (id == R.id.item2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, f2).commit();
            return true;
        } else if (id == R.id.item3) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, f3).commit();
            return true;
        } else if (id == R.id.item4) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, f4).commit();
            return true;
        } else if (id == R.id.item5) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, f6).commit();
            return true;
        }
        return false;
    }

}
