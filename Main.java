import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        LivroFisico livroFisico1 = new LivroFisico();
        livroFisico1.setLivro("Harry Potter", 2001, "JK", "Britânico");
        livroFisico1.setNumeroDePaginas(600);
       
        LivroDigital livroDigital1 = new LivroDigital();
        livroDigital1.setLivro("Harry Potter", 2001, "JK", "Britânico");
        livroDigital1.setTamanhoDoArquivoMB(800);
        biblioteca.add(livroFisico1);
        biblioteca.add(livroDigital1);

        for (Livro livro : biblioteca)//*laço for-each que para cada elemento da lista executa a ação 
        {
            System.out.println(livro.exibirDetalhes());
        }
    }
}
