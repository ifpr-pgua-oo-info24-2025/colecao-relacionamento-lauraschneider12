public class LivroDigital extends Livro {
    private Integer tamanhoDoArquivoMB;

    public Integer getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(Integer tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + " | Tamanho do arquivo: " + tamanhoDoArquivoMB + "MB";
    }
}
