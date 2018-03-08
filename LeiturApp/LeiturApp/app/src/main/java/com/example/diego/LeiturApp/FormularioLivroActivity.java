package com.example.diego.LeiturApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.diego.LeiturApp.modelos.Autor;
import com.example.diego.LeiturApp.modelos.Livro;

import java.util.ArrayList;
import java.util.List;

public class FormularioLivroActivity extends AppCompatActivity {

    private EditText edLivroTitulo;
    private EditText edLivroAno;
    private EditText numPaginas;
    //private Spinner spStatus;
    private AutoCompleteTextView acLivroAutor;
    private Autor autorSelecionado;
    private Livro livro;
    private long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_livro);

        this.livro = new Livro();
        this.livro.setAutor(new Autor());
        Intent intent = getIntent();

        edLivroTitulo = (EditText) findViewById(R.id.ed_livro_titulo);
        edLivroAno = (EditText) findViewById(R.id.ed_livro_ano);
        acLivroAutor = (AutoCompleteTextView) findViewById(R.id.ac_livro_autor);
        numPaginas = (EditText)findViewById(R.id.ed_num_paginas);

        acLivroAutor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                autorSelecionado = (Autor) adapterView.getItemAtPosition(position);
            }
        });

        this.id = intent.getLongExtra("livro", 0);

        if (this.id > 0) {
            this.livro = Livro.findById(Livro.class,this.id);
            this.autorSelecionado = this.livro.getAutor();
            edLivroTitulo.setText(this.livro.getTitulo());
            edLivroAno.setText(String.valueOf(this.livro.getAno()));
            acLivroAutor.setText((this.livro.getAutor().getNome()));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Autor> autorList = Autor.listAll(Autor.class);
        List<Autor> tempList  = new ArrayList<>();

        for (Autor autor: autorList){
            if(autor.getId() != 2000L){
                tempList.add(autor);
            }
        }

        autorList = tempList;

        ArrayAdapter<Autor> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,autorList);
        acLivroAutor.setAdapter(adapter);
    }

    public void salvarLivro(View view) {

        final String titulo = edLivroTitulo.getText().toString();
        /*
        if(this.autorSelecionado == null){
            Autor autor = new Autor();
            autor.save();
            this.autorSelecionado = autor;
        }
        */
        this.livro.setTitulo(titulo);
        this.livro.setAno(Integer.valueOf(edLivroAno.getText().toString()));

        this.livro.setAutor(autorSelecionado);
        this.livro.setNumeroPaginas(Integer.valueOf(numPaginas.getText().toString()));

        Log.d("Teste", "Str: " + this.livro);

        Toast.makeText(this, "Salvou!\n"+this.livro, Toast.LENGTH_SHORT).show();

        this.livro.save();

        finish();
    }

}



















