public class SmartPhone {
    private String tela;
    private int camera;
    private int numeroFotos;
    private String modelo;
    private int bateria;
    private String processador;
    private boolean carregando;
    
    public SmartPhone(String modelo) {
        setBateria(100);
        setModelo(modelo);
        setCarregando(false);
        this.numeroFotos = 0;
    }

    public void status(){
        System.out.println("---------SOBRE O TELEFONE----------");
        System.out.println("modelo = " + getModelo());
        System.out.println("bateria = " + getBateria());
        if(this.tela != null) System.out.println("tela = " + getTela());
        if(this.camera != 0) System.out.println("camera em MegaPixels = " + getCamera());
        if(this.processador != null) System.out.println("processador = " + getProcessador());
        if(getCarregando()){
            System.out.println("atualmente está carregando");
        }else{
            System.out.println("atualmente não está carregando");
        }
        System.out.println("total de fotos = " + getTotalFotos());
    }

    public void tirarFoto(){
        this.numeroFotos++;
    }

    public int getTotalFotos(){
        return this.numeroFotos;
    }
    
    public String getTela(){
        return this.tela;
    }
    
    public void  setTela(String tela){
        this.tela = tela;
    }
    
    public int getCamera(){
        return this.camera;
    }
    
    public void setCamera(int megapixels){
        this.camera = megapixels;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getBateria(){
        return this.bateria;
    }
    
    public void setBateria(int bateria){
        this.bateria = bateria; 
    }
    
    public String getProcessador() {
        return this.processador;
    }
    
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public boolean getCarregando(){
        return this.carregando;
    }

    public void setCarregando(boolean t){
        this.carregando = t;
    }
    
}
