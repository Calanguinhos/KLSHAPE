package com.calangos.mainApp.models;

/**
 * Created by rafael on 27/10/17.
 */

public class cNotificacoes {

    private int id;
    private String nome;
    private String Descricao;
    private String tipo;
    private cAtleta aluno = new cAtleta(null,0,0,null,null,null);
    private cInstrutor instrutor = new cInstrutor(null,0,0,null,null,null,0);

    public cNotificacoes(int id, String nome, String descricao, String tipo, cAtleta aluno, cInstrutor instrutor) {
        this.id = id;
        this.nome = nome;
        Descricao = descricao;
        this.tipo = tipo;
        this.aluno = aluno;
        this.instrutor = instrutor;
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
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
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
