package entites;

public class Onibus extends Veiculo{
    private Integer assentos;
    public String motor;
     public  Onibus(){};

     public Onibus(Integer assentos){
         this.assentos = assentos;
     }

     public Onibus(String motor, Integer assentos){
         super(motor);
         this.assentos = assentos;
     }

     public Onibus (String motor, String cor, String fabricante,Integer assentos){
         super(motor, cor,fabricante);
         this.assentos = assentos;
     }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }
}




