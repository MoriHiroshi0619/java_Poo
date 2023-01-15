public class Bolsista extends Aluno{
    private float bolsa;
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("renovando bolsa do aluno " + getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " é bolsista! pagamento facilitado");
    }

    public void detalhesBolsita(){
        this.detalhesAluno();
        System.out.println("bolsa = " + getBolsa());
    }
}
