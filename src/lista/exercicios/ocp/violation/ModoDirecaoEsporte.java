package lista.exercicios.ocp.violation;

public class ModoDirecaoEsporte implements ModoDirecao {

  private final int potencia;
  private final int alturaSuspencao;

  public ModoDirecaoEsporte() {
    this.potencia = 400;
    this.alturaSuspencao = 10;
  }

  public void mudarModoDirecao(Veiculo veiculo) {
    veiculo.setPotencia(potencia);
    veiculo.setAlturaSuspencao(alturaSuspencao);
  }
}
