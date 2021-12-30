package com.rizkicandraardianto5190411015.syariahmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login1 extends AppCompatActivity {

    TextView button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        button1 = (TextView) findViewById(R.id.btn_info);
        button2 = (TextView) findViewById(R.id.btn_toko);
        button3 = (TextView) findViewById(R.id.btn_transfer);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login1.this, payment.class);
                login1.this.startActivity(intent);
                login1.this.finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login1.this, ecommerce.class);
                login1.this.startActivity(intent);
                login1.this.finish();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login1.this, transfer.class);
                login1.this.startActivity(intent);
                login1.this.finish();
            }
        });

    } }
