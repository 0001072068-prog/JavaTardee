package Restaurante;

public class Cliente {

    private String email;
    private String senha;

    public Cliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public boolean validarLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }
}