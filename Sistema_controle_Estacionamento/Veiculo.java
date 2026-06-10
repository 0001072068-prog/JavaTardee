package Sistema_controle_Estacionamento;

public class Veiculo {
    private String placa;
    private String tipo;
    private double horarioEntrada;

    public Veiculo(String placa, String tipo, double horarioEntrada) {
        this.placa = placa;
        this.tipo = tipo;
        this.horarioEntrada = horarioEntrada;
    }

    public String getPlaca() {
        return placa;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
    }

    public double getHorarioEntrada() {
        return horarioEntrada;
    }
}





