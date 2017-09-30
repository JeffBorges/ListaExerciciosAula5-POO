package lista.exercicios.srp.violation;

public class Tanque {

  private final int capacidade;
  private int quantidade;

  public Tanque(int capacidade) {
    this.capacidade = capacidade;
    this.quantidade = 0;
  }

  public int getCapacidade() {
    return capacidade;
  }

  /**
   * @return a quantidade faltante de combustivel
   */
  public int getQuantidadeCombustivelFaltante() {
    return this.capacidade - this.quantidade;
  }

  /**
   * abastece uma determinada quantia de combustivel
   * quanto a quantidade passa no parametro for maior que a quantidade faltante é abastecido ate completar
   * @param quantidadeCombustivel a ser abastecido
   * @return quantidade de combustivel que foi realmente abastecido
   */
  public int abastecer(int quantidadeCombustivel) {
    int faltante = getQuantidadeCombustivelFaltante();

    if (quantidadeCombustivel > faltante) {
      this.quantidade += faltante;
      return faltante;
    }
    this.quantidade += quantidadeCombustivel;
    return quantidadeCombustivel;
  }

  /**
   * utiliza o combutivel caso tenha
   * @return quantidade faltante de combustivel
   */
  public int queimarCombustivel() {
    int faltante = getQuantidadeCombustivelFaltante();
    if (getQuantidadeCombustivelFaltante() == 0) {
      return 0;
    }
    quantidade --;
    return faltante;
  }
}
