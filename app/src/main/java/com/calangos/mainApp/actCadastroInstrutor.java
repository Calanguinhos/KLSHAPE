package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.manData;
import com.calangos.mainApp.models.cInstrutor;


public class actCadastroInstrutor extends AppCompatActivity implements manData {

    private EditText nm,rg,cpf,end,email,senha;
    private ImageButton btCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_instrutor);
        nm =  findViewById(R.id.nm);
        rg =  findViewById(R.id.rg);
        cpf =  findViewById(R.id.cpf);
        end =  findViewById(R.id.end);
        email =  findViewById(R.id.email);
        senha =  findViewById(R.id.senha);
        btCad = findViewById(R.id.btCadc);

        btCad.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String result = addRegs();
                Toast.makeText(getApplicationContext(), "Obrigado "+result+" por se cadastrar", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(actCadastroInstrutor.this, actCadastro.class);
                startActivity(i);
                finish();

            }
        });
    }

    @Override
    public String opeTrans() {
        return null;
    }

    @Override
    public String addRegs() {

        String result;

        String _nome = nm.getText().toString();
        int _rg = Integer.parseInt(rg.getText().toString());
        int _cpf = Integer.parseInt(cpf.getText().toString());
        String _endereco = end.getText().toString();
        String _email = email.getText().toString();
        String _senha = senha.getText().toString();

        cInstrutor atleta = new cInstrutor();
        result = atleta.addInstrutor(_nome,_rg,_cpf,_email,_senha,_endereco, getApplicationContext());

        return result;
    }

    @Override
    public String canRegs() {
        return null;
    }

    @Override
    public String delRegs() {
        return null;
    }

    @Override
    public String selRegs() {
        return null;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}