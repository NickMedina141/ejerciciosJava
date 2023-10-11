package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> biblioteca;
    public Scanner entrada = new Scanner(System.in);

    public Biblioteca() {
        biblioteca = new ArrayList<>();
    }

    // registrar un libro
    public void Registrar(Libro libro1) {
        biblioteca.add(libro1);
        // hacer una condicion para que no ingresen el mismo codigo o algo parecido
    }

    public ArrayList<Libro> getBiblioteca() {
        return biblioteca;
    }

    //eliminar un libro del catalogo
    public void eliminar(String isbn) { // verificar 
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(isbn)) {
                biblioteca.remove(libro1.getIsbn());
                System.out.println("Su libro ha sido eliminado");
            }
            else if(libro1.getIsbn().equals(isbn) != true ){
                System.out.println("El libro no existe");
            }
        }
    }

    public void buscarTitulo(String titulo) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getTitulo().equals(titulo)) {
                System.out.println(
                "\nEl libro buscado es: " + libro1.getTitulo()
               +"\nCodigo isbn: "+libro1.getIsbn()
               +"\nCantidad de existencias: "+libro1.getExistencia());
            }
            else if(libro1.getTitulo().equals(titulo) != true ){
                System.out.println("El libro no existe");
            }
            
        }
    }

    public void buscarIsbn(String codigo) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(codigo)) {
                System.out.println(
                "\nEl libro buscado es: " + libro1.getTitulo()
               +"\nCodigo isbn: "+libro1.getIsbn()
               +"\nCantidad de existencias: "+libro1.getExistencia());
            }
            else if(libro1.getIsbn().equals(codigo) != true ){
                System.out.println("El libro no existe");
            }
        }
    }

    public void masValioso() {
        double auxiliar = 0;
        String titular = null;
        for (Libro libro1 : biblioteca) {
            if (libro1.getPrecioCompra() > auxiliar) {
                auxiliar = libro1.getPrecioCompra();
                titular = libro1.getTitulo();
            }
        }
        System.out.println("El libro mas caro es el libro " + titular + "con el precio de: " + auxiliar + " $");
    }

    public void menosValioso() {
        double auxiliar = 0;
        String titular = null;
        for (Libro libro1 : biblioteca) {
            if (libro1.getPrecioCompra() < auxiliar) {
                auxiliar = libro1.getPrecioCompra();
                titular = libro1.getTitulo();
            }
            
        }
        System.out.println("El libro menos caro es el libro " + titular + " con el precio de: " + auxiliar + " $");
    }

    public void abastecer(String isbn) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(isbn)) {
                System.out.print("Ingrese la cantidad que desea abastecer al libro " + libro1.getTitulo() + ": ");
                int cantidad = entrada.nextInt();
                libro1.subir(cantidad);
            }
            else if(libro1.getIsbn().equals(isbn) != true ){
                System.out.println("El libro no existe");
            }
        }
    }

    // vender ejemplares de un libro
    public void vender(String isbn) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(isbn)) {
                System.out.println("Ingrese la cantidad que desea vender del libro: ");
                int cantidad = entrada.nextInt();
                if (cantidad > libro1.getExistencia()) {
                    System.out.println("Lo sentimos pero no hay esa cantidad de libros");
                } else {
                    libro1.bajar(cantidad);
                }
            }
            else if(libro1.getIsbn().equals(isbn) != true ){
                System.out.println("El libro no existe");
            }
        }
    }

    public boolean validadorIngreso(String titulo, String isbn) {
        boolean valor = false;

        //cualquiera de las dos formas sirve, pero me fui por la mas corta jajaja
//        for (Libro libro1 : biblioteca) {
//            if (libro1.getTitulo().equals(titulo)) {
//                System.out.println("Titulo del libro ya existe en la base de datos");
//                return valor = true;
//            } else if (libro1.getIsbn().equals(isbn)) {
//                System.out.println("El codigo isbn ya existe en la base de datos");
//                return valor = true;
//            }
//
//        }
        if (biblioteca.contains(titulo) == true) {
            System.out.println("Titulo del libro ya existe en la base de datos");
            return valor = true;
        }
        if (biblioteca.contains(isbn) == true) {
            System.out.println("El codigo isbn ya existe en la base de datos");
            return valor = true;

        }
        return false;
    }
    
    public int transacciones(String codigo){
        for(Libro libro1: biblioteca){
            if(libro1.getIsbn().equals(codigo)){
                System.out.println("Ni idea de lo que tengo que hacer");
            }
        }
        return 0;
    }

}
