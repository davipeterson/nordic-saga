package br.davipeterson.nordic.thor;

import java.util.ArrayList;
import java.util.List;

public class Artefato {
    private String nome;
    private String objeto;
    private String material;
    private boolean destruido;
    private List<Poder> poderes = new ArrayList<Poder>();
    private Ser dono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    public Ser getDono() {
        return dono;
    }

    public void setDono(Ser dono) {
        this.dono = dono;
    }
}
