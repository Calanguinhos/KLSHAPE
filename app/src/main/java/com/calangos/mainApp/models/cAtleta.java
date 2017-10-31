package com.calangos.mainApp.models;

import android.content.Context;
import android.widget.Toast;

import com.calangos.mainApp.dao.temp.dbControll;

/**
 * Created by rafael on 25/10/17.
 */

public class cAtleta extends cPessoa {

    int cod;

    public cAtleta(String nome, int rg, int cpf, String email, String senha, String endereco) {
        super(nome, rg, cpf, email, senha, endereco);

    }

    public void addAtleta(Context contApp, Context contDb){
        dbControll query = new dbControll(contDb);
        String result;
        result = query.addAtleta(getNome(), getRg(),getCpf(),getEndereco(),getEmail(),getSenha());
        Toast.makeText(contApp, result, Toast.LENGTH_LONG).show();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
