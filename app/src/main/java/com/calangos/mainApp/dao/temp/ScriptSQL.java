package com.calangos.mainApp.dao.temp;

/**
 * Created by Pichau on 30/10/2017.
 */

public class ScriptSQL {

    public String getCreateALUNOS(){


        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE ALUNOS (");
        sqlBuilder.append( "Id_Alunos    INTEGER    NOT NULL PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("Alu_Nome   VARCHAR(50) NOT NULL,");
        sqlBuilder.append("Alu_RG     VARCHAR(9)  NOT NULL,");
        sqlBuilder.append("Alu_CPF    VARCHAR(9)  NOT NULL,");
        sqlBuilder.append("Alu_endereco VARCHAR(50) NOT NULL,");
        sqlBuilder.append("Alu_Email_ VARCHAR(60) NOT NULL,");
        sqlBuilder.append("Alu_Senha    VARCHAR(25) NOT NULL);");

        return sqlBuilder.toString();

    }

    public String getCreateEXERCICIOS(){
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE EXERCICIOS(");
        sqlBuilder.append("Id_Exercicios    INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("Exe_Nome VARCHAR(45) NOT NULL,");
        sqlBuilder.append("Exe_Data Date NOT NULL);");

        return sqlBuilder.toString();
    }


    public String getCreateNOTIFICACOES(){
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE NOTIFICACOES(");
        sqlBuilder.append("Id_Notifiacoes   INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("Not_Nome VARCHAR(45) NOT NULL,");
        sqlBuilder.append("Not_Descricao VARCHAR(45) NOT NULL,");
        sqlBuilder.append("Not_Tipo VARCHAR(45) NOT NULL,");
        sqlBuilder.append("ALunos_Id_Alunos  INT FOREING KEY,");
        sqlBuilder.append("Instrutores_Id_Instrutores INT FOREING KEY);");

        return sqlBuilder.toString();

    }

    public String getCreateINSTRUTORES(){
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE INSTRUTORES(");
        sqlBuilder.append("Id_Instrutores INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("Ins_Nome VARCHAR(45) NOT NULL,");
        sqlBuilder.append("Ins_RG VARCHAR(9) NOT NULL,");
        sqlBuilder.append("Ins_CPF VARCHAR(9) NOT NULL,");
        sqlBuilder.append("Ins_Endereco VARCHAR(45) NOT NULL,");
        sqlBuilder.append("Ins_Email VARCHAR(45) NOT NULL,");
        sqlBuilder.append("Ins_Senha VARCHAR(45) NOT NULL);");
        return sqlBuilder.toString();

    }

    public String getCreateTREINAMENTOS(){
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE TREINAMENTOS(");
        sqlBuilder.append("Id_Treinamentos INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("Notificacoes_Id_Notificacoes INT FOREING KEY,");
        sqlBuilder.append("Notificacoes_Alunos_Id_Alunos INT FOREING KEY,");
        sqlBuilder.append("Notificacoes_Instrutores_id_Instrutor INT FOREING KEY,");
        sqlBuilder.append("Exercicios_Id_Exercicio INT FOREING KEY);");
        return sqlBuilder.toString();

    }






    }
