

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(int carga, float ponta){  //esse é o metodo construtor
        this.setTampada(true);;
        this.setCor("azul");
        this.setCarga(carga);
        this.setPonta(ponta);
    }

    

    public int getCarga(){
        return this.carga;
    }

    public void setCarga(int c){
        this.carga = c;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean t){
        this.tampada = t;
    }


    public void status(){
        System.out.println(".......SOBRE A CANETA......");
        if(this.getModelo() != null) System.out.println("modelo = " + this.getModelo());
        if(this.getCor() != null) System.out.println("cor = " + this.getCor());
        if(this.getPonta() != 0.0) System.out.println("ponta = " + this.getPonta());
        if(this.getCarga() != 0) System.out.println("carga = " + this.getCarga());
        if(this.getTampada()){
            System.out.println("a caneta está tampada");
        }else{
            System.out.println("a caneta está destampada");
        }
    }
}

