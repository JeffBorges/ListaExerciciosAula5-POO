package lista.exercicios.srp.violation;

public class PostoCombustivel {

  private int    quantidadeCombustivelEstoque;
  private double valorCombustivel;

  public PostoCombustivel(int quantidadeCombustivel, double valorCombustivel) {
    this.quantidadeCombustivelEstoque = quantidadeCombustivel;
    this.valorCombustivel = valorCombustivel;
  }

  public double completarTanque(Veiculo veiculo) {
    int capacidadeTanque = veiculo.getCapacidadeCombustivel();
    int quantidadeAbastecer = capacidadeTanque > quantidadeCombustivelEstoque ? quantidadeCombustivelEstoque : capacidadeTanque;
    return diminuirEstoqueECalcularValor(veiculo.abastecer(quantidadeAbastecer));
  }

  private Double diminuirEstoqueECalcularValor(int quantidadeAbastecida) {
    diminuitEstoque(quantidadeAbastecida);
    return valorCombustivel * quantidadeAbastecida;
  }

  private void diminuitEstoque(int quantidadFaltante) {
    this.quantidadeCombustivelEstoque -= quantidadFaltante;
  }

  public double abastecer(Veiculo veiculo, int quantidadeCombustivel) {
    quantidadeCombustivel = quantidadeCombustivel > quantidadeCombustivelEstoque ? quantidadeCombustivelEstoque :quantidadeCombustivel;
    return diminuirEstoqueECalcularValor(veiculo.abastecer(quantidadeCombustivel));
  }

}
