
package Modelo.VentaLibros;

/**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */


public class Ventas {
    private String libros_vendidos;
    private String cliente_involucrado;
    private String trabajador_involucrado;
    private int boleta;

    public Ventas(String libros_vendidos, String cliente_involucrado, String trabajador_involucrado, int boleta) {
        this.libros_vendidos = libros_vendidos;
        this.cliente_involucrado = cliente_involucrado;
        this.trabajador_involucrado = trabajador_involucrado;
        this.boleta = boleta;
    }

    public String getLibros_vendidos() {
        return libros_vendidos;
    }

    public void setLibros_vendidos(String libros_vendidos) {
        this.libros_vendidos = libros_vendidos;
    }

    public String getCliente_involucrado() {
        return cliente_involucrado;
    }

    public void setCliente_involucrado(String cliente_involucrado) {
        this.cliente_involucrado = cliente_involucrado;
    }

    public String getTrabajador_involucrado() {
        return trabajador_involucrado;
    }

    public void setTrabajador_involucrado(String trabajador_involucrado) {
        this.trabajador_involucrado = trabajador_involucrado;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    @Override
    public String toString() {
        return "Ventas{" + "libros_vendidos=" + libros_vendidos + ", cliente_involucrado=" + cliente_involucrado + ", trabajador_involucrado=" + trabajador_involucrado + ", boleta=" + boleta + '}';
    }
    
    
    
}
