package Controle_De_Estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Tipo (carro/moto): ");
        String tipo = sc.nextLine();

        Veiculo veiculo = new Veiculo(placa, tipo);
        Estacionamento estacionamento = new Estacionamento();

        if (!estacionamento.temVaga()) {
            System.out.println("Estacionamento lotado!");
            return;
        }

        System.out.print("Horas estacionadas: ");
        int horas = sc.nextInt();

        double valor = estacionamento.calcularValor(horas);

        System.out.println("resutado");
        System.out.println("Placa: " + veiculo.placa);
        System.out.println("Tipo: " + veiculo.tipo);
        System.out.println("Valor a pagar: R$ " + valor);

        sc.close();
    }
}
