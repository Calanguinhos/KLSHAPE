package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.adapters.AtletaCRUD;
import com.calangos.mainApp.dao.adapters.InstrutorCRUD;
import com.calangos.mainApp.models.Atleta;
import com.calangos.mainApp.models.Instrutor;

public class actLogin extends AppCompatActivity {

    protected EditText edtEmail, edtSenha;
    private ImageButton btnLogin;
    private CheckBox chkbxAluno, chkbxInstrutor;
    private Atleta atleta = new Atleta();
    private Instrutor instrutor = new Instrutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        chkbxAluno = findViewById(R.id.checkBoxAluno);
        chkbxInstrutor = findViewById(R.id.checkBoxInstrutor);
        edtEmail = findViewById(R.id.editTextEmail);
        edtSenha = findViewById(R.id.editTextSenha);
        btnLogin = findViewById(R.id.imageButtonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnLoginClick();

            }
        });

    }

    private void btnLoginClick() {

        if (chkbxInstrutor.isChecked() && chkbxAluno.isChecked()){
            Toast.makeText(this, "Selecione entre Instrutor e Aluno", Toast.LENGTH_SHORT).show();
        } else if (chkbxAluno.isChecked()){
            if (edtEmail.length() == 0) {
                Toast.makeText(this, "Informe o email do aluno", Toast.LENGTH_SHORT).show();
            } else if (edtSenha.length() == 0){
                Toast.makeText(this, "Informe a senha do aluno", Toast.LENGTH_SHORT).show();
            } else {
                if (edtEmail.getEditableText() != null && edtSenha.getEditableText() != null ) {
                    atleta.setNome(edtEmail.getText().toString());
                    Intent intent = new Intent(actLogin.this, actMenuAtleta.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                }

            }
        } else if (chkbxInstrutor.isChecked()) {
            if (edtEmail.length() == 0) {
                Toast.makeText(this, "Informe o email do instrutor", Toast.LENGTH_SHORT).show();
            } else if (edtSenha.length() == 0){
                Toast.makeText(this, "Informe a senha do instrutor", Toast.LENGTH_SHORT).show();
            } else {
                if (edtEmail.getEditableText() != null && edtSenha.getEditableText() != null){
                    instrutor.setNome(edtEmail.getText().toString());
                    Intent a = new Intent(actLogin.this, actMenuTreinador.class);
                    startActivity(a);
                    finish();
                } else {
                    Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                }

            }
        } else {
            Toast.makeText(this, "Informe se é um Instrutor ou Aluno", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }


}
