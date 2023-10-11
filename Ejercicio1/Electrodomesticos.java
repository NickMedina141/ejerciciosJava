package Ejercicio1;
public class Electrodomesticos {
    private String tipo;
    private String marca;
    private double potencia;
    
    public Electrodomesticos(String tipo,String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }
    
    // getters & setters
    public String getTipo(){
        return tipo;
    }
    public String getMarca(){
        return marca;
    }
    public double getPotencia(){
        return potencia;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    
    // metodos
    public double getConsumo(int horas){
       double totalKW = (potencia * horas);
       return totalKW;
    }
    
    public double getCosteConsumo(int horas,double costeHora){
        // precio 575.97 kwh
        double costeConsumo = horas * costeHora;
        return costeConsumo;
    }
    
    @Override
    public String toString(){
        return "{ "+"Tipo: "+ tipo+" Marca: "+marca+" Potencia: "+potencia;
    }
}
