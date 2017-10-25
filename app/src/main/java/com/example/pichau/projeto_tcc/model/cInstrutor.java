package com.example.pichau.projeto_tcc.model;

/**
 * Created by rafael on 25/10/17.
 */

public class cInstrutor extends cPessoa {

    int cod;

    public cInstrutor(String nome, int rg, int cpf, String email, String senha, String endereco, int cod) {
        super(nome, rg, cpf, email, senha, endereco);
        this.cod = cod;
    }

    @Override
    public void qExecCriaUp(int _id, String _nome, int _rg, int _cpf, String _email, String _senha, String _endereco) {
        super.qExecCriaUp(_id, _nome, _rg, _cpf, _email, _senha, _endereco);
    }

    @Override
    public void qExecPesquisa(int _id, String _nome, int _rg, int _cpf, String _email, String _senha, String _endereco) {
        super.qExecPesquisa(_id, _nome, _rg, _cpf, _email, _senha, _endereco);
    }

    @Override
    public void qExecDrop(int _id, String _nome, int _rg, int _cpf, String _email, String _senha, String _endereco) {
        super.qExecDrop(_id, _nome, _rg, _cpf, _email, _senha, _endereco);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
