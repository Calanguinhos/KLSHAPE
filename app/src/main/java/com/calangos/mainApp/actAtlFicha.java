package com.calangos.mainApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by rafag on 14/11/2017.
 */

public class actAtlFicha extends Activity {

    private ListView lsvListaFichas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_fichas);

        Toast.makeText(getApplicationContext(), "Clique na ficha para apagar!", Toast.LENGTH_SHORT).show();

        lsvListaFichas = findViewById(R.id.listViewFichas);
        String[] ficha = new String[]{"Classe: \nParte Superior \n\nTipo: \nPeitoral \n\nExercicio: \nSupino com barra"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ficha);
        lsvListaFichas = findViewById(R.id.listViewFichas);
        lsvListaFichas.setAdapter(adapter);
        lsvListaFichas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        String[] ficha = new String[]{};
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, ficha);
                        lsvListaFichas = findViewById(R.id.listViewFichas);
                        lsvListaFichas.setAdapter(adapter);
                        finish();
                        break;
                }
            }
        });
    }
}
