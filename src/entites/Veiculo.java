package entites;

public class Veiculo {
    private String motor;
    private String cor;
    private Double potencia;
    private String fabricante;

    public Veiculo(){};

    public Veiculo(String motor){}

    public Veiculo(String motor, Double potencia){
        this.motor = motor;
        this.potencia = potencia;
    }

    public Veiculo(String motor, String cor, String fabricante) {
        this.motor = motor;
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public Veiculo(String motor, String cor, Double potencia, String fabricante) {
        this.motor = motor;
        this.cor = cor;
        this.potencia = potencia;
        this.fabricante = fabricante;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
