package com.example.pichau.projeto_tcc.model;

/**
 * Created by rafael on 25/10/17.
 */

public class cPessoa {

    private String nome;
    private int rg;
    private int cpf;
    private String email;
    private String senha;
    private String endereco;

    //Metodo construtor
    public cPessoa(String nome, int rg, int cpf, String email, String senha, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    //Modelo Query de add e update
    public void qExecCriaUp(int _id, String _nome, int _rg, int _cpf, String _email, String _senha, String _endereco){

    }

    //Modelo Query de busca
    public void qExecPesquisa(int _id, String _nome, int _rg, int _cpf, String _email, String _senha, String _endereco){

    }

    //Modelo Query de exclusão
    public void qExecDrop(int _id, String _nome, int _rg, int _cpf, String _email, String _senha, String _endereco){

    }

    //Metodos de encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
