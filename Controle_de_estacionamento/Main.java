package Controle_de_estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento(10);

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        System.out.print("Hora de entrada: ");
        int entrada = sc.nextInt();

        if (!estacionamento.temVaga()) {
            System.out.println("Estacionamento lotado!");
            return;
        }

        Veiculo veiculo = new Veiculo(placa, tipo, entrada);
        estacionamento.registrarEntrada();

        System.out.print("Hora de saída: ");
        int saida = sc.nextInt();

        int horas = saida - veiculo.getHoraEntrada();
        double valor = estacionamento.calcularValor(horas);

        System.out.println("Valor a pagar: R$ " + valor);

        estacionamento.registrarSaida();
        System.out.println("Saída liberada!");
    }
}