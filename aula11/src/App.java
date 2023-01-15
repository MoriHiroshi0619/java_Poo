public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        v1.setNome("hiroshi");
        v1.setIdade(17);
        v1.setSexo("masculino");
        v1.detalhes();

        Aluno a1 = new Aluno();
        a1.setNome("claudio");
        a1.setMatricula(1234);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("masculino");
        a1.detalhesAluno();
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setMatricula(12314);
        b1.setNome("jubileu");
        b1.setBolsa(400f);
        b1.setSexo("masculino");
        b1.setCurso("sistemas");
        //b1.pagarMensalidade();
        b1.setIdade(20);
        b1.detalhesBolsita();


        Professor p1 = new Professor();

        p1.setNome("joel");
        p1.setIdade(32);
        p1.setSexo("masculino");
        p1.setSalario(1240.6f);
        p1.setEspecialidade("algoritmos e estruturas de dados");

        p1.detalhesProfessor();

        p1.receberAumento();
        p1.detalhesProfessor();
    }
}
