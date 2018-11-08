package com.morr.tiago.cardapio;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_lista_bebidas);

        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p = new Produto("teste","asd",R.drawable.amstel);
        produtos.add(p);

        ListView lista = (ListView) findViewById(R.id.lista);
        OpcoesBebidasAdapter adapter = new OpcoesBebidasAdapter(this,produtos);
        lista.setAdapter(adapter);

    }
//    private ArrayList<Produto> adicionarOpcoesBebidas() {
//        ArrayList<Produto> escolas = new ArrayList<Produto>();
//        Produto /*e = new Produto ("Amstel",
//                ”R$ 7,00", R.drawable.amstel);
//                Produto.add(e);*/
//        e = new Produto("Bohemia",
//                "R$ 8,00", R.drawable.bohemia);
//        /*escolas.add(e);
//        e = new Escola("Escola Tobias Barreto",
//                "Av. Otoniel Dórea", R.drawable.escola1);
//        escolas.add(e);
//        e = new Escola("Colegio Estadual Prof G Rollemberg Leite",
//                "R. Franklin de Campos Sobral, 1675", R.drawable.goncalo);
//        escolas.add(e);*/
//        return Produto;
//    }
}
