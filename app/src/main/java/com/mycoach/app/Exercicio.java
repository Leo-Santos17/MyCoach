package com.mycoach.app;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    private int id;
    private int treinoId;
    private String nome;
    private String tempoDescanso;
    private List<Serie> series;

    public Exercicio() {
        this.series = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTreinoId() {
        return treinoId;
    }

    public void setTreinoId(int treinoId) {
        this.treinoId = treinoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanso(String tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
}