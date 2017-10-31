package com.calangos.mainApp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by rafael on 31/10/17.
 */

public class actMenuAtleta extends Activity {

     private ImageView btnEnvNot;
    private ImageButton btnRecFor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_atleta);

        btnEnvNot = findViewById(R.id.imageView17);
        btnEnvNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "NOTIFICAÇÃO ENVIADA", Toast.LENGTH_SHORT).show();
            }
        });

        btnRecFor = findViewById(R.id.imageButton8);
        btnRecFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "SEM FICHA CADASTRADA", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
