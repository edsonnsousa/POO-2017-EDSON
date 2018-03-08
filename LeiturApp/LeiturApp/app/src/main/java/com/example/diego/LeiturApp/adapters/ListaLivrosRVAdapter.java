package com.example.diego.LeiturApp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diego.LeiturApp.FormularioLivroActivity;
import com.example.diego.LeiturApp.InfoActivity;
import com.example.diego.LeiturApp.R;
import com.example.diego.LeiturApp.modelos.Livro;

import java.util.List;

/**
 * Created by edson on 04/03/18.
 */

public class ListaLivrosRVAdapter extends RecyclerView.Adapter<ListaLivrosRVAdapter.ViewHolder> {

    private final Context context;
    private final List<Livro> livros;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_livros,parent,false);

       ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final Livro livro = this.livros.get(position);
        holder.tvLivroTitulo.setText(livro.getTitulo());
        holder.tvLivroAno.setText(""+livro.getAno());
        holder.tvLivroTitulo.setText(livro.getTitulo());
        holder.tvLivroAno.setText(""+livro.getAno());
        try {
            holder.tvLivroAutor.setText(livro.getAutor().getNome());
        }catch (NullPointerException e){
            holder.tvLivroAutor.setText("Nao declarado");
        }
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Livro: " + livro.getTitulo(), Snackbar.LENGTH_LONG).show();
                Intent intent=new Intent(context, InfoActivity.class);
                intent.putExtra("livro",livro.getId());
                context.startActivity(intent);

            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                PopupMenu pop = new PopupMenu(context,view);
                MenuInflater inflater = pop.getMenuInflater();

                inflater.inflate(R.menu.menu_lista_livros, pop.getMenu());

                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        if(menuItem.getItemId() == R.id.item_excluir_livro){
                            livro.delete();
                            ListaLivrosRVAdapter.this.livros.remove(position);
                            ListaLivrosRVAdapter.this.notifyItemRemoved(position);
                            ListaLivrosRVAdapter.this.notifyItemChanged(position,ListaLivrosRVAdapter.this.livros.size());
                            Toast.makeText(context, "Removido", Toast.LENGTH_SHORT).show();
                        }

                        if(menuItem.getItemId() == R.id.item_editar_livro){
                            Intent intent = new Intent(context, FormularioLivroActivity.class);
                            intent.putExtra("livro", livro.getId());
                            context.startActivity(intent);
                        }


                        return false;
                    }
                });

                pop.show();

                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return livros.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder{

        protected TextView tvLivroTitulo;
        protected TextView tvLivroAno;
        protected TextView tvLivroAutor;
        protected TextView tvNumpag;

        public ViewHolder(View itemView){
            super(itemView);

            tvLivroTitulo = (TextView) itemView.findViewById(R.id.tv_livro_titulo);
            tvLivroAno = (TextView) itemView.findViewById(R.id.tv_livro_ano);
            tvLivroAutor = (TextView) itemView.findViewById(R.id.tv_livro_autor);

        }

    }

    public ListaLivrosRVAdapter(Context context, List<Livro>livros){


        this.context = context;
        this.livros = livros;
    }

}
