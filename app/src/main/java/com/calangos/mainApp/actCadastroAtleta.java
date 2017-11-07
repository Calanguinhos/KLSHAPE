package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.manData;
import com.calangos.mainApp.dao.webService;
import com.calangos.mainApp.models.cAtleta;


public class actCadastroAtleta extends AppCompatActivity implements manData {

    private EditText nm,rg,cpf,end,email,senha;
    private ImageButton btCad;
    private cAtleta atleta = new cAtleta();

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
        btCad = findViewById(R.id.btCadc);

        btCad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                webService service = new webService();

                if (service.Connected(getApplicationContext())){

                    Toast.makeText(getApplicationContext(),"Acesso à internet!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(),"Sem acesso à internet!", Toast.LENGTH_SHORT).show();
                }

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

        atleta.setNome(nm.getText().toString());
        atleta.setRg(Integer.parseInt(rg.getText().toString()));
        atleta.setCpf(Integer.parseInt(cpf.getText().toString()));
        atleta.setEmail(email.getText().toString());
        atleta.setSenha(senha.getText().toString());
        atleta.setEndereco(end.getText().toString());

        try{
            Toast.makeText(getApplicationContext(), "Enviando dados", Toast.LENGTH_SHORT).show();
            atleta.salvar();
        } catch (Exception e) {
            result = e.getMessage();
            Toast.makeText(getApplicationContext(), "Erro: "+result, Toast.LENGTH_SHORT).show();
        } finally {
            result = atleta.getNome();
        }

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

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
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