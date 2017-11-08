package com.calangos.mainApp.utils;

import com.calangos.mainApp.utils._Default;

/**
 * Created by rafael on 25/10/17.
 */

public abstract class _Pessoa extends _Default {

    private int id;
    private String nome;
    private long rg;
    private long cpf;
    private String email;
    private String senha;
    private String endereco;
    private int ativo;

    //Metodo construtor
    public _Pessoa() {
        super();
        this.id = -1;
        this.nome = "";
        this.rg = 0;
        this.cpf = 0;
        this.email = "";
        this.senha = "";
        this.endereco = "";
        this.ativo = 0;
    }


    //Metodos de encapsulamento

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

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

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
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
