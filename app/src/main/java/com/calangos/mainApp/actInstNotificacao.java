package com.calangos.mainApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
        String[] solicitacao = new String[]{"ME AJUDA A EMAGRECER!!!"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, solicitacao);
        lsvNotificacoes = findViewById(R.id.listViewNotificacoes);
        lsvNotificacoes.setAdapter(adapter);
        lsvNotificacoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), actInsFicha.class);
                        startActivity(intent);
                        String[] solicitacao = new String[]{};
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, solicitacao);
                        lsvNotificacoes = findViewById(R.id.listViewNotificacoes);
                        lsvNotificacoes.setAdapter(adapter);
                        break;
                }
            }
        });

        //TODO METODOS DE CARREGAMENTO DOS ITENS DA LISTA
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
