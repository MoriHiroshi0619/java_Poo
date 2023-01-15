public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    /**
     * @param idade
     * @param nome
     * @param sexo
     * @param especialidade
     * @param salario
     */
    public Professor(int idade, String nome, String sexo ,String especialidade, float salario){
        setIdade(idade);
        setNome(nome);
        setSexo(sexo);
        setEspecialidade(especialidade);
        setSalario(salario);
    }

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
    }

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

}
