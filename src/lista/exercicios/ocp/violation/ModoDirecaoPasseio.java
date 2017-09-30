package lista.exercicios.ocp.violation;

public class ModoDirecaoPasseio implements ModoDirecao {
  private final int potencia;
  private final int alturaSuspencao;

  public ModoDirecaoPasseio() {
    this.potencia = 500;
    this.alturaSuspencao = 10;
  }

  public void mudarModoDirecao(Veiculo veiculo) {
    veiculo.setPotencia(potencia);
    veiculo.setAlturaSuspencao(alturaSuspencao);
  }
}
