package Clase_Abstract;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    private double superficie;
    private double precioPintura;
    
    public TrabajoPintura(String trabajo,LocalDate fechainicio, String cliente, double superficie,double precioPintura){
        super(trabajo, fechainicio,cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }
    
    
    @Override
    public double costoMaterial() {
        return (superficie / 7.8)* precioPintura;
    }

    @Override
    public double costoManoObra() {
        return (superficie / 10) * 9.5;
    }

    @Override
    public double costoTotal() {
        double totalp =  (costoMaterial() + costoManoObra());
        if (superficie < 50){
            totalp += (totalp * 0.15);
            return totalp;
        }
        return totalp;
    }

    @Override
    public String detallesServicio() {
                return"\nTRABAJO DE PINTURA"+
             "\n-----------------------------------"+
             "\nCliente: "+getCliente()+
             "\nFecha de inicio: "+getFechainicio()+
             "\n-----------------------------------"+
             "\nCoste Material        "+costoMaterial()+
             "\nCoste Mano Obra       "+costoManoObra()+
             "\nCoste Adicional       "+costoManoObra()+
             "\nTotal:                " +costoTotal()+
             "\n-----------------------------------";
    }
    
}
