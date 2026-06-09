package Sistema_de_Delivery;

public class Pedido {
    private Produto produto;

    public Pedido(Produto produto) {
        this.produto = produto;
    }

    public double calcularTotal() {
        double total = produto.getPreco();

        if (total < 50) {
            total += 8;
        }

        return total;
    }
}