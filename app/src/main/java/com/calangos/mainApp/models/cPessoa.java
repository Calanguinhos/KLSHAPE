package com.calangos.mainApp.models;

/**
 * Created by rafael on 25/10/17.
 */

public abstract class cPessoa {

    private  int id;
    private String nome;
    private int rg;
    private int cpf;
    private String email;
    private String senha;
    private String endereco;

    //Metodo construtor
    public cPessoa(int id, String nome, int rg, int cpf, String email, String senha, String endereco) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }


    //Metodos de encapsulamento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
