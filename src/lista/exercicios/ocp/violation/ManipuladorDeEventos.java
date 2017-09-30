package lista.exercicios.ocp.violation;

public class ManipuladorDeEventos {

    private Veiculo veiculo;

    public ManipuladorDeEventos(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void mudarModoDirecao(final ModoDirecao modoDirecao){
        modoDirecao.mudarModoDirecao(veiculo);
    }
}
