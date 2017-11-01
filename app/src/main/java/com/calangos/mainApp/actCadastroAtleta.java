package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.manData;
import com.calangos.mainApp.dao.temp.dbControll;
import com.calangos.mainApp.models.cAtleta;

import java.util.ArrayList;
import java.util.List;


public class actCadastroAtleta extends AppCompatActivity implements manData {

    private EditText nm,rg,cpf,end,email,senha;
    private ImageButton btCad;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_atleta);

        nm = findViewById(R.id.nm);
        rg = findViewById(R.id.rg);
        cpf = findViewById(R.id.cpf);
        end = findViewById(R.id.end);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        btCad = findViewById(R.id.btCad);

        btCad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String result = addRegs();
                Toast.makeText(getApplicationContext(), "Obrigado "+result+" por se cadastrar", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(actCadastroAtleta.this, actLogin.class);
                startActivity(i);

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
        String _email = email.getText().toString();
        String _senha = senha.getText().toString();
        String _endereco = end.getText().toString();

        cAtleta atleta = new cAtleta(0,_nome,_rg,_cpf,_email,_senha,_endereco);
        result = atleta.addAtleta(_nome,_rg,_cpf,_email,_senha,_endereco, getApplicationContext());

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
    public void onPointerCaptureChanged(boolean hasCapture) {

    }



    public EditText getNm() {
        return nm;
    }

    public void setNm(EditText nm) {
        this.nm = nm;
    }

    public EditText getRg() {
        return rg;
    }

    public void setRg(EditText rg) {
        this.rg = rg;
    }

    public EditText getCpf() {
        return cpf;
    }

    public void setCpf(EditText cpf) {
        this.cpf = cpf;
    }

    public EditText getEnd() {
        return end;
    }

    public void setEnd(EditText end) {
        this.end = end;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getSenha() {
        return senha;
    }

    public void setSenha(EditText senha) {
        this.senha = senha;
    }

    public ImageButton getBtCad() {
        return btCad;
    }

    public void setBtCad(ImageButton btCad) {
        this.btCad = btCad;
    }

}