package com.calangos.mainApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by rafael on 31/10/17.
 */

public class actMenuTreinador extends Activity {

    private ImageButton btnCriarFichas, btnNotificacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_treinador);

        btnCriarFichas = findViewById(R.id.imageButtonCriarFichas);
        btnNotificacoes = findViewById(R.id.imageButtonNotificacoes);

        btnCriarFichas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(actMenuTreinador.this, actInsFicha.class);
                startActivity(a);
            }
        });

        btnNotificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(actMenuTreinador.this, actInstNotificacao.class);
                startActivity(a);
            }
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
