package com.rizkicandraardianto5190411015.syariahmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText nohp,pin;
    db DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nohp = findViewById(R.id.nomorhp);
        pin = findViewById(R.id.pin);
        button = (Button) findViewById(R.id.btn_login);
        DB = new db(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nohpTXT = nohp.getText().toString();
                String pinTXT = pin.getText().toString();

                boolean checkuserdata = DB.login(nohpTXT, pinTXT);
                if (checkuserdata == true){
                    Intent intent = new Intent(MainActivity.this, login1.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();
                    Toast.makeText(MainActivity.this, "Berhasil login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Gagal login", Toast.LENGTH_SHORT).show();
                }
            }
        });


    } }
