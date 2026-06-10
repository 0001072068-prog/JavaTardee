package Sistema_controle_Estacionamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vagasDisponiveis = 2;
        Veiculo veiculoEstacionado = null;
        System.out.println("Sistema Estacionamento");

        if (vagasDisponiveis <= 0) {
            System.out.println("Estacionamento Lotado");
            System.out.println("Sistema Encerrado");
            scanner.close();
            return;
        }
        System.out.println("Digite a placa do Veiculo");
        String placa = scanner.nextLine();

        System.out.println("Digite o tipo do Veiculo (carro ou moto");
        String tipo = scanner.nextLine();


        System.out.println("Digite Horario de entrada (Use , para minutos)");
        double horarioEntrada = scanner.nextDouble();
        scanner.nextLine();

        double[] horariosDisponiveis = {8.0, 10.0, 13.5, 15.0, 17.3};


        System.out.println("\nHorários disponíveis para entrada hoje:");
        for (int i = 0; i < horariosDisponiveis.length; i++) {
            if (horariosDisponiveis[i] != 0.0) {
                System.out.printf("[ %.2fh ] ", horariosDisponiveis[i]);
            }
        }



        horarioEntrada = 0.0;
        boolean horarioValido = false;

        while (!horarioValido) {
            System.out.print("Escolha e digite um dos horários acima (ex: 10,0): ");
            horarioEntrada = scanner.nextDouble();
            scanner.nextLine();


            for (int i = 0; i < horariosDisponiveis.length; i++) {
                if (horarioEntrada == horariosDisponiveis[i]) {
                    horarioValido = true;
                    horariosDisponiveis[i] = 0.0;
                    break;
                }
            }

            if (!horarioValido) {
                System.out.println("Erro: Esse horário não está disponível ou é inválido! Tente novamente.");
            }
        }

        veiculoEstacionado = new Veiculo(placa, tipo, horarioEntrada);
        veiculoEstacionado.setTipo(tipo);

        vagasDisponiveis--;
        System.out.println("\n[Sucesso] Entrada registrada para a placa: " + veiculoEstacionado.getPlaca());
        System.out.println("Vagas restantes no momento: " + vagasDisponiveis);

        System.out.println("\n---");
        System.out.println("REGISTRO DE SAÍDA ");
        System.out.print("Para realizar a saída, informe a placa do veículo: ");
        String placaSaida = scanner.nextLine();

        if (veiculoEstacionado != null && placaSaida.equalsIgnoreCase(veiculoEstacionado.getPlaca())) {
            System.out.print("Informe o horário de saída (ex: 16.45): ");
            double horarioSaida = scanner.nextDouble();
            scanner.nextLine();


            double tempoEstacionado = horarioSaida - veiculoEstacionado.getHorarioEntrada();
            double valorTotal = 0.0;

            if (tempoEstacionado <= 1.0) {
                valorTotal = 10.00; // Até 1 hora -> R$ 10,00
            } else {

                double horasAdicionais = Math.ceil(tempoEstacionado - 1.0);
                valorTotal = 10.00 + (horasAdicionais * 5.00);
            }


            System.out.printf("\nTempo total de permanência: %.2f horas\n", tempoEstacionado);
            System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

            System.out.print("\nQual a forma de pagamento? (cartao / dinheiro): ");
            String formaPagamento = scanner.nextLine();


            boolean pagamentoAprovado = true;

            if (!pagamentoAprovado) {
                System.out.println("Pagamento não autorizado."); //
                System.out.println("A saída do veículo continua bloqueada.");
            } else {

                vagasDisponiveis++;
                System.out.println("Saída liberada."); //
                System.out.println("Obrigado e volte sempre!");
                veiculoEstacionado = null;
            }

        } else {
            System.out.println("Erro: Veículo com a placa '" + placaSaida + "' não encontrado no sistema.");
        }

        System.out.println("\n=== PROCESSO ENCERRADO ===");
        scanner.close();


    }
}
