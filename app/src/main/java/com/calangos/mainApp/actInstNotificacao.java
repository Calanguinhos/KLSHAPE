package com.calangos.mainApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by rafael on 31/10/17.
 */

public class actInstNotificacao extends Activity {

    private ListView lsvNotificacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrutor_notificacao);

        lsvNotificacoes = findViewById(R.id.listViewNotificacoes);

        //TODO METODOS DE CARREGAMENTO DOS ITENS DA LISTA
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
