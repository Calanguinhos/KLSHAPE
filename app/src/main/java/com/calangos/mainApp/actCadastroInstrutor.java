package com.calangos.mainApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;


public class actCadastroInstrutor extends AppCompatActivity {

    private EditText nm, rg, cpf, end, email, senha;
    private ImageButton btCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_instrutor);
        nm = findViewById(R.id.nm);
        rg = findViewById(R.id.rg);
        cpf = findViewById(R.id.cpf);
        end = findViewById(R.id.end);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        btCad = findViewById(R.id.btCadc);

        btCad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}