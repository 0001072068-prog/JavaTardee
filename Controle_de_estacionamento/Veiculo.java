package Controle_de_estacionamento;

public class Veiculo {
    private String placa;
    private String tipo;
    private int horaEntrada;

    public Veiculo(String placa, String tipo, int horaEntrada) {
        this.placa = placa;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }
}
