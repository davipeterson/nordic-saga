package br.eng.nordic.thor;

public abstract class Divindade extends Ser {
    private String sexo;
    private String fraqueza;
    private String governa;
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getFraqueza() {
        return fraqueza;
    }
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    public String getGoverna() {
        return governa;
    }
    public void setGoverna(String governa) {
        this.governa = governa;
    }
}
