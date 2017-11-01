package com.calangos.mainApp.models;

import android.content.Context;
import android.widget.Toast;

import com.calangos.mainApp.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 25/10/17.
 */

public class cAtleta extends cPessoa {

    //private MainActivity main = new MainActivity();
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

    public String valLogin(String user, String password, Context context){

        atletas = new ArrayList<>();
        // main.instrutores = new ArrayList<>();
        String result = "NEGADO";

        Toast.makeText(context, atletas.get(0).getNome(), Toast.LENGTH_SHORT).show();

        for (int i=0; i>atletas.size();i++){
            if (user == atletas.get(i).getEmail() &&
                    password == atletas.get(i).getSenha()){
                result = "LIBERADO \n" +
                        "Nome: "+atletas.get(i).getNome() +"\n" +
                        "Email: "+atletas.get(i).getEmail();
            } else {
                result = "NEGADO \n" +
                        "Nome: "+atletas.get(i).getNome() +"\n" +
                        "Email: "+atletas.get(i).getEmail();
            }
        }

        return result;

    }

}
