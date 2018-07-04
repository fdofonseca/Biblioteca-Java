
package Modelo.CompraLibros;

/**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */


public class Compras {
    private String libro_comprado;
    private String distri_involucrado;
    private int factura;

    public Compras(String libro_comprado, String distri_involucrado, int factura) {
        this.libro_comprado = libro_comprado;
        this.distri_involucrado = distri_involucrado;
        this.factura = factura;
    }

    public String getLibro_comprado() {
        return libro_comprado;
    }

    public void setLibro_comprado(String libro_comprado) {
        this.libro_comprado = libro_comprado;
    }

    public String getDistri_involucrado() {
        return distri_involucrado;
    }

    public void setDistri_involucrado(String distri_involucrado) {
        this.distri_involucrado = distri_involucrado;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Compras{" + "libro_comprado=" + libro_comprado + ", distri_involucrado=" + distri_involucrado + ", factura=" + factura + '}';
    }
    
    
}
