package Ejercicio2;

import java.util.ArrayList;

public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void añadirFiguras(Figura fig) {
        listaFiguras.add(fig);
    }
    // quitar despues
    public void subirPrecio(double cantidad, String id) {
        for (Figura fig : listaFiguras) { // hacer para que se seleccione la figura querida
            if (fig.getCodigo().equals(id)) {
                fig.subirPrecio(cantidad);
                System.out.println("El precio de la figura fue hecho");
            }
        }
    }
    
    public void conCapa(){
        for(Figura fig: listaFiguras){
            if(fig.getSuperheroe().getCapa() == true){
                System.out.println("con capa: "+fig.getSuperheroe().getNombre());
            }
        }
    }
    // metodos de observadores
    // lograr que saque el mas caro
    public void masValioso() {
        double auxiliar = 0;
        for (Figura fig : listaFiguras) {
            if (fig.getPrecio() > auxiliar) {
                auxiliar = fig.getPrecio();
            }
        }
        System.out.println("EL precio de la figura mas cara es: " + auxiliar);
    }

    public double getValorColeccion() {
        double precioTotal = 0;
        for (Figura fig : listaFiguras) {
            precioTotal += fig.getPrecio();
        }
        return precioTotal;
    }

    public double getVolumenColeccion() {
        double volumenTotal = 0;
        for (Figura fig : listaFiguras) {
            volumenTotal += fig.getDimension().GetVolumen();

        }
        return (volumenTotal + 200);
    }

    @Override
    public String toString() { // revisar
        return "\nInformacion: \nColeccion: " + nombreColeccion + "\nLista: " + listaFiguras + "\n";
    }
}
