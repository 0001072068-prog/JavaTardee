package Exercicio1BibliotecaEscolar.applicate;

import Exercicio1BibliotecaEscolar.entitie.Alunos;
import Exercicio1BibliotecaEscolar.entitie.Livros;

import java.util.ArrayList;
import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alunos> listaAlunos = new ArrayList<>();
        ArrayList<Livros> listaLivros = new ArrayList<>();

        // Dados de teste
        listaAlunos.add(new Alunos("123"));
        listaLivros.add(new Livros("L001"));

        System.out.print("Digite sua matrícula: ");
        String matricula = scanner.nextLine();

        Alunos alunoEncontrado = null;
        for (Alunos a : listaAlunos) {
            if (a.getMatricula().equals(matricula)) {
                alunoEncontrado = a;
                break;
            }
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado.");
        } else if (alunoEncontrado.temMulta()) {
            System.out.println("Empréstimo bloqueado por multa.");
        } else if (alunoEncontrado.getLivrosEmprestados() >= 3) {
            System.out.println("Limite de empréstimos atingido.");
        } else {
            System.out.print("Digite o código do livro: ");
            String codigoLivro = scanner.nextLine();

            Livros livroEscolhido = null;
            for (Livros l : listaLivros) {
                if (l.getCodigo().equals(codigoLivro)) {
                    livroEscolhido = l;
                    break;
                }
            }

            if (livroEscolhido == null || !livroEscolhido.isDisponivel()) {
                System.out.println("Livro indisponível.");
            } else {
                livroEscolhido.setDisponivel(false);
                alunoEncontrado.adicionarEmprestimo();
                System.out.println("Empréstimo realizado com sucesso.");
            }
        }
        scanner.close();
    }
}