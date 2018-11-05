package com.morr.tiago.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcoes_bebidas);

        ListView lista = (ListView) findViewById(R.id.opcoes_bebidas);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.cervejas, android.R.layout.simple_expandable_list_item_1);
        lista.setAdapter(adapter);

    }
    private ArrayList<OpcoesBebidas> adicionarOpcoesBebidas() {
        ArrayList<OpcoesBebidas> escolas = new ArrayList<OpcoesBebidas>();
        OpcoesBebidas /*e = new OpcoesBebidas ("Amstel",
                ”R$ 7,00", R.drawable.amstel);
                OpcoesBebidas.add(e);*/
        e = new OpcoesBebidas("Bohemia",
                "R$ 8,00", R.drawable.bohemia);
        /*escolas.add(e);
        e = new Escola("Escola Tobias Barreto",
                "Av. Otoniel Dórea", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Colegio Estadual Prof G Rollemberg Leite",
                "R. Franklin de Campos Sobral, 1675", R.drawable.goncalo);
        escolas.add(e);*/
        return OpcoesBebidas;
    }
}
