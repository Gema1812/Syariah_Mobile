package com.rizkicandraardianto5190411015.syariahmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ecommerce extends AppCompatActivity {

    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecommerce);

        back_btn = (Button) findViewById(R.id.btn_back);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ecommerce.this, login1.class);
                ecommerce.this.startActivity(intent);
                ecommerce.this.finish();
            }
        });
    }
}