

public class Main {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta(100, 0.5f);
        Caneta c2 = new Caneta(50, 1.0f);
        c1.setModelo("imperio");
        c2.setCor("preta");
        c2.setTampada(false);
        c1.status();
        c2.status();
        System.out.println("......fim do programa.....");
    }   
}
