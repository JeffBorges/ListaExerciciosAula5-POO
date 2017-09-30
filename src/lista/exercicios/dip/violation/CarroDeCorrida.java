package lista.exercicios.dip.violation;

public class CarroDeCorrida implements Carro {

    private final int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;
    private int potencia;

    public CarroDeCorrida(final int combustivel) {
        this.capacidadeTanqueCombustivel = combustivel;
        this.quantidadeCombustivel = combustivel;
    }

    public void acelerar(){
        potencia++;
        quantidadeCombustivel--;
    }

}
