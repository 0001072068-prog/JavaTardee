package Restaurante;

public class Pedido {

    private double total = 0;

    public void adicionarProduto(Produto produto) {
        total += produto.getPreco();
    }

    public double calcularTotal() {

        if (total < 50) {
            total += 8;
        }

        return total;
    }
}
