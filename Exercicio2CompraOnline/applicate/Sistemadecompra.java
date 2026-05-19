package Exercicio2CompraOnline.applicate;

import Exercicio2CompraOnline.entitie.Produtos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Sistemadecompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produtos> carrinho = new ArrayList<>();


        carrinho.add(new Produtos("Monitor Gamer", 450.00));
        carrinho.add(new Produtos("Mouse Pad", 60.00));

        // Passo 2: Calcular valor total [cite: 46]
        double valorProdutos = 0;
        for (Produtos p : carrinho) {
            valorProdutos += p.getPreco();
        }


        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("CPF: "); String cpf = scanner.nextLine();
        System.out.print("Endereço: "); String endereco = scanner.nextLine();
        System.out.print("Forma de Pagamento (Cartão): "); String pagamento = scanner.nextLine();


        double frete = (valorProdutos > 500.00) ? 0.0 : 25.00;
        double valorTotal = valorProdutos + frete;

        System.out.println("Subtotal: R$ " + valorProdutos);
        System.out.println("Frete: R$ " + frete);
        System.out.println("Total a pagar: R$ " + valorTotal);


        System.out.print("\nSimular aprovação do cartão? (S/N): ");
        String status = scanner.nextLine();

        if (status.equalsIgnoreCase("N")) {

            System.out.println("Pagamento não autorizado.");
            System.out.println("Pedido encerrado.");
        } else {

            int numeroPedido = new Random().nextInt(10000);
            System.out.println("Número do pedido: #" + numeroPedido);
            System.out.println("Compra realizada com sucesso.");
        }

        scanner.close();
    }
}