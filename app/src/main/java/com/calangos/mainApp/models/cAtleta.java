package com.calangos.mainApp.models;

import android.content.Context;
import android.widget.Toast;

import com.calangos.mainApp.MainActivity;
import com.calangos.mainApp.dao.DB;

import java.sql.ResultSet;
import java.util.ArrayList;
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

        if (this.getId() == -1){
            setComando(String.format("INSERT INTO `klshape`.`ALUNOS` (`ALU_NOME`, `ALU_RG`, `ALU_CPF`, `ALU_ENDERECO`, `ALU_ATIVO`, `ALU_EMAIL`, `ALU_SENHA`)" +
                            "VALUES ('%s','%d','%d','%s','%d','%s','%s');",
                    this.getNome(),this.getRg(),this.getCpf(),this.getEndereco(),1,this.getEmail(),this.getSenha()));
        }else{
            setComando(String.format("UPDATE ALUNOS SET ALU_NOME = '%s', " +
                            "ALU_EMAIL = '%s', " +
                            "ALU_SENHA = '%s', " +
                            "ALU_ENDERECO = '%s', " +
                            "ALU_RG = '%d', " +
                            "ALU_CPF = '%d'," +
                            "ALU_ATIVO = 1 " +
                            "WHERE ID_ALUNOS = %d;",
                    this.getNome(),this.getEmail(),this.getSenha(),this.getEndereco(),this.getRg(),this.getCpf(),this.getId()));
        }
        DB db = new DB();
        db.execute(getComando());
        this._mensagem = db.get_mensagem();
        this._status = db.is_status();
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
