public class App {
    public static void main(String[] args) throws Exception {
        /*
         * desafio -----
         * criar um atributo sexo para os lutadores e verificar as lutas de sexo opostos 
         */
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("pretty boy", "frança", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("putscript", "brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new Lutador("snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

        l[3] = new Lutador("dead code", "australia", 28, 1.93f, 81.6f, 13, 0, 2);

        l[4] = new Lutador("UFOcobol", "brasil", 37, 1.70f, 119.3f, 5, 4, 3); 

        l[5] = new Lutador("nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        /* 
        for(int i = 0 ; i < 6 ; i++){
            l[i].apresentar();
            l[i].ganharLuta();
            l[i].status();
            System.out.println(" ");
        }*/

        System.out.println("*********** COMECAR A MARCAR UMA LUTA ***************");
        Luta ufc = new Luta();
        ufc.marcarLuta(l[1], l[0]);
        ufc.lutar();
        System.out.println("*******************");
        l[1].status();
        System.out.println("------------------------");
        l[0].status();
        
    }
}
