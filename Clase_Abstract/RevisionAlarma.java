package Clase_Abstract;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private int numAlarmaRevisada;

    public RevisionAlarma(int numAlarmaRevisada) {
        this.numAlarmaRevisada = numAlarmaRevisada;
    }

    public RevisionAlarma(int numAlarmaRevisada, String trabajo, LocalDate fechainicio, String cliente) {
        super(trabajo, fechainicio, cliente);
        this.numAlarmaRevisada = numAlarmaRevisada;
    }

    public int getNumAlarmaRevisada() {
        return numAlarmaRevisada;
    }

    public void setNumAlarmaRevisada(int numAlarmaRevisada) {
        this.numAlarmaRevisada = numAlarmaRevisada;
    }
    
    
    @Override
    public double costoMaterial() {
        return  0;
        
    }

    @Override
    public double costoManoObra() {
        return (numAlarmaRevisada / 3) * 40;
    }

    @Override
    public double costoTotal() {
        return costoMaterial();
    }

    @Override
    public String detallesServicio() {
        return"\nRevision periodica alarmas contraincendios"+
             "\nCliente: "+getCliente()+
             "\nFecha de revision: "+getFechainicio()+
             "\n-----------------------------------"+
             "\nTotal            :" +costoTotal()+
             "\n-----------------------------------";
    }
    
}
