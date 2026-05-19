package Exercicio1BibliotecaEscolar.entitie;

public class Alunos { // Usei Alunos porque é o nome do seu arquivo no print
    private String matricula;
    private boolean multaPendente;
    private int livrosEmprestados;

    public Alunos(String matricula) {
        this.matricula = matricula;
        this.multaPendente = false;
        this.livrosEmprestados = 0;
    }

    public String getMatricula() { return matricula; }
    public boolean temMulta() { return multaPendente; }
    public int getLivrosEmprestados() { return livrosEmprestados; }
    public void adicionarEmprestimo() { this.livrosEmprestados++; }
}