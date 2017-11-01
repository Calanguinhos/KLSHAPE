package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.webServiceClient;
import com.calangos.mainApp.models.cAtleta;
import com.calangos.mainApp.models.cInstrutor;

import java.util.ArrayList;
import java.util.List;

public class actLogin extends AppCompatActivity {

    protected EditText edtEmail, edtSenha;
    private ImageButton btnLogin;

    private cAtleta atleta = new cAtleta(0,null,0,0,null,null,null);

    //private MainActivity main = new MainActivity();

    // private List<cAtleta> atletas;
    // private List<cInstrutor> instrutores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.editText5);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = atleta.valLogin(edtEmail.getText().toString(), edtSenha.getText().toString(), getApplicationContext());
                Toast.makeText(getApplicationContext(), "Processando "+result, Toast.LENGTH_SHORT).show();

                if (result == "LIBERADO"){
                    Toast.makeText(getApplicationContext(), "O acesso foi "+result, Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(actLogin.this, actMenuAtleta.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "O acesso foi "+result, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }


}
