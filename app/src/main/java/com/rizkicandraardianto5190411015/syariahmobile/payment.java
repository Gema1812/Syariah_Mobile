package com.rizkicandraardianto5190411015.syariahmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class payment extends AppCompatActivity {

    private Button mKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        mKembali =(Button)findViewById(R.id.btn_kembali);

        mKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iKembali = new Intent(getApplicationContext(), login1.class);
                startActivity(iKembali);
                finish();
            }
        });
    }
}