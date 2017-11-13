package com.calangos.mainApp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 27/10/17.
 */

public class Notificacoes {

    private int id;
    private String nome;
    private String descricao;
    private String tipo;
    private int aluno;
    private int instrutor;

    public Notificacoes() {
        this.id = -1;
        this.nome = "";
        this.descricao = "";
        this.tipo = "";
        this.aluno = -1;
        this.instrutor = -1;
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

    public int getAluno() {
        return aluno;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    public int getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(int instrutor) {
        this.instrutor = instrutor;
    }
}
