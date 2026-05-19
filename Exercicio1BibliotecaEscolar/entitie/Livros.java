package Exercicio1BibliotecaEscolar.entitie;

public class Livros { // Usei Livros porque é o nome do seu arquivo no print
    private String codigo;
    private boolean disponivel;

    public Livros(String codigo) {
        this.codigo = codigo;
        this.disponivel = true;
    }

    public String getCodigo() { return codigo; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean status) { this.disponivel = status; }
}