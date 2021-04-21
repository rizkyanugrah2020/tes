package com.anugrah.aplikasiwisata.sign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anugrah.aplikasiwisata.R;
import com.anugrah.aplikasiwisata.server.BaseURL;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static com.anugrah.aplikasiwisata.server.BaseURL.registrasi;

public class signup extends AppCompatActivity {

    Button btntologin,btnregis;
    EditText edtusername,edtemail,edtnama,edtnotlp,txtpassword;
    ProgressDialog pDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btntologin = (Button) findViewById(R.id.btntologin);
        btnregis = (Button) findViewById(R.id.btnregis);

        edtusername = (EditText) findViewById(R.id.edtusername);
        edtnama = (EditText) findViewById(R.id.edtnama);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtnotlp = (EditText) findViewById(R.id.edtnotlp);
        txtpassword = (EditText) findViewById(R.id.txtpassword);

        pDialog = new ProgressDialog(this);
        pDialog.setCancelable(false);

        btntologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(signup.this, signin.class);
                startActivity(i);
                finish();
            }
        });

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(signup.this, welcome.class);
        startActivity(i);
        finish();
    }

}