public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; 

    public Livro(String titulo, String autor, int totalPaginas){
        setTitulo(titulo);
        setAutor(autor);
        setTotalPaginas(totalPaginas);
        setPagAtual(1);
        setAberto(false);
    }

    public void detalhes(){
        System.out.println("============= DETALHE DO LIVRO ============");
        System.out.println("titulo -> " + getTitulo());
        System.out.println("autor -> " + getTitulo());
        System.out.println("total de paginas -> " + getTotalPaginas());
        System.out.println("pagina atual -> " + getPagAtual());
        System.out.println("está aberto? -> " + isAberto());
        if(getLeitor() != null){
            System.out.println("leitor -> " + this.leitor.getNome());
        }else{ 
            System.out.println("sem leitor por hora....");
        }
        System.out.println("============= FIM =============");
    }


    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(getLeitor() != null){
            if(!isAberto()){
                setAberto(true);
            }else{
                System.out.println("o livro já está aberto");
            }
        }else{
            System.out.println("não há um leitor ainda....");
        }
    }

    @Override
    public void fechar() {
        if(getLeitor() != null){
            if(isAberto()){
                setAberto(true);
            }else{
                System.out.println("o livro já está aberto");
            }
        }else{
            System.out.println("não há um leitor ainda....");
        }
    }

    @Override
    public void folhear() {
        if(getLeitor() != null){
            if(isAberto()){
                System.out.println("folheado, total de " + getTotalPaginas() + " paginas");
            }else{
                System.out.println("precisa-se abrir o livro primeiramente");
            }
        }else{
            System.out.println("precisa-se de um leitor para folhear");
        }
    }

    @Override
    public void avancarPag() {
        if(getLeitor() != null){
            if(isAberto()){
                if(getPagAtual() != getTotalPaginas()){
                    setPagAtual(getPagAtual() + 1);
                }else{
                    System.out.println("já se encontra na ultima pagina");
                }
            }else{
                System.out.println("precisa-se abrir o livro primeiramente");
            }
        }else{
            System.out.println("precisa-se de um leitor....");
        }  
    }

    @Override
    public void voutarPag() {
        if(getLeitor() != null){
            if(isAberto()){
                if(getPagAtual() != 1){
                    setPagAtual(getPagAtual() - 1);
                }else{
                    System.out.println("já se econtra na primeira pagina");
                }
            }else{
                System.out.println("precisa-se abrir o livro primeiramente");
            }
        }else{
            System.out.println("precisa-se de um leitor....");
        }
    }



    
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    private void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
