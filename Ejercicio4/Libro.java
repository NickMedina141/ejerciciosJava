
package Ejercicio4;

public class Libro {
    private String titulo;
    private String isbn;
    private double precioCompra;
    private double precioVenta;
    private int existencia;

    public Libro(String titulo, String isbn, double precioCompra, double precioVenta,int existencia) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    // idea loca pero factible 
    public void subir(int cantidad){
        this.existencia += cantidad;
    }
    public void bajar(int cantidad){
        this.existencia -= cantidad;
                }
}
