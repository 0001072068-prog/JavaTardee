package agendamentoMedico;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("12345678900", "João");
        Consulta consulta = new Consulta("Cardiologia", "14:00");

        SistemaAgendamento sistema = new SistemaAgendamento();

        if (!sistema.verificarPaciente(paciente)) {
            System.out.println("Paciente não cadastrado");
            return;
        }

        if (!sistema.verificarHorario()) {
            System.out.println("Não há horários disponíveis");
            return;
        }

        sistema.agendarConsulta(paciente, consulta);
    }
}
