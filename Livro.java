public class Livro {
    private String titulo;
    private Integer ano;
    private Autor autor;

    public Livro() {
        this.autor = new Autor(); 
    }

    public void setLivro(String novoTitulo, Integer novoAno, String novoAutor, String novaNacionalidade) {
        this.titulo = novoTitulo;
        this.ano = novoAno;
        autor.setAutor(novoAutor, novaNacionalidade);
    }

    public String exibirDetalhes() {
        return "Título: " + titulo + " | Ano: " + ano + " | " + autor.exibirAutorLivro();
    }
}
