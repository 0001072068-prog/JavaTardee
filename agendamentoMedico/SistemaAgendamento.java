package agendamentoMedico;

public class SistemaAgendamento {

    public boolean verificarPaciente(Paciente paciente) {
        return paciente != null;
    }

    public boolean verificarHorario() {
        return true;
    }

    public void agendarConsulta(Paciente paciente, Consulta consulta) {
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Especialidade: " + consulta.especialidade);
        System.out.println("Horário: " + consulta.horario);
        System.out.println("Consulta agendada com sucesso!");
    }
}