package ejerciciospoo;

import Objetos.Libro;
import Servicios.LibroServicios;
import java.util.Scanner;

public class EJERCICIOSPOO {

    public static void main(String[] args) {
        // creo variable leer scanner
        Scanner leer = new Scanner(System.in);

        //creo el objeto libroserv
        LibroServicios libroserv = new LibroServicios();

        //uso el objeto libreoserv para crear los libros usando el proceso crearLibro de libroserv
        Libro libro1 = libroserv.crearLibro();
        Libro libro2 = libroserv.crearLibro();

        //imprimo todo con tostring
        System.out.println("libro 1 "+libro1.toString());
        System.out.println("libro 2 "+libro2.toString());

        //CAMBIAR TITULO invoco al procedimiento cambiarTitulo que esta en libroserv
        libroserv.cambiarTitulo(libro2);

        //imprimo todo con tostring
        System.out.println(libro1.toString());

        // System.out.println("ahora imprimo uno por uno con get ");
        //System.out.println(libro1.getISBN());
        //System.out.println(libro1.getTitulo());
        // System.out.println(libro1.getAutor());
        // System.out.println(libro1.getNumeroPaginas());
        // libro1.setTitulo("El Perro Verde");
        //  System.out.println("ahora imprimo de nuevo pero cambiando el titulo ");
        // System.out.println(libro1.getISBN());
        // System.out.println(libro1.getTitulo());
        // System.out.println(libro1.getAutor());
        // System.out.println(libro1.getNumeroPaginas());
    }

}
