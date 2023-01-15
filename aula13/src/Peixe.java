public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("nadando");        
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substâncias");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não faz som");        
    }

    public void soutarBolha(){
        System.out.println("Soutou uma bolha");
    }
    
}
