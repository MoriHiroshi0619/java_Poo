import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1.getNome() != l2.getNome()){
            System.out.println("luta marcada com sucesso");
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            System.out.println("luta não pode set marcada");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("######## DESAFIADO ########");
            this.desafiado.apresentar();
            //this.desafiado.status();
            System.out.println("######## DESAFIANTE #########");
            this.desafiante.apresentar();
            //     this.desafiante.status();
            Random aleatorio  = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("------Empatou------");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " venceu!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: 
                    System.out.println(this.desafiante.getNome() + " venceu!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("a luta não pode acontecer");
        }
    }
    
    public Lutador getDesafiado(){
        return desafiado;
    }
    
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return rounds;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public boolean isAprovada() {
        return aprovada;
    }
    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
