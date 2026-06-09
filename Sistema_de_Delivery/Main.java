package Sistema_de_Delivery;

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

        System.out.println("1 - Pizza (R$40)");
        System.out.println("2 - Hambúrguer (R$60)");

        int opcao = sc.nextInt();

        Produto produto;

        if (opcao == 1) {
            produto = new Produto("Pizza", 40);
        } else {
            produto = new Produto("Hambúrguer", 60);
        }

        Pedido pedido = new Pedido(produto);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Total: R$ " + pedido.calcularTotal());

        System.out.print("Pagamento aprovado? (true/false): ");
        boolean aprovado = sc.nextBoolean();

        if (!aprovado) {
            System.out.println("Pagamento não autorizado.");
            return;
        }

        System.out.println("Pedido realizado com sucesso.");
    }
}
