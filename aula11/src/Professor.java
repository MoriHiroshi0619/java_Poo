public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(){
        float aumento;
        aumento = (float) (this.salario * 0.2); 
        setSalario(getSalario() + aumento);
    }

    public void detalhesProfessor(){
        this.detalhes();
        System.out.println("salario = " + getSalario());
        System.out.println("especialidade = " + getEspecialidade());
    }
}
