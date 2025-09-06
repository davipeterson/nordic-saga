package br.davipeterson.nordic.thor;

import java.util.Date;

public abstract class Mortal extends Ser {
    private Date nascimento;
    private Divindade hospedeiro;

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Divindade getHospedeiro() {
        return hospedeiro;
    }

    public void setHospedeiro(Divindade hospedeiro) {
        this.hospedeiro = hospedeiro;
    }

}
