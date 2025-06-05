public class Autor {
    private String nome;
    private String nacionalidade;

    public void setAutor(String novoNome, String novaNacionalidade) {
        this.nome = novoNome;
        this.nacionalidade = novaNacionalidade;
    }

    public String exibirAutorLivro() {
        return " Nome: " + nome;
    }

    public String exibirAutor() {
        return "Nome: " + nome + " Nacionalidade: " + nacionalidade;
    }
}
