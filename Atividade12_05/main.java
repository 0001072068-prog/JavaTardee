package Atividade12_05;

public class main {
    public String name;
    public double price;
    public int Quantity;

    public double totalValueInStock(){
        return price * Quantity;
    }
    public void adicionarProduto(int quantity) {
        Quantity += quantity;
    }
    public void removerProduto(int quantityA){
        Quantity -= quantityA;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + Quantity
                + " unidade, total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
