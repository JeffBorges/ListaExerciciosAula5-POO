package lista.exercicios.dip.violation;

public class Piloto {

    private Carro carro;

    public Piloto(Carro carro){
        this.carro = carro;
    }

    public void aumentaVelocidade(){
        carro.acelerar();
    }
}
