public class Video implements AcoesVideo{
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo, String avalicao){
        setTitulo(titulo);
        setAvaliacao(avalicao);
        setViews(0);
        setCurtidas(0);
        setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if(isReproduzindo()){
            System.out.println("o video já está sendo reproduzido");
        }else{
            System.out.println("play no video");
            setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if(isReproduzindo()){
            System.out.println("pause no video");
            setReproduzindo(false);
        }else{
            System.out.println("o video já está pausado");
        }
        
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public void detalhes(){
        System.out.println("video ->" + getTitulo());
        System.out.println("avaliacao -> " + getAvaliacao());
        System.out.println("views = " + getViews());
        System.out.println("likes = " + getCurtidas());
        if(isReproduzindo()){
            System.out.println("está no play");
        }else{
            System.out.println("está no pause");
        }
    }
    
}
