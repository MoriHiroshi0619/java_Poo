public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        m.emitirSom();

        Lobo l = new Lobo();
        l.emitirSom();

        Cachorro c = new Cachorro();
        c.emitirSom();

        c.reagir(6, 5f);
    }
}

