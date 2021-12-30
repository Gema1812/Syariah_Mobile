package com.rizkicandraardianto5190411015.syariahmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class transfer extends AppCompatActivity {

    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        back_btn = (Button) findViewById(R.id.btn_back);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(transfer.this, login1.class);
                transfer.this.startActivity(intent);
                transfer.this.finish();
            }
        });
    }
}