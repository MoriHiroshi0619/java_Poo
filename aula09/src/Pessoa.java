public class Pessoa {
    private int idade;
    private String nome;
    private String sexo;

    public Pessoa(int idade, String nome, String sexo){
        setIdade(idade);
        setNome(nome);
        setSexo(sexo);
    }
 
    public void detalhes(){
        System.out.println("nome = " + getNome());
        System.out.println("sexo = " + getSexo());
        System.out.println("idade = " + getIdade());
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }     

    public String getSexo(){
        return this.sexo;
    }

    public void fazerAniversario(){
        System.out.println(getNome() + " fez aniversário !! parabéns ;)");
        this.setIdade(getIdade() + 1);
    }
}
