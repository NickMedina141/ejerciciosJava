
package Ejercicio1;

import ejercicioPOO.principal;

public class Lavadora extends Electrodomesticos{
    private int precio;
    private boolean aguaCalciente;
    
    public Lavadora(String tipo, String marca, double potencia,int precio,boolean aguaCaliente){
        super(tipo, marca, potencia);
        this.precio = precio;
        this.aguaCalciente = aguaCaliente;
    }
    
    public int getPrecio(){
        return precio;
    }
    public boolean getAguaCaliente(){
        return aguaCalciente;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setAguaCaliente(boolean aguaCaliente){
        this.aguaCalciente = aguaCaliente;
    }
    
    @Override
    public String toString(){
        return "{"+super.toString()+"Precio: "+precio+" Agua caliente: "+aguaCalciente+'}';
    }
    
    @Override
    public double getConsumo(int horas){
        double totalKW = 0;
        System.out.print("¿La lavadora trabaja con agua fria o caliente?: ");
        String agua = principal.entrada.next();
        if(agua.equals("fria")){
            totalKW = (getPotencia() * horas);
            return totalKW;
        }
        else if(agua.equals("caliente")){
            totalKW = horas * (getPotencia() + getPotencia() * 0.20);
            return totalKW;
        }
       return totalKW;
       
    }
    public double getCosteConsumo(int horas,double costeHora){
        double costeConsumo = horas * costeHora;
        return costeConsumo;
    }
    
    
}
