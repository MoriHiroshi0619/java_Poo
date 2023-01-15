
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(String nome, int numConta){
        setStatus(false);
        setSaldo(0f);
        setDono(nome);
        setNumConta(numConta);
    }

    public void mostrarStatus(){
        System.out.println("---------sobre essa conta----------");
        System.out.println("numero da conta = " + getNumConta());
        System.out.println("nome do dono = " + getDono());
        System.out.println("tipo da conta = " + getTipo());
        System.out.println("saldo da conta atualmente = " + getSaldo());
        if(getStatus()){
            System.out.println("conta aberta");
        }else{
            System.out.println("conta encerrada ou inexistente");
        }
        System.out.println("---------------------------");
    }

    public void abrirConta(String t){
        if(t == "cc"){
            System.out.println("conta corrente criada com sucesso para o senhor " + getDono());
            setStatus(true);
            setSaldo(50.0f);
            setTipo(t);
        }else if(t == "cp"){
            System.out.println("conta poupanca criado com sucessor para o senhor " + getDono());
            setStatus(true);
            setSaldo(150.0f);
            setTipo(t);
        }else{
            System.out.println("parametro incorreto... tente 'cc' ou 'cp'");
        }
    }

    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("não podemos encerrar uma conta com saldo positivo");
        }else if(getSaldo() < 0){
            System.out.println("não podemos encerrar uma conta com saldo negativo");
        }else{
            System.out.println("conta encerrada com sucesso");
            setStatus(false);
            setTipo(null);
        }
    }

    public void depositar(float v){
        if(getStatus()){
            System.out.println("depositado " + v + " reais com sucesso");
            //this.saldo += v;
            setSaldo(getSaldo() + v);
        }else{
            System.out.println("não podemos depositar em uma conta com status de fechada");
        }
    }

    public void sacar(float v){
        if(v > getSaldo()){
            System.out.println("saldo insuficiente para sacar");
        }else{
            System.out.println("valor sacado com sucesso");
            //this.saldo -= v;
            setSaldo(getSaldo() - v);
        }
    }

    public void sacarTudo(){
        this.saldo -= this.saldo;
    }

    public void pagatMensalidade(){
        if(getStatus()){
            if(getTipo() == "cc"){
                this.saldo -= 12.0f;
            }else{
                this.saldo -= 15.0f;
            }
        }else{
            System.out.println("precisa primeiro abrir uma conta para cobrar mensalidade");
        }
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int c){
        this.numConta = c;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean t){
        this.status = t;
    }

}



/*+numConta
#tipo corrente ou poupanca (cc / cp)
-dono 
-saldo
-status aberta ou fechada

+abrirconta() -> mudar status true
+fechar() -> não pode ter dinheiro e nem debido
+depositar() -> conta tem que tá aberta
+sacar() -> tem que ter saldo o suficiente 
+pagatMensalidade() -> diminui saldo cc 12 reais e cp 20 reais

fazer os getter e os setter dos atributos

*se o cara abrir cc ele já comeca com saldo de 50reais ou se abrir uma conta cp começa com 150 reais */