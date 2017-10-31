package com.calangos.mainApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.R;


public class actCadastroInstrutor extends AppCompatActivity {

    EditText nm,rg,cpf,end,email,senha;


    ImageButton btCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_instrutor);
        nm = (EditText) findViewById(R.id.nm);
        rg = (EditText) findViewById(R.id.rg);
        cpf = (EditText) findViewById(R.id.cpf);
        end = (EditText) findViewById(R.id.end);
        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById(R.id.senha);
        btCad = (ImageButton) findViewById(R.id.btCad);

        btCad.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //CRUD crud = new CRUD(getBaseContext());

                String nome = nm.getText().toString();
                String RG= rg.getText().toString();
                String CPF= cpf.getText().toString();
                String Endereco= end.getText().toString();
                String Email= email.getText().toString();
                String Senha= senha.getText().toString();

                //String resultado=crud.inserir(nome,RG,CPF,Endereco,Email,Senha);
                //Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });








    }
}