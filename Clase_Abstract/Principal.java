package Clase_Abstract;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    
        // arrayList - guarda los objetos de tipo pintura o revision alarma...
        Scanner entrada = new Scanner(System.in);
        ArrayList<Servicio> servicios = new ArrayList<>();
        
        System.out.println(
                """
                __________________________
                |Menu de opciones:       |
                |________________________|
                |1. Trabajo de pintura   |
                |2. Revision de alarma   |
                |3. Reporte              |
                |4. Salir                |
                |________________________|
                
                Ingrese la opcion que desea:
                """);
        
        int opcion = entrada.nextInt();
        if(opcion == 1){
            System.out.print("Ingrese el nombre del cliente: ");
            entrada.nextLine();
            String cliente = entrada.nextLine();
            System.out.print("Ingrese la superficie a pintar: ");
            int superficie = entrada.nextInt();
            System.out.print("Ingrese el precio de la pintura: ");
            int precioPintura = entrada.nextInt();
            TrabajoPintura obje1 = new TrabajoPintura("Pintura", LocalDate.now(), cliente, superficie, precioPintura);
            servicios.add(obje1);
            
            System.out.println(obje1.detallesServicio());
        }
        
        else if(opcion == 2){
            System.out.print("Ingrese el nombre del cliente: ");
            entrada.nextLine();
            String cliente = entrada.nextLine();
            RevisionAlarma alarma1 = new RevisionAlarma(2, "Vigilancia", LocalDate.now(), cliente);
            servicios.add(alarma1);
            
            System.out.println(alarma1.detallesServicio());
        }
        else if(opcion == 3){
            System.out.println("Sistema cerrado");
        }
    }
    
}
