package EditoraXLivroXGenero;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Genero genero1 = new Genero(1 ,"Terror");
        Genero genero2 = new Genero(2, "Romance");
        Genero genero3 = new Genero(3, "Comédia");

        Editora editora1 = new Editora(1, "Cultura", "5768-8574", "Recife", "PE");
        Editora editora2 = new Editora(2, "DarkSide", "8574-2634", "São Paulo", "SP");

        Date dataLancamento1 = formato.parse("21/03/1996");
        Date dataLancamento2 = formato.parse("27/10/2005");
        Date dataLancamento3 = formato.parse("05/01/1996");
        Date dataLancamento4 = formato.parse("15/09/2020");
        Date dataLancamento5 = formato.parse("21/07/2023");

        Livro livro1 = new Livro(1, "Exorcista", "847-4-4587-8458-4", 300, dataLancamento1, genero1, editora2);
        Livro livro2 = new Livro(2, "Drácula", "345-3-1234-2345-1", 381, dataLancamento2, genero2, editora1);
        Livro livro3 = new Livro(3, "Diário de um Banana", "458-2-2347-9578-9", 210, dataLancamento3, genero3, editora1);
        Livro livro4 = new Livro(4, "Ed Lorrane Warren", "586-1-3127-8347-1", 287, dataLancamento4, genero1, editora2);
        Livro livro5 = new Livro(5, "La La Land", "436-3-3128-9485-3", 234, dataLancamento5, genero2, editora1);

        System.out.println(livro1.obterDados());
        System.out.println(livro2.obterDados());
        System.out.println(livro3.obterDados());
        System.out.println(livro4.obterDados());
        System.out.println(livro5.obterDados());


    }
}
