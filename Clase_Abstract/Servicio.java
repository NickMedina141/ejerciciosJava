package Clase_Abstract;

import java.time.LocalDate;

public abstract class Servicio {
    private String trabajo;
    private LocalDate fechainicio;
    private String cliente;
    
    
    public Servicio(){
        
    }

    public Servicio(String trabajo, LocalDate fechainicio, String cliente) {
        this.trabajo = trabajo;
        this.fechainicio = fechainicio;
        this.cliente = cliente;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    public abstract double costoMaterial();
    public abstract double costoManoObra();
    public abstract double costoTotal();
    public abstract String detallesServicio();
    
    
    
}
