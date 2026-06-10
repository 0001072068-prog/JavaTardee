package sistema_biblioteca2;

public class Aluno {
    private String nome;
    private int matricula;
    private boolean possuiMulta;
    private int livrosEmprestados;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public boolean isPossuiMulta() {
        return possuiMulta;
    }

    public void setPossuiMulta(boolean possuiMulta) {
        this.possuiMulta = possuiMulta;
    }


    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
}

