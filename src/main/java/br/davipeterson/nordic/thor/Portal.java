package br.davipeterson.nordic.thor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Portal {
    private String cor;
    private Date date;
    private Territorio origem;
    private Territorio destino;
    private List<Ser> seres = new ArrayList<Ser>();
    private Artefato artefato;

    public Portal(Artefato artefato) {
        this.artefato = artefato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Territorio getOrigem() {
        return origem;
    }

    public void setOrigem(Territorio origem) {
        this.origem = origem;
    }

    public Territorio getDestino() {
        return destino;
    }

    public void setDestino(Territorio destino) {
        this.destino = destino;
    }

    public List<Ser> getSeres() {
        return seres;
    }

    public void setSeres(List<Ser> seres) {
        this.seres = seres;
    }

    public Artefato getArtefato() {
        return artefato;
    }

    public void setArtefato(Artefato artefato) {
        this.artefato = artefato;
    }

}
