public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa(20, "Hiroshi", "masculino");
        p1.detalhes();
        /* 
        for(int i = 0 ; i < 5 ; i++){
            p1.fazerAniversario();
        }
        p1.detalhes();
        */
        Livro l1 = new Livro("o ladrão de raios", "Rick Riordan", 10);
        l1.detalhes();
        l1.setLeitor(p1);
        l1.abrir();
        l1.folhear();
        for(int i = 0 ; i < 8 ; i++){
            l1.avancarPag();
        }
        l1.detalhes();
        System.out.println("########## FIM DO CÓDIGO ###########");
    }
}
