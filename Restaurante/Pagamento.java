package Restaurante;

public class Pagamento {

    public boolean validarPagamento(int opcao) {

        if (opcao >= 1 && opcao <= 3) {
            return true;
        }

        return false;
    }
}
