package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.calangos.mainApp.models.cAtleta;
import com.calangos.mainApp.models.cInstrutor;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn1, btn2;
    public List<cAtleta> atletas;
    public List<cInstrutor> instrutores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (ImageButton) findViewById(R.id.btn1);
        btn2 = (ImageButton) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, actLogin.class);
                startActivity(a);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, actCadastro.class);
                startActivity(i);

            }
        });

        }
    }

