package com.calangos.mainApp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 25/10/17.
 */

public class Treinamento {

    private Atleta atleta;
    private Instrutor intrutor;
    private List<Exercicio> exercicio;
    private Notificacoes notificacoes;

    public Treinamento() {
        this.atleta = new Atleta();
        this.intrutor = new Instrutor();
        this.exercicio = new ArrayList<>();
        this.notificacoes = new Notificacoes();
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta Atleta) {
        this.atleta = Atleta;
    }

    public Instrutor getIntrutor() {
        return intrutor;
    }

    public void setIntrutor(Instrutor intrutor) {
        this.intrutor = intrutor;
    }

    public List<Exercicio> getExercicio() {
        return exercicio;
    }

    public void setExercicio(List<Exercicio> exercicio) {
        this.exercicio = exercicio;
    }

    public Notificacoes getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(Notificacoes notificacoes) {
        this.notificacoes = notificacoes;
    }
}
