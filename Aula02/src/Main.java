import canetas.Caneta;

public class Main {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        
        c1.modelo = "bic";
        c1.cor = "preta";
        c1.ponta = 0.6f;
        c1.tampada = false;
        c1.carga = 100;
        
        c1.tampar();
        c1.status();
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.modelo = "hostnet";
        c2.cor = "vermelho";
        c2.ponta = 1.0f;
        c2.carga = 50;
        c2.tampada = true;

        c2.status();
    }   
}
