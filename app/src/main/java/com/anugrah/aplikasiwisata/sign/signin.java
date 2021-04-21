package com.anugrah.aplikasiwisata.sign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.anugrah.aplikasiwisata.R;
import com.anugrah.aplikasiwisata.admin.homeadmin;
import com.anugrah.aplikasiwisata.server.BaseURL;
import com.anugrah.aplikasiwisata.user.homeuser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class signin extends AppCompatActivity {

    Button btntoregis,btnlogin;
    EditText txtusername,txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        btntoregis = (Button) findViewById(R.id.btntoregis);

        txtusername = (EditText) findViewById(R.id.txtusername);
        txtpassword = (EditText) findViewById(R.id.txtpassword);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUsername = txtusername.getText().toString();
                String strPassword = txtpassword.getText().toString();

                if(strUsername.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Usename Kosong", Toast.LENGTH_LONG).show();
                }else  if(strPassword.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Password Kosong", Toast.LENGTH_LONG).show();
                }else  if(strUsername.equals("admin")){
                    Intent i = new Intent(signin.this, homeadmin.class);
                    startActivity(i);
                    finish();
                }else  if(strUsername.equals("user")){
                    Intent i = new Intent(signin.this, homeuser.class);
                    startActivity(i);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Username Salah", Toast.LENGTH_LONG).show();
                }
            }
        });

        btntoregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(signin.this, signup.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(signin.this, welcome.class);
        startActivity(i);
        finish();
    }

}
