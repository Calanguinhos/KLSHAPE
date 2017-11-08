package com.calangos.mainApp.models;

/**
 * Created by rafael on 25/10/17.
 */

public class Exercicio {

    private int id;
    private String tipo;
    private String nome;

    public Exercicio() {
        this.id = 0;
        this.tipo = "";
        this.nome = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
