public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume(){
        return this.volume;
    } 

    private void setVolume(int v){
        this.volume = v;
    }

    private boolean isLigado(){
        return this.ligado;
    }

    private void setLigado(boolean t){
        this.ligado = t;
    }

    private boolean isTocando(){
        return this.tocando;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------MENU-------");
        System.out.println("está ligado: " + this.isLigado());
        System.out.println("está tocando: " + this.isTocando());
        System.out.println("volume: " + this.getVolume());
        for (int i = 0; i < getVolume() ; i += 10){
            System.out.print("| ");
        }
        System.out.println(" ");
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando menu");
        
    }

    @Override
    public void aumentarVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void mutar() {
        if(this.isLigado() && this.getVolume() != 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desmutar() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }
}
