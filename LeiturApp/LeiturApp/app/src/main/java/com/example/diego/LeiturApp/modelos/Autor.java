package com.example.diego.LeiturApp.modelos;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.util.List;

/**
 * Created by edson on 05/03/18.
 */

public class Autor extends SugarRecord{
    private String nome;
    private String pais;

    public Autor(){
        this.nome = "Desconhecido";
        this.pais = "Desconhecido";
        setId(2000L);
    }

    public Autor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return this.getNome()+"||"+this.getPais();
    }
}
