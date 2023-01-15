public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor(34, "maicon", "masculino", "capoeira", 1500f);
        Funcionario p4 = new Funcionario();

        p1.setNome("maria");
        p2.setNome("joao");
        p4.setNome("bruno");

        p1.detalhes();
        p2.detalhes();
        p3.detalhes();
        p4.detalhes();
    }
}
