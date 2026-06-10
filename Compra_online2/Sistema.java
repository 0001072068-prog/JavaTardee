package Compra_online2;

public class Sistema {
    private double valorCompra;
    private double frete;
    private double valorFinal;


    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }


    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }


    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }


    public void calcularFrete() {

        if (getValorCompra() > 500.0) {

            setFrete(0.0);
            System.out.println("Frete gratis.");

        } else {

            setFrete(25.0);
            System.out.println("Frete de R$ 25.00 adicionado.");
        }
    }


    public void calcularValorFinal() {

        setValorFinal(getValorCompra() + getFrete());

        System.out.printf("Valor final: R$ %.2f%n", getValorFinal());
    }


    public void finalizarCompra(String aprovacao) {

        if (aprovacao.equalsIgnoreCase("nao")) {

            System.out.println("Pagamento nao autorizado.");

        } else {

            int numeroPedido = 1001;

            System.out.println("Numero do pedido: " + numeroPedido);
            System.out.println("Compra registrada.");
            System.out.println("Confirmacao enviada.");
            System.out.println("Compra realizada com sucesso.");
        }
    }
}

