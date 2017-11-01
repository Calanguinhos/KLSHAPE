package com.calangos.mainApp.models;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 25/10/17.
 */

public class cAtleta extends cPessoa {

    List<cAtleta> atletas;

    public cAtleta(int id, String nome, int rg, int cpf, String email, String senha, String endereco) {
        super(id, nome, rg, cpf, email, senha, endereco);
    }

    public String addAtleta(String nome, int rg, int cpf, String email, String senha, String endereco, Context context) {

        atletas = new ArrayList<>();

        try {
            setNome(nome);
            setRg(rg);
            setCpf(cpf);
            setEndereco(endereco);
            setEmail(email);
            setSenha(senha);
        } catch (NullPointerException e) {
            Toast.makeText(context, "Você deve preencher todos os campos!!!", Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException f){
            Toast.makeText(context, "Verifique o CPF e o RG", Toast.LENGTH_SHORT).show();
        } finally {
            Toast.makeText(context, "Cadastro realizado com Sucesso!!!", Toast.LENGTH_SHORT).show();
        }

        atletas.add(this);

        return String.valueOf(atletas.get(0).getNome());

    }

}
