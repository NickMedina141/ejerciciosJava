package Ejercicio4;

import java.util.Scanner;

public class Menu {
    public Scanner entrada = new Scanner(System.in);
    public Biblioteca biblio1 = new Biblioteca();
    
    public void menu() {
        int opcion;
        do{
            System.out.println(
                    """
                    +---------------------------------------------------------+
                    |Tienda de libros                                         | 
                    +---------------------------------------------------------+
                    |1. Registrar libros                                      |
                    +---------------------------------------------------------+
                    |2. Vender libro                                          |
                    +---------------------------------------------------------+
                    |3. Abastecer libro                                       |
                    +---------------------------------------------------------+
                    |4. Buscar libro por isbn                                 |
                    +---------------------------------------------------------+ 
                    |5. Buscar libro por titulo                               |
                    +---------------------------------------------------------+ 
                    |6. Buscar el libro mas costoso                           |
                    +---------------------------------------------------------+
                    |7. Buscar el libro menos costoso                         |
                    +---------------------------------------------------------+
                    |8. Cantidad de transacciones de abastecimiento de libro  |
                    +---------------------------------------------------------+
                    |9. Eliminar libro                                        |
                    +---------------------------------------------------------+ 
                    |10. Salir                                                |
                    +---------------------------------------------------------+
                               """);
            System.out.print("Eliga una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el titulo del libro: ");
                    entrada.nextLine();
                    String titulo = entrada.nextLine();
                    System.out.print("Ingrese el codigo isbn del libro: ");
                    String isbn = entrada.nextLine();
                    System.out.print("Ingrese el precio de compra del libro: ");
                    double precioCompra = entrada.nextDouble();
                    System.out.print("Ingrese el precio de venta del libro: ");
                    double precioVenta = entrada.nextDouble();
                    System.out.print("Escribe la cantidad de existencias del libro: ");
                    int existencia = entrada.nextInt();
                    Libro libro1 = new Libro(titulo,isbn, precioCompra, precioVenta,existencia);
                    boolean  valor = biblio1.validadorIngreso(titulo, isbn);
                    if(valor == false){
                        biblio1.Registrar(libro1);
                    }
                    else{
                         biblio1.validadorIngreso(titulo, isbn);
                    }
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.print("Ingrese el isbn del libro que desea vender: ");
                    String libro = entrada.nextLine();
                    biblio1.vender(libro);
                    break;
                case 3:
                    entrada.nextLine();
                    System.out.print("Ingrese el isbn del libro que desea abastecer: ");
                    String libro2 = entrada.nextLine();
                    biblio1.abastecer(libro2);
                    break;
                case 4:
                    entrada.nextLine();
                    System.out.print("Ingrese el isbn del libro que desea buscar: ");
                    String isbn2 = entrada.nextLine();
                    biblio1.buscarIsbn(isbn2);
                    break;
                case 5:
                    entrada.nextLine();
                    System.out.print("Ingrese el titulo del libro que desea buscar: ");
                    String tituloBuscar = entrada.nextLine();
                    biblio1.buscarTitulo(tituloBuscar);
                    break;
                case 6: 
                    biblio1.masValioso();break;
                case 7: 
                    biblio1.menosValioso();break;
                case 8:
                    // pendiente
                    break;
                case 9:
                    entrada.nextLine();
                    System.out.print("Ingrese el codigo isbn del libro que desea elimianr: ");
                    String isbnEliminar = entrada.nextLine();
                    biblio1.eliminar(isbnEliminar);break;
                case 10:
                    System.out.println("Sistema cerrado");break;
                default:
                    throw new AssertionError("Error");
            }
        }while(opcion >= 1 && opcion <= 10);
    }
}
