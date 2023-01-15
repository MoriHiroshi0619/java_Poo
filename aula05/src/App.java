public class App {
    public static void main(String[] args) throws Exception {

        ContaBanco hiroshi = new ContaBanco("Hiroshi", 613);
        hiroshi.mostrarStatus();
        hiroshi.abrirConta("cc");
        hiroshi.depositar(1250.5f);
        hiroshi.sacar(300.0f);
        hiroshi.pagatMensalidade();
        
        hiroshi.mostrarStatus();
        System.out.println("-------fim do programa---------");
    }
}
  