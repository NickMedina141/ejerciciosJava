package Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // figura 1
        Superheroe superheroe = new Superheroe("Spider-man");
        superheroe.setDescripcion("el hombre araña");
        Dimension dimension = new Dimension(50,70,18.7);
        Figura fig = new Figura("1234", 5000, superheroe, dimension);
        
        
        // instanciar objetos de tipo coleccion
        Coleccion col1 = new Coleccion("Marvel");
        
        Superheroe superheroe2 = new Superheroe("Batman");
        superheroe2.setDescripcion("El caballero de gotham");
        superheroe2.setCapa(true);
        Dimension dimension2 = new Dimension(50,70,18.7);
        Figura fig2 = new Figura("3456", 65000, superheroe2, dimension2);
        
        Superheroe superheroe3 = new Superheroe("wonder-woman");
        superheroe3.setDescripcion("La mujer maravilla");
        Dimension dimension3 = new Dimension(40,70.8,20.5);
        Figura fig3 = new Figura("6789", 70000, superheroe3, dimension3);
        
        col1.añadirFiguras(fig);
        col1.añadirFiguras(fig2);
        col1.añadirFiguras(fig3);
        col1.masValioso();
        System.out.println("precio actual: "+fig.getPrecio()); // quitar
        col1.subirPrecio(15000, "3456");
        System.out.println("precio actualizado: "+fig.getPrecio());
        System.out.println("Valor total de la coleccion: "+col1.getValorColeccion());
        System.out.println("Volumen total de la coleccion: "+col1.getVolumenColeccion());
        System.out.println("\nArray: "+col1);
        
        System.out.println("\n");
        col1.subirPrecio(10000, "6789");
        System.out.println(col1);
        
        col1.conCapa();
//        System.out.println(
//                """
//                Menu de opciones
//                1. Egregar superheroe 
//                2. Editar superheroe
//                3. Eliminar superheroe
//                4. Buscar superheroe
//                5. Salir
//                           """);
//        System.out.print("Eliga una opcion: ");
//        int opcion = entrada.nextInt();
//        if(opcion == 1){
//            // los datos del superheroe
//            System.out.print("Ingrese el nombre del super heroe: ");
//            String nombre = entrada.nextLine();
//            Superheroe super1 = new Superheroe(nombre);
//            System.out.println("Ingrese la descripcion del superheroe: ");
//            String descripcion = entrada.nextLine();
//            super1.setDescripcion(descripcion);
//            System.out.println("El superheroe tiene capa si/no?: ");
//            String capa = entrada.nextLine();
//            if(capa.equals("si")){
//                super1.setCapa(true);
//            }
//            else if(capa.equals("no")){
//                super1.setCapa(false);
//            }
//            // dimensiones del superheroe
//            System.out.print("Ingrese la altura del superheroe: ");
//            double alto = entrada.nextDouble();
//            System.out.println("Ingrese el ancho del superheroe: ");
//            double ancho = entrada.nextDouble();
//            System.out.println("Ingrese la profundidad: ");
//            Double profundidad = entrada.nextDouble();
//            Dimension dimension1 = new Dimension(alto, ancho, profundidad);
//            
//            // el registro del superheroe
//            System.out.print("Ingrese el codigo del super heroe: ");
//            String codigo = entrada.nextLine();
//            System.out.println("Ingrese el precio del superheroe: ");
//            double precio = entrada.nextDouble();
//            Figura fig1 = new Figura(codigo, precio, super1, dimension1);
//            
//            // el nombre de la coleccion a cual pertenecera
//            System.out.println("Ingrese el nombre de la coleccion: ");
//            String nombreColeccion = entrada.nextLine();
//            Coleccion col1 = new Coleccion(nombreColeccion);
//            // lo añadimos
//            col1.añadirFiguras(fig1);
//        }
//        else if(opcion ==2){
//            System.out.println(
//                """
//                +------------------+
//                |Superheroe        |
//                |1. nombre         | 
//                |2. descripcion    |
//                |3. capa           |
//                +------------------+
//                |Dimension         |
//                |4. alto           |
//                |5. ancho          |
//                |6. profundidad    |
//                +------------------+
//                |Figuta            |
//                |7. codigo         |
//                |8. precio         |
//                +------------------+""");
//            
//            int opcion2 = entrada.nextInt();
//           
//            switch (opcion2) {
//                case 1:
//                    System.out.print("Ingrese el nuevo nombre del superheroe: ");
//                    String newNombre = entrada.nextLine();
//                    
//                    
//                    break;
//                default:
//                    throw new AssertionError();
//            }
        }
    
}
