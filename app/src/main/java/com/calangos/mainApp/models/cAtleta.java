package com.calangos.mainApp.models;

import android.content.Context;
import android.widget.Toast;

import com.calangos.mainApp.dao.temp.dbControll;

/**
 * Created by rafael on 25/10/17.
 */

public class cAtleta extends cPessoa {

    public cAtleta(int id, String nome, int rg, int cpf, String email, String senha, String endereco) {
        super(id, nome, rg, cpf, email, senha, endereco);
    }
}
