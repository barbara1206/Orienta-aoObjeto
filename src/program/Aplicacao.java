package program;
import entites.Onibus;
import entites.Veiculo;

public class Aplicacao {
    public static void main(String[] args) {
        // Instanciado objeto
        Veiculo veiculo = new Veiculo();

        veiculo.setMotor("V12");// encapisulamento
        System.out.println(veiculo.getMotor());

        Veiculo veiculo1 = new Veiculo("V8", 80.0);
        System.out.println(veiculo1.getMotor());

        Onibus onibus = new Onibus();
        onibus.setAssentos (46);
        onibus.setMotor("V16");

        System.out.println(onibus.getAssentos());
        System.out.println(onibus.getMotor());
    }
}
