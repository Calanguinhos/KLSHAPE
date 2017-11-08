package com.calangos.mainApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.calangos.mainApp.dao.adapters.AtletaCRUD;
import com.calangos.mainApp.dao.adapters.InstrutorCRUD;
import com.calangos.mainApp.models.Atleta;
import com.calangos.mainApp.models.Instrutor;


public class actCadastro extends AppCompatActivity {

    private EditText edtNome, edtEmail, edtSenha, edtRG, edtCPF, edtEndereco;
    private Button btnCadastrar, btnLimpar;
    private RadioButton rbtnAtleta, rbtnInstrutor;
    private Atleta atleta;
    private Instrutor instrutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        this.rbtnInstrutor = findViewById(R.id.radioButtonTreinador);
        this.rbtnAtleta = findViewById(R.id.radioButtonAtleta);

        this.edtNome = findViewById(R.id.editTextNome);
        this.edtCPF = findViewById(R.id.editTextCPF);
        this.edtEmail = findViewById(R.id.editTextEmail);
        this.edtSenha = findViewById(R.id.editTextSenha);
        this.edtRG = findViewById(R.id.editTextRG);
        this.edtEndereco = findViewById(R.id.editTextEndereco);

        this.btnCadastrar = findViewById(R.id.buttonCadastrar);
        this.btnLimpar = findViewById(R.id.buttonLimpar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = "-1";
                Toast.makeText(getApplicationContext(), "Processando...", Toast.LENGTH_SHORT).show();

                if (rbtnAtleta.isChecked()) {
                    try {
                        s = cadastroAluno();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "First Error: \n" + s + "\n\nSecond Error: \n" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                } else if (rbtnInstrutor.isChecked()) {
                    try {
                        s = cadastroInstrutor();
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "First Error: \n" + s + "\n\nSecond Error: \n" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "ATENÇÃO! \n\nInforme se é um Treinador ou Aluno", Toast.LENGTH_LONG).show();
                }

                if (s == null) {
                    Intent a = new Intent(actCadastro.this, actMensagemCadastro.class);
                    startActivity(a);
                    finish();
                }
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                limpaRegistros();

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public String cadastroAluno() {
        String s = null;
        atleta = new Atleta();

        atleta.setNome(this.edtNome.getText().toString());
        atleta.setRg(Long.parseLong(this.edtRG.getText().toString()));
        atleta.setCpf(Long.parseLong(this.edtCPF.getText().toString()));
        atleta.setEndereco(this.edtEndereco.getText().toString());
        atleta.setEmail(this.edtEmail.getText().toString());
        atleta.setSenha(this.edtSenha.getText().toString());

        AtletaCRUD atletaCRUD = new AtletaCRUD(this);
        try {
            atletaCRUD.createObject();
        } catch (Exception e) {
            s = e.getMessage();
        }

        return s;
    }

    public String cadastroInstrutor() {
        String s = null;
        instrutor = new Instrutor();

        instrutor.setNome(this.edtNome.getText().toString());
        instrutor.setRg(Long.parseLong(this.edtRG.getText().toString()));
        instrutor.setCpf(Long.parseLong(this.edtCPF.getText().toString()));
        instrutor.setEndereco(this.edtEndereco.getText().toString());
        instrutor.setEmail(this.edtEmail.getText().toString());
        instrutor.setSenha(this.edtSenha.getText().toString());

        InstrutorCRUD instrutorCRUD = new InstrutorCRUD(this);
        try {
            instrutorCRUD.createObject();
        } catch (Exception e) {
            s = e.getMessage();
        }

        return s;

    }

    public void limpaRegistros() {

        Intent a = new Intent(actCadastro.this, actCadastro.class);
        startActivity(a);
        finish();

    }

}

