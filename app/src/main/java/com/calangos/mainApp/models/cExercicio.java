package com.calangos.mainApp.models;

import com.calangos.mainApp.dao.manData;

/**
 * Created by rafael on 25/10/17.
 */

public class cExercicio implements manData {

    private int id;
    private String tipo;
    private String nome;

    public cExercicio(int id, String tipo, String nome) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
    }

    public void fGeraListaExercicio(){

    }

    @Override
    public String opeTrans() {
        return null;
    }

    @Override
    public String addRegs() {
        return null;
    }

    @Override
    public String canRegs() {
        return null;
    }

    @Override
    public String delRegs() {
        return null;
    }

    @Override
    public String selRegs() {
        return null;
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
