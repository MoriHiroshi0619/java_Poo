public class App {
    public static void main(String[] args) throws Exception {

        Animal m = new Mamifero();
        Animal r = new Reptil();
        Animal p = new Peixe();
        Animal a = new Ave();

        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();

        System.out.println("------------------");
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish peixe = new Goldfish();
        Arara arara = new Arara();

        canguru.locomover();
        cachorro.locomover();
        cachorro.emitirSom();
        cobra.locomover();
        tartaruga.locomover();
        peixe.locomover();
        arara.locomover();
    }
}
