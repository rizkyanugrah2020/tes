package com.anugrah.aplikasiwisata.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.anugrah.aplikasiwisata.R;
import com.anugrah.aplikasiwisata.sign.signin;
import com.anugrah.aplikasiwisata.sign.welcome;
import com.anugrah.aplikasiwisata.start.start;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(splashscreen.this, welcome.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        thread.start();
    }
}