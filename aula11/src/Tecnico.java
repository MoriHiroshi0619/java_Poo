public class Tecnico extends Aluno{
    private int registroProfissional;

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar(){
        System.out.println(getNome() + " está praticando.");
    }
}
