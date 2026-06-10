package Agendamento_medico2;

public class Paciente {
    private String nome;
    private  String cpf;
    private String especialidade;
    private int cadastro;
    private int opcaoHorario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public int getOpcaoHorario() {
        return opcaoHorario;
    }

    public void setOpcaoHorario(int opcaoHorario) {
        this.opcaoHorario = opcaoHorario;
    }

    public void exibirDados(){
        System.out.println("Nome:" + nome);
        System.out.println("cpf:" + cpf);
        System.out.println("especialidade:" + especialidade);
        System.out.println("cadastro" + cadastro);
        System.out.println("opcaoHorario" + opcaoHorario);
    }
}

