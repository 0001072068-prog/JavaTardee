package Reserva_hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Check-in: ");
        String checkIn = sc.nextLine();

        System.out.print("Check-out: ");
        String checkOut = sc.nextLine();

        System.out.print("Quantidade de hóspedes: ");
        int hospedes = sc.nextInt();

        if (!hotel.temQuartoDisponivel()) {
            System.out.println("Nenhum quarto disponível.");
            return;
        }

        Quarto quarto = new Quarto("Luxo", 150);

        System.out.println("\nQuarto disponível: " + quarto.getTipo());
        System.out.println("Valor da diária: R$" + quarto.getValorDiaria());

        System.out.print("Quantidade de diárias: ");
        int diarias = sc.nextInt();

        Reserva reserva = new Reserva(quarto, diarias);

        double total = reserva.calcularTotal();

        System.out.println("Valor total: R$" + total);

        System.out.println("\nForma de pagamento:");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão");
        System.out.println("3 - Dinheiro");

        int opcao = sc.nextInt();

        Pagamento pagamento = new Pagamento(true);

        if (!pagamento.validarPagamento()) {
            System.out.println("Pagamento recusado.");
        } else {
            System.out.println("Reserva confirmada.");
        }

        sc.close();
    }
}
