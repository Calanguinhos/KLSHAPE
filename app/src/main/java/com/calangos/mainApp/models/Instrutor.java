package com.calangos.mainApp.models;

import com.calangos.mainApp.utils._Pessoa;

/**
 * Created by rafael on 25/10/17.
 */

public class Instrutor extends _Pessoa {

    public Instrutor() {
        super();
        this.setId(-1);
        this.setNome("");
        this.setAtivo(0);
        this.setCpf(0);
        this.setRg(0);
        this.setEmail("");
        this.setEndereco("");
        this.setSenha("");
    }


}
