package br.davipeterson.nordic.thor;

public class Cidade extends Territorio {
    private boolean geraEnergia;
    private boolean abandonado;

    public boolean isGeraEnergia() {
        return geraEnergia;
    }

    public void setGeraEnergia(boolean geraEnergia) {
        this.geraEnergia = geraEnergia;
    }

    public boolean isAbandonado() {
        return abandonado;
    }

    public void setAbandonado(boolean abandonado) {
        this.abandonado = abandonado;
    }

}
