package Controle_De_Estacionamento;

public class Estacionamento {

    int vagasDisponiveis = 10;

    public double calcularValor(int horas) {
        if (horas <= 1) {
            return 10.0;
        }
        return 10.0 + (horas - 1) * 5.0;
    }

    public boolean temVaga() {
        return vagasDisponiveis > 0;
    }
}