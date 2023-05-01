package Servicios;

import Objetos.Libro;
import java.util.Scanner;

public class LibroServicios {

    //creo el scanner leer
    private Scanner leer = new Scanner(System.in);

    //hago un procedimiento aca para crear un libro
    public Libro crearLibro() {

        int ISBN = 1001;
        //pido y asigno los datos
        System.out.println("Ingrese el Titulo del Libro: ");
        String Titulo = leer.nextLine();
        System.out.println("Ingrese Autor: ");
        String Autor = leer.nextLine();
        System.out.println("Ingrese Numero de Paginas: ");
        int NumeroPaginas = leer.nextInt();

        //retorno un nuevo libro hecho con todas las variables relevadas
        return new Libro(ISBN, Titulo, Autor, NumeroPaginas);
    }

    

    public void cambiarTitulo(Libro libro1) {
    System.out.println("Ingrese el titulo correcto ");
    String nuevoTitulo = leer.next();
        libro1.setTitulo(nuevoTitulo);    
    }
}
