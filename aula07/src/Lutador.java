public class Lutador implements LutadorInterface{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    


    public Lutador (String nome,
                    String nacionalidade,
                    int idade,
                    float altura,
                    float peso,
                    int vitorias,
                    int derrotas,
                    int empates){
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }


    @Override
    public void apresentar() {
        System.out.println("-------apresentando o lutador--------");
        System.out.println("Lutador: " + getNome());
        System.out.println("origem :" + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("pesando " + getPeso());
        System.out.println("ganhou " + getVitorias() + " lutas");
        System.out.println("perdeu " + getDerrotas() + " lutas");
        System.out.println("empatou " + getEmpates() + " lutas");
        System.out.println("=========fim da apresentação=========");

    }
    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println("vitorias: " + getVitorias());
        System.out.println("derrotas: " + getDerrotas());
        System.out.println("empates: " + getEmpates());        
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(peso);
    }
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if(peso < 52.2){
            this.categoria = "invalido";
        }else if(peso <= 70.3){
            this.categoria = "leve";
        }else if(peso <= 83.9){
            this.categoria = "médio";
        }else if(peso <= 120.2){
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

}