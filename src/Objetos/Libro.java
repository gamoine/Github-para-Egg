package Objetos;

public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroPaginas;

//CONSTRUCTOR VACIO
    public Libro() {
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    public Libro(int ISBN, String Titulo, String Autor, int NumeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    //creo el tostring para imprimir todo
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroPaginas=" + NumeroPaginas + '}';
    }

    
    //ahora todos los getters y setters
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }
    
    
    
    

}
