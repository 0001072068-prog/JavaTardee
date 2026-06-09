package Controle_de_estacionamento;

public class Estacionamento {
    private int vagasDisponiveis;

    public Estacionamento(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public boolean temVaga() {
        return vagasDisponiveis > 0;
    }

    public void registrarEntrada() {
        vagasDisponiveis--;
    }

    public void registrarSaida() {
        vagasDisponiveis++;
    }

    public double calcularValor(int horas) {
        if (horas <= 1) {
            return 10.0;
        }
        return 10.0 + (horas - 1) * 5.0;
    }
}
