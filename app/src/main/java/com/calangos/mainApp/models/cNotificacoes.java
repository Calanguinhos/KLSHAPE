package com.calangos.mainApp.models;

/**
 * Created by rafael on 27/10/17.
 */

public class cNotificacoes {

    private int id;
    private String nome;
    private String descricao;
    private String tipo;
    private cAtleta aluno;
    private cInstrutor instrutor;

    public cNotificacoes() {
        this.id = 0;
        this.nome = "";
        this.descricao = "";
        this.tipo = "";
        this.aluno = new cAtleta();
        this.instrutor = new cInstrutor();
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public cAtleta getAluno() {
        return aluno;
    }

    public void setAluno(cAtleta aluno) {
        this.aluno = aluno;
    }

    public cInstrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(cInstrutor instrutor) {
        this.instrutor = instrutor;
    }
}
