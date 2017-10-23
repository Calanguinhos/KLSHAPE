package com.example.pichau.projeto_tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cadastro1 extends AppCompatActivity {

    ImageButton imgbtn1,imgbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro1);
        imgbtn1 = (ImageButton) findViewById(R.id.imgbtn1);
        imgbtn2 = (ImageButton) findViewById(R.id.imgbtn2);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Cadastro1.this, com.example.pichau.projeto_tcc.CadastroInstrutor.class);
                startActivity(b);
            }
        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Cadastro1.this, CadastroAtleta.class);
                startActivity(c);

            }
        });
    }
}
