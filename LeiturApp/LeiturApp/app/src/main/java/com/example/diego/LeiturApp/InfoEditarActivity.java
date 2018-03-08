package com.example.diego.LeiturApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.diego.LeiturApp.modelos.Livro;

public class InfoEditarActivity extends AppCompatActivity {
    private TextView titulo;
    private TextView autor;
    private EditText statusLeitura;
    private EditText atualPagina;
    private ProgressBar progressBar;
    private TextView opiniao;
    private int progresso;
    private int totalpaginas;
    private Livro livro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_editar);


        titulo = (TextView) findViewById(R.id.txt_editar_titulo);
        autor = (TextView) findViewById(R.id.txt_editar_autor);
        statusLeitura = (EditText) findViewById(R.id.editar_informacao_status);
        atualPagina = (EditText) findViewById(R.id.editar_informacao_pagina);
        progressBar = (ProgressBar) findViewById(R.id.editar_progeresso);
        opiniao = (TextView) findViewById(R.id.txt_editar_comentarios);

        Intent intent = getIntent();
        long id = intent.getLongExtra("livro",0);

        this.livro = Livro.findById(Livro.class,id);

    }

    public void atualizar(View view) {

        livro.setAtualPagina(Integer.valueOf(atualPagina.getText().toString()));
        progresso = (Integer.valueOf(atualPagina.getText().toString()) * 100)/livro.getNumeroPaginas();
        livro.setStatus(statusLeitura.getText().toString());
        livro.setProgresso(progresso);
        livro.save();
    }
}
