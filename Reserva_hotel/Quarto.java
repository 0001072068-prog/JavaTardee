package Reserva_hotel;

public class Quarto {

    private String tipo;
    private double valorDiaria;

    public Quarto(String tipo, double valorDiaria) {
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}
