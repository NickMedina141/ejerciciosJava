
package Ejercicio3;

import java.util.ArrayList;

public class Parking {
    private ArrayList<String> matriculas;
    private String nombreParking;
    
    public Parking(String nombreParking,int plazeta){
        this.nombreParking = nombreParking;
        matriculas = new ArrayList<>();
        matriculas.ensureCapacity(plazeta);
        for(int i=0; i< plazeta; i++){
            matriculas.add(i,null);
        }
        
    }   
    
    public String getNombre(){
        return nombreParking;
    }
    
    public void entrada(int plaza,String matricula){
        if(matricula.length() < 4){
            System.out.println("Error");
            }
        else if(matriculas.get(plaza) != null){
            System.out.println("Plaza ocupada");
        }
        else if(matriculas.contains(matricula) != false){
            System.out.println("Matricula repetida");
        }
        else{
          matriculas.add(plaza,matricula);  
        }
        }
    
    public int salida(String matricula){
        int posicion = matriculas.indexOf(matricula);
        if(matriculas.contains(matricula) == false){
           System.out.println("La matricula no existente");
        }
        else{
          matriculas.set(posicion,null);
            System.out.println(
                    "El auto fue retirado\n Informacion del parking+\nPlaza totales: "+getPLazasTotales()+
                            "\nPlazas ocupadas: "+getPlazasOcupadas()+"\nPlazas libres: "+getPlazasLibres());
            
        }
        return posicion;  
    }
    
    public int getPLazasTotales(){
        
        return matriculas.size();
    }
    public int getPlazasOcupadas(){
        int ocupadas=0;
        for(int i=0; i < matriculas.size();i++){
            if(matriculas.get(i) != null){
                ocupadas += 1;
            }
        }
        // verificar como hacerlo
        return  ocupadas;
    }
    public int getPlazasLibres(){
        int libres = 0;
        for(int i=0;i < matriculas.size();i++){
            if(matriculas.get(i) == null){
                libres +=1;
            }
        }
        // tambien revisar
        return libres;
    }
    
    public void mostrar(){ // en teoria deberia funcionar, pero revisar despues
        int cantidad = matriculas.size();
        System.out.println("cantidad del arraylist: "+cantidad);
        System.out.println("""
        ---------------------
           Parking Avenida
        --------------------""");
         for(int i=0; i < cantidad; i++ ){
               System.out.println("Plaza "+i+": "+ matriculas.get(i));
              }
                
    }
    
    
}
