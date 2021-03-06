
package Modelo.CompraLibros;

/**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */

public class Facturas {
    private int folio;
    private int precio_neto;
    private int precio_iva;
    private int costo_iva;
    private int fecha_compra;
    private int hora_compra;
    private String distribuidor_involucrado;
    private String metodo_pago;

    public Facturas(int folio, int precio_neto, int precio_iva, int costo_iva, int fecha_compra, int hora_compra, String distribuidor_involucrado, String metodo_pago) {
        this.folio = folio;
        this.precio_neto = precio_neto;
        this.precio_iva = precio_iva;
        this.costo_iva = costo_iva;
        this.fecha_compra = fecha_compra;
        this.hora_compra = hora_compra;
        this.distribuidor_involucrado = distribuidor_involucrado;
        this.metodo_pago = metodo_pago;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(int precio_neto) {
        this.precio_neto = precio_neto;
    }

    public int getPrecio_iva() {
        return precio_iva;
    }

    public void setPrecio_iva(int precio_iva) {
        this.precio_iva = precio_iva;
    }

    public int getCosto_iva() {
        return costo_iva;
    }

    public void setCosto_iva(int costo_iva) {
        this.costo_iva = costo_iva;
    }

    public int getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(int fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getHora_compra() {
        return hora_compra;
    }

    public void setHora_compra(int hora_compra) {
        this.hora_compra = hora_compra;
    }

    public String getDistribuidor_involucrado() {
        return distribuidor_involucrado;
    }

    public void setDistribuidor_involucrado(String distribuidor_involucrado) {
        this.distribuidor_involucrado = distribuidor_involucrado;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    @Override
    public String toString() {
        return "Facturas{" + "folio=" + folio + ", precio_neto=" + precio_neto + ", precio_iva=" + precio_iva + ", costo_iva=" + costo_iva + ", fecha_compra=" + fecha_compra + ", hora_compra=" + hora_compra + ", distribuidor_involucrado=" + distribuidor_involucrado + ", metodo_pago=" + metodo_pago + '}';
    }
    
    
}
