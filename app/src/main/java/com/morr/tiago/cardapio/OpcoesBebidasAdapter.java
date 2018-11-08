package com.morr.tiago.cardapio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OpcoesBebidasAdapter extends ArrayAdapter<Produto> {

    private final Context context;
    private final ArrayList<Produto> elementos;
    public OpcoesBebidasAdapter(Context context, ArrayList<Produto> elementos) {
        super(context, R.layout.iten_produto, elementos);
        this.context = context;
        this.elementos = elementos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.iten_produto, parent,
                false);

        TextView nomeOpcoesBebidas = (TextView) rowView.findViewById(R.id.nome);
        TextView preco = (TextView) rowView.findViewById(R.id.preco);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nomeOpcoesBebidas.setText(elementos.get(position).getNome());
        preco.setText(elementos.get(position).getPreco());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}
