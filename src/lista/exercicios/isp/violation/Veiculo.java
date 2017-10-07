package lista.exercicios.isp.violation;

public abstract class Veiculo implements LigaDesliga {

    private boolean motorLigado;

    public boolean isMotorRodando() {
		return motorLigado;
	}

    @Override
    public void ligar() {
        motorLigado = true;
    }

    @Override
    public void desligar() {
        motorLigado = false;
    }

}
