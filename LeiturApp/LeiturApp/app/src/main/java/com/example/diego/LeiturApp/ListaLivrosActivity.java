package com.example.diego.LeiturApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.diego.LeiturApp.adapters.ListaLivrosRVAdapter;
import com.example.diego.LeiturApp.modelos.Livro;

import java.util.List;

public class ListaLivrosActivity extends AppCompatActivity {

    private RecyclerView rvLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_livros);

        rvLivros = (RecyclerView) findViewById(R.id.rv_livros);

    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Livro> livros = Livro.listAll(Livro.class);

        //Adapter
        ListaLivrosRVAdapter adapter = new ListaLivrosRVAdapter(this,livros);
        rvLivros.setAdapter(adapter);

        //LayoutManager
        rvLivros.setLayoutManager(new LinearLayoutManager(this));
    }

    public void abrirformulario(View view) {
        Intent intent = new Intent(this, FormularioLivroActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.actionbar_lista_livros,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if (item.getItemId() == R.id.item_listar_autores){
            //Toast.makeText(this,"Abrir lista de autores", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,ListaAutoresActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
