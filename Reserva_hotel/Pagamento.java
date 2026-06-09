package Reserva_hotel;

public class Pagamento {

    private boolean aprovado;

    public Pagamento(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public boolean validarPagamento() {
        return aprovado;
    }
}