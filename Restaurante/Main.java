package Restaurante;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente(
                "alex@gmail.com",
                "123"
        );

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (!cliente.validarLogin(email, senha)) {
            System.out.println("Usuário ou senha inválidos.");
            return;
        }

        Produto hamburguer = new Produto("Hamburguer", 25);
        Produto pizza = new Produto("Pizza", 40);
        Produto refrigerante = new Produto("Refrigerante", 8);

        Pedido pedido = new Pedido();

        System.out.println("CARDÁPIO");
        System.out.println("1 - Hamburguer R$25");
        System.out.println("2 - Pizza R$40");
        System.out.println("3 - Refrigerante R$8");

        System.out.print("\nQuantos produtos deseja comprar? ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            System.out.print("Escolha o produto " + i + ": ");
            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    pedido.adicionarProduto(hamburguer);
                    break;

                case 2:
                    pedido.adicionarProduto(pizza);
                    break;

                case 3:
                    pedido.adicionarProduto(refrigerante);
                    break;

                default:
                    System.out.println("Produto inválido!");
                    i--;
            }
        }

        double total = pedido.calcularTotal();

        System.out.println("\nTotal do pedido: R$" + total);

        if (total < 50) {
            System.out.println("Taxa de entrega: R$8,00");
        } else {
            System.out.println("Frete grátis!");
        }

        System.out.println("PAGAMENTO");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão");
        System.out.println("3 - Dinheiro");

        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = sc.nextInt();

        Pagamento pagamento = new Pagamento();

        if (!pagamento.validarPagamento(formaPagamento)) {
            System.out.println("Pagamento não autorizado.");
            return;
        }

        int numeroPedido = (int) (Math.random() * 1000);

        System.out.println("\nPedido Nº " + numeroPedido);
        System.out.println("Pedido enviado para cozinha.");
        System.out.println("Status: Em preparação.");
        System.out.println("Pedido realizado com sucesso.");

        sc.close();
    }
}
