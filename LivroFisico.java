public class LivroFisico extends Livro {
    private Integer numeroDePaginas;

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + " | Número de páginas: " + numeroDePaginas;
    }
}
