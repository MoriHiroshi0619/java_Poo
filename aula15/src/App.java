public class App {
    public static void main(String[] args) throws Exception {
        Video v1 =  new Video("olha no que deu", "é uma merda");
        v1.play();
        v1.setViews(12343);
        v1.like();
        v1.detalhes();
        
        System.out.println("==============================");

        Gafanhoto g1 = new Gafanhoto("hiroshi", "masculino", 21, "kokoro");
        g1.viuMaisUm();
        g1.getExperiencia();
        g1.detalhes();

        System.out.println("==============================");

        Visualizacao v = new Visualizacao(g1, v1);
        System.out.println(v.getEspectador());
        System.out.println(v.getFilme());

        v.avaliar();
        v.avaliar(55.2f);
        v.avaliar(10);
    }
}
