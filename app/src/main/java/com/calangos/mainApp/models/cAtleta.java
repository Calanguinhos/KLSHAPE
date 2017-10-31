package com.calangos.mainApp.models;

import com.calangos.mainApp.dao.temp.dbControll;

/**
 * Created by rafael on 25/10/17.
 */

public class cAtleta extends cPessoa {

    int cod;
    dbControll query = new dbControll();

    public cAtleta(String nome, int rg, int cpf, String email, String senha, String endereco) {
        super(nome, rg, cpf, email, senha, endereco);

    }

    public void addAtleta(){
        query.addAtleta(this.getNome(), this.getRg(),this.getCpf(),this.getEndereco(),this.getEmail(),this.getSenha());
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
