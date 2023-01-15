

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("modelo " + this.modelo);
        System.out.println("uma caneta com cor " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("carga " + this.carga);
        System.out.println("ponta " + this.ponta);
    }

    public void rabiscar() {
        if(this.tampada == true){
            System.out.println("ERRO! não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}

