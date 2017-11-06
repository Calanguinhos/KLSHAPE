package com.calangos.mainApp.models.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.calangos.mainApp.R;
import com.calangos.mainApp.models.cAtleta;

import java.util.ArrayList;

/**
 * Created by rafael on 05/11/17.
 */

public class cAtletaAdapter extends ArrayAdapter<cAtleta> {
    private Context context;
    private ArrayList<cAtleta> lista;

    public cAtletaAdapter(Context context, ArrayList<cAtleta> lista) {
        super(context, 0, lista);
        this.context = context;
        this.lista = lista;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final cAtleta itemPosicao = this.lista.get(position);

        /**

        convertView = LayoutInflater.from(this.context).inflate(R.layout.item_lista, null);
        final View layout = convertView;

        TextView textView = (TextView) convertView.findViewById(R.id.textViewNome);
        textView.setText(itemPosicao.getNome());

        TextView textViewEmail = (TextView) convertView.findViewById(R.id.textViewEmail);
        textViewEmail.setText(itemPosicao.getEmail());

        TextView textViewSenha = (TextView) convertView.findViewById(R.id.textViewSenha);
        textViewSenha.setText(itemPosicao.getSenha());

        TextView textViewEndereco=(TextView)convertView.findViewById(R.id.textViewEndereco);
        textViewEndereco.setText(itemPosicao.getEndereco());

        TextView textViewRg=(TextView)convertView.findViewById(R.id.textViewRG);
        textViewRg.setText(String.valueOf(itemPosicao.getRg()));

        TextView textViewCpf=(TextView)convertView.findViewById(R.id.textViewCPF);
        textViewCpf.setText(String.valueOf(itemPosicao.getCpf()));

        Button button = (Button) convertView.findViewById(R.id.buttonEditar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NovoActivity.class);
                intent.putExtra("ALU_SENHA", itemPosicao.getSenha());
                intent.putExtra("ALU_NOME", itemPosicao.getNome());
                intent.putExtra("ALU_EMAIL", itemPosicao.getEmail());
                intent.putExtra("ALU_ENDERECO", itemPosicao.getEndereco());
                intent.putExtra("ALU_RG", itemPosicao.getRg());
                intent.putExtra("ALU_CPF", itemPosicao.getCpf());
                intent.putExtra("ID_ALUNOS", itemPosicao.getId());
                context.startActivity(intent);

            }
        });

        Button buttonDeletar = (Button) convertView.findViewById(R.id.buttonApagar);
        buttonDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemPosicao.apagar();
                if (itemPosicao._status)
                    layout.setVisibility(View.GONE);
                else
                    Toast.makeText(context, itemPosicao.get_mensagem(), Toast.LENGTH_LONG).show();
            }
        });*/

        return convertView;
    }
}
