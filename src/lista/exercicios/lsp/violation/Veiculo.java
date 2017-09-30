package lista.exercicios.lsp.violation;

public class Veiculo {

  private Marcha marcha;

  public Marcha getMarcha() {
    return marcha;
  }

  protected void setMarcha(Marcha marcha) {
    this.marcha = marcha;
  }

  public void mudaMarcha(Marcha marcha) {
    if (Marcha.REVERSE.equals(marcha) && Marcha.DRIVE.equals(this.marcha)) {
      throw new RuntimeException("Nao pode mudar para REVERSE quando " + this.marcha.toString() + " marcha esta engatada!");
    }
    this.marcha = marcha;
  }
}
