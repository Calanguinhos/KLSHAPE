package com.calangos.mainApp.models;

import android.content.Context;
import android.widget.Toast;

import com.calangos.mainApp.MainActivity;
import com.calangos.mainApp.dao.DB;
import com.calangos.mainApp.dao.webService;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rafael on 25/10/17.
 */

public class cAtleta extends cPessoa {

    private String comando = "";

    public cAtleta() {
        super();
        this.setId(-1);
        this.setNome("");
        this.setEmail("");
        this.setSenha("");
        this.setRg(0);
        this.setCpf(0);
        this.setAtivo(0);
    }

    public void salvar(){
        HashMap<String, String> data = new HashMap<>();

        data.put("alu_nome", getNome());
    }

    public void apagar(){
        comando = String.format("DELETE FROM ALUNOS WHERE id = %d;",this.getId());
        DB db = new DB();
        db.execute(comando);
        this._mensagem = db.get_mensagem();
        this._status = db.is_status();
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
}
