package lista.exercicios.isp.violation;

public class Carro extends Veiculo implements RadioAcessivel {

  private boolean radioOn;

  public boolean isRadioOn() {
    return radioOn;
  }

  @Override
  public void ligarRadio() {
    radioOn = true;
  }

  @Override
  public void desligarRadio() {
    radioOn = false;
  }

}
