package com.calangos.mainApp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 25/10/17.
 */

public class cTreinamento {

    private cAtleta atleta;
    private cInstrutor intrutor;
    private List<cExercicio> exercicio;
    private cNotificacoes notificacoes;

    public cTreinamento() {
        this.atleta = new cAtleta();
        this.intrutor = new cInstrutor();
        this.exercicio = new ArrayList<>();
        this.notificacoes = new cNotificacoes();
    }

    public cAtleta getAtleta() {
        return atleta;
    }

    public void setAtleta(cAtleta atleta) {
        this.atleta = atleta;
    }

    public cInstrutor getIntrutor() {
        return intrutor;
    }

    public void setIntrutor(cInstrutor intrutor) {
        this.intrutor = intrutor;
    }

    public List<cExercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(List<cExercicio> exercicio) {
        this.exercicio = exercicio;
    }

    public cNotificacoes getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(cNotificacoes notificacoes) {
        this.notificacoes = notificacoes;
    }
}
