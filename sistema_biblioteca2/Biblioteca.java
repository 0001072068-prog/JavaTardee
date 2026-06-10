package sistema_biblioteca2;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel");
        aluno.setMatricula(1234);
        aluno.setPossuiMulta(false);
        aluno.setLivrosEmprestados(2);

        Livro livro = new Livro();

        livro.setTitulo("Pequeno principe");
        livro.setCodigo(100);
        livro.setDisponivel(true);
        livro.setEstoque(1);

        System.out.print("Digite sua matrícula: ");
        int matriculaDigitada = sc.nextInt();

        if (matriculaDigitada != aluno.getMatricula()) {

            System.out.println("Aluno não encontrado.");

        } else {


            if (aluno.isPossuiMulta()) {

                System.out.println("Empréstimo bloqueado por multa.");

            }


            else if (aluno.getLivrosEmprestados() >= 3) {

                System.out.println("Limite de empréstimos atingido.");

            }

            else {

                System.out.print("Digite o código do livro: ");
                int codigoDigitado = sc.nextInt();


                if (codigoDigitado != livro.getCodigo() || !livro.isDisponivel()) {

                    System.out.println("Livro indisponível.");

                } else {


                    aluno.setLivrosEmprestados(
                            aluno.getLivrosEmprestados() + 1
                    );


                    livro.setEstoque(
                            livro.getEstoque() - 1
                    );


                    if (livro.getEstoque() == 0) {

                        livro.setDisponivel(false);
                    }

                    System.out.println("Empréstimo realizado com sucesso.");
                }
            }
        }

        sc.close();

    }

}

