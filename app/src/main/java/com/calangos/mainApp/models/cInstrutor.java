package com.calangos.mainApp.models;

/**
 * Created by rafael on 25/10/17.
 */

public class cInstrutor extends cPessoa {

    int cod;

    public cInstrutor(String nome, int rg, int cpf, String email, String senha, String endereco, int cod) {
        super(nome, rg, cpf, email, senha, endereco);
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
