public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login){
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        setLogin(login);
        setExperiencia(0);
        setTotAssistido(0);
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm(){
        setTotAssistido(getTotAssistido() + 1);
    }

    public void detalhes(){
        System.out.println("nome = " + getNome());
        System.out.println("sexo = " + getSexo());
        System.out.println("idade = " + getIdade());
        System.out.println("experiencia = " + getExperiencia());
        System.out.println("login = " + getLogin());
        System.out.println("total assistido = " + getTotAssistido());
    }
}
