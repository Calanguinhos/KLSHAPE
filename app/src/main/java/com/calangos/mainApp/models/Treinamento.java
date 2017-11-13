package com.calangos.mainApp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 25/10/17.
 */

public class Treinamento {

    private int atleta;
    private int intrutor;
    private List<Integer> exercicio;
    private int notificacoes;

    public Treinamento() {
        this.atleta = -1;
        this.intrutor = -1;
        this.exercicio = new ArrayList<>();
        this.notificacoes = -1;
    }

    public int getAtleta() {
        return atleta;
    }

    public void setAtleta(int atleta) {
        this.atleta = atleta;
    }

    public int getIntrutor() {
        return intrutor;
    }

    public void setIntrutor(int intrutor) {
        this.intrutor = intrutor;
    }

    public List<Integer> getExercicio() {
        return exercicio;
    }

    public void setExercicio(List<Integer> exercicio) {
        this.exercicio = exercicio;
    }

    public int getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(int notificacoes) {
        this.notificacoes = notificacoes;
    }
}
