package Reserva_hotel;

public class Reserva {

    private Quarto quarto;
    private int diarias;

    public Reserva(Quarto quarto, int diarias) {
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public double calcularTotal() {

        double total = quarto.getValorDiaria() * diarias;

        if (diarias > 5) {
            total *= 0.90; // desconto de 10%
        }

        return total;
    }
}
