package com.calangos.mainApp.models;

/**
 * Created by rafael on 27/10/17.
 */

public class Notificacoes {

    private int id;
    private String nome;
    private String descricao;
    private String tipo;
    private Atleta aluno;
    private Instrutor Instrutor;

    public Notificacoes() {
        this.id = 0;
        this.nome = "";
        this.descricao = "";
        this.tipo = "";
        this.aluno = new Atleta();
        this.Instrutor = new Instrutor();
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

    public Atleta getAluno() {
        return aluno;
    }

    public void setAluno(Atleta aluno) {
        this.aluno = aluno;
    }

    public Instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(Instrutor Instrutor) {
        this.Instrutor = Instrutor;
    }
}
