package br.eng.nordic.thor;

public class Deus extends Divindade {
    private String designacao;
    private Divindade deus;
    public String getDesignacao() {
        return designacao;
    }
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    public Divindade getDeus() {
        return deus;
    }
    public void setDeus(Divindade deus) {
        this.deus = deus;
    }
}
