package lista.exercicios.srp.violation;

public class Veiculo {

  private final Tanque tanque;
  private int velociadade;
  private final int velocidadeMaxima;

  public Veiculo(int capacidadeTanque, int velocidadeMaxima) {
    this.tanque = new Tanque(capacidadeTanque);
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public void acelerar() {
    int quantidadeCombustivel = tanque.queimarCombustivel();

    if (quantidadeCombustivel == 0) {
      velociadade = 0;
    } else if (velociadade < velocidadeMaxima) {
      velociadade++;
    }
  }

  public int getCapacidadeCombustivel() {
    return tanque.getCapacidade();
  }

  public int abastecer(int quantidadeCombustivel) {
    return tanque.abastecer(quantidadeCombustivel);
  }

}
