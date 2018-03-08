package com.example.diego.LeiturApp.modelos;

import com.orm.SugarRecord;

/**
 * Created by edson on 05/03/18.
 */

public class Livro extends SugarRecord{

    private String titulo;
    private int ano;
    private Autor autor;
    private String status;
    private String opiniao;
    private int numeroPaginas;
    private int atualPagina;
    private int progresso;

    public int getAtualPagina() {
        return atualPagina;
    }

    public void setAtualPagina(int atualPagina) {
        this.atualPagina = atualPagina;
    }

    public int getProgresso() {
        return progresso;
    }


    public Livro(){

    }

    public Livro(String titulo, int ano, Autor autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public  String getTitulo(){
        return titulo;
    }

    public int getAno(){
        return  ano;
    }
    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", autor=" + autor +
                ", status='" + status + '\'' +
                ", opiniao='" + opiniao + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", atualPagina=" + atualPagina +
                ", progresso=" + progresso +
                '}';
    }
}
