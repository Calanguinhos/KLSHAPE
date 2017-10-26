package com.example.pichau.projeto_tcc.dao;

import android.database.CursorJoiner;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by rafael on 25/10/17.
 *
 * Classe de conexão com o Banco
 */

public class cDts extends AsyncTask<Void, Void, Void> {

    @Override
    protected Void doInBackground(Void... voids) {
        // Utilizado para executar a tarefa em backgroud ou fazer a chamada para o webservice

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        try {
            URL url = new URL("http://pokeapi.co/api/v2/pokemon/1/");
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            String linha;
            StringBuffer buffer = new StringBuffer();
            while((linha = reader.readLine()) != null) {
                buffer.append(linha);
                buffer.append("\n");
            }

            return buffer.toString();

        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        // Usado para configurar a tarefa informada, por exemplo mostrando uma barra de progresso
    }

    @Override
    protected void onProgressUpdate (Progress... values) {
        // Utilizado para atualizar as informações na tela do usuário
    }

    @Override
    protected void onPostExecute(String dados) {

    }

}
