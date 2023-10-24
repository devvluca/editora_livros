package EditoraXLivroXGenero;
import java.util.Date;

public class Livro {
    private int idLivro;
    private String titulo;
    private String ISBN;
    private int numeroPaginas;
    private Date dataLancamento;
    private Genero genero;
    private Editora editora;


    public Livro(int idLivro, String titulo, String ISBN, int numeroPaginas, Date dataLancamento, Genero genero, Editora editora) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.editora = editora;
    }

    public String obterDados() {
        return "Dados: \n" +
                "Titulo: " + this.titulo + "\n" +
                "Genero: " + genero.getNomeGenero() + "\n" +
                "Editora: " + editora.getRazaoSocial() + "\n" +
                "UF: " + editora.getUF() + "\n";
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

}
