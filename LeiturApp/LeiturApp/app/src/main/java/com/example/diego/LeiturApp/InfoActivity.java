package com.example.diego.LeiturApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.diego.LeiturApp.modelos.Livro;

public class InfoActivity extends AppCompatActivity {

    private TextView txt_titulo;
    private TextView txt_autor;
    private TextView statusleitura;
    private ProgressBar progresso;
    private TextView tvopiniao;
    private EditText edopniao;
    private Livro livro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        txt_titulo = (TextView) findViewById(R.id.tv_titulo_detalhes);
        txt_autor = (TextView) findViewById(R.id.tv_autor_detalhes);
        progresso = (ProgressBar) findViewById(R.id.editar_progeresso);
        tvopiniao = (TextView) findViewById(R.id.tv_opiniao);
        edopniao =(EditText) findViewById(R.id.edopniao);


        Intent intent = getIntent();
        long id = intent.getLongExtra("livro", 0);

        livro = Livro.findById(Livro.class, id);
        try {
            txt_autor.setText(livro.getAutor().getNome());
        } catch (NullPointerException e) {
            txt_autor.setText("Nao Informado");
            txt_titulo.setText(livro.getTitulo());
            progresso.setProgress(livro.getProgresso());
            edopniao.setText(livro.getOpiniao());
        }};

        public void comentar(View view){
            tvopiniao.setText(edopniao.getText().toString());
            livro.setOpiniao(edopniao.getText().toString());
            livro.save();
            edopniao.setText("");
        }


    }
