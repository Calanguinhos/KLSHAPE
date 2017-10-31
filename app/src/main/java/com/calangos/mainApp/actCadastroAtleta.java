package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.temp.dbControll;
import com.calangos.mainApp.models.cAtleta;

import java.util.ArrayList;
import java.util.List;


public class actCadastroAtleta extends AppCompatActivity {

    private EditText nm,rg,cpf,end,email,senha;
    private ImageButton btCad;
    private List<cAtleta> atleta;

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

                Intent i = new Intent(actCadastroAtleta.this, actLogin.class);
                startActivity(i);
            }
        });

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