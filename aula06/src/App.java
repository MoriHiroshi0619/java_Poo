public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.aumentarVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        c.mutar();
        c.pause();
        c.abrirMenu();
        c.desligar();
        System.out.println("-------");
        //c.setVolume(50);
        //System.out.println("volume = " + c.getVolume());

    }
}
