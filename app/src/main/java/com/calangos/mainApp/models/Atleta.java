package com.calangos.mainApp.models;

import com.calangos.mainApp.utils._Pessoa;

/**
 * Created by rafael on 25/10/17.
 */

public class Atleta extends _Pessoa {

    public Atleta() {
        super();
        this.setId(-1);
        this.setNome("");
        this.setEmail("");
        this.setSenha("");
        this.setRg(0);
        this.setCpf(0);
        this.setAtivo(0);
    }

}
