public class Visualizacao {
    private Pessoa espectador;
    private Video filme;

    public Visualizacao(Pessoa espectador, Video filme){
        setEspectador(espectador);
        setFilme(filme);
    }

    public String getEspectador() {
        return this.espectador.getNome();
    }

    public void setEspectador(Pessoa espectador) {
        this.espectador = espectador;
    }

    public String getFilme() {
        return this.filme.getTitulo();
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        System.out.println("o video foi principalmente avaliado pelo espectador " + this.espectador.getNome());
    }

    public void avaliar(int nota){
        System.out.println("após a avaliação, o filme, " + this.filme.getTitulo() + ", recebeu nota " + nota);
    }

    public void avaliar(float porcentagem){
        System.out.println("após a avaliação, o filme,  " + this.filme.getTitulo() + ", recebeu " + porcentagem + "% de aprovação");
    }
}
