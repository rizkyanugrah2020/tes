package com.anugrah.aplikasiwisata.sign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.anugrah.aplikasiwisata.R;
import com.anugrah.aplikasiwisata.splashscreen.splashscreen;
import com.anugrah.aplikasiwisata.start.start;

public class welcome extends AppCompatActivity {

    Button btnsignin,btnsignup,btnpanduan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnsignin = (Button) findViewById(R.id.btnsignin);
        btnpanduan = (Button) findViewById(R.id.btnpanduan);
        btnsignup = (Button) findViewById(R.id.btnsignup);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(welcome.this, signin.class);
                startActivity(i);
                finish();
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(welcome.this, signup.class);
                startActivity(i);
                finish();
            }
        });

        btnpanduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(welcome.this, start.class);
                startActivity(i);
                finish();
            }
        });

    }
}