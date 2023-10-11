package Ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Parking parkingCentro = new Parking("plazuela", 25);
        while (true){ // intentar meter try-catch
            System.out.println(
                """
                +-----------------------+
                |Menu de opciones       |
                +-----------------------+
                |1. Entrada de coches   |
                |-----------------------|
                |2. Salida de coche     |
                |-----------------------|
                |3. Mostrar parking     |
                |-----------------------|
                |4. salir del programa  |
                +-----------------------+
                """);
            
            System.out.print("Eliga una opcion: ");
        int opcion = entrada.nextInt();
            if(opcion == 1){ // revisar
                System.out.print("Ingrese la matricula del auto que desea ingresar: ");
                entrada.nextLine();
                String matricula = entrada.nextLine();
                System.out.print("Ingrese la plaza donde desea guardar el coche: ");
                int plaza = entrada.nextInt();
                parkingCentro.entrada(plaza, matricula);

        }
        else if(opcion == 2){
                System.out.print("Ingrese la matricula del auto que va a salir: ");
                entrada.nextLine();
                String matricula = entrada.nextLine();
                parkingCentro.salida(matricula);
        }
        else if(opcion == 3){
                parkingCentro.mostrar();
        }
        else if(opcion == 4){
                System.out.println("Sistema cerrado perros xd");
            break;
        }
        else{
            System.out.println("Error");
            continue;
        }
        }
        
        
        
        
                
    }
}
