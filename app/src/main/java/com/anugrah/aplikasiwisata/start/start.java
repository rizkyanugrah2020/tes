package com.anugrah.aplikasiwisata.start;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anugrah.aplikasiwisata.R;
import com.anugrah.aplikasiwisata.sign.signin;
import com.anugrah.aplikasiwisata.sign.welcome;

public class start extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        IntroAdapter adapter = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(start.this, welcome.class);
        startActivity(i);
        finish();
    }
}