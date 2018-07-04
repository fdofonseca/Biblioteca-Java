
package Modelo.ArriendoLibros;

public class Arriendos {
    
    /**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */
    
    private String libros_arrendados;
    private int costo_total;
    private int fecha_arriendo;
    private int fecha_devolucionestimada;
    private int fecha_entregareal;
    private int dias_retraso;
    private int multa;
    private int costo_arriendo;
    private String cliente_involucrado;
    private String trabajador_involucrado;

    public Arriendos(String libros_arrendados, int costo_total, int fecha_arriendo, int fecha_devolucionestimada, int fecha_entregareal, int dias_retraso, int multa, int costo_arriendo, String cliente_involucrado, String trabajador_involucrado) {
        this.libros_arrendados = libros_arrendados;
        this.costo_total = costo_total;
        this.fecha_arriendo = fecha_arriendo;
        this.fecha_devolucionestimada = fecha_devolucionestimada;
        this.fecha_entregareal = fecha_entregareal;
        this.dias_retraso = dias_retraso;
        this.multa = multa;
        this.costo_arriendo = costo_arriendo;
        this.cliente_involucrado = cliente_involucrado;
        this.trabajador_involucrado = trabajador_involucrado;
    }

    public String getLibros_arrendados() {
        return libros_arrendados;
    }

    public void setLibros_arrendados(String libros_arrendados) {
        this.libros_arrendados = libros_arrendados;
    }

    public int getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(int costo_total) {
        this.costo_total = costo_total;
    }

    public int getFecha_arriendo() {
        return fecha_arriendo;
    }

    public void setFecha_arriendo(int fecha_arriendo) {
        this.fecha_arriendo = fecha_arriendo;
    }

    public int getFecha_devolucionestimada() {
        return fecha_devolucionestimada;
    }

    public void setFecha_devolucionestimada(int fecha_devolucionestimada) {
        this.fecha_devolucionestimada = fecha_devolucionestimada;
    }

    public int getFecha_entregareal() {
        return fecha_entregareal;
    }

    public void setFecha_entregareal(int fecha_entregareal) {
        this.fecha_entregareal = fecha_entregareal;
    }

    public int getDias_retraso() {
        return dias_retraso;
    }

    public void setDias_retraso(int dias_retraso) {
        this.dias_retraso = dias_retraso;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public int getCosto_arriendo() {
        return costo_arriendo;
    }

    public void setCosto_arriendo(int costo_arriendo) {
        this.costo_arriendo = costo_arriendo;
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

    @Override
    public String toString() {
        return "Arriendos{" + "libros_arrendados=" + libros_arrendados + ", costo_total=" + costo_total + ", fecha_arriendo=" + fecha_arriendo + ", fecha_devolucionestimada=" + fecha_devolucionestimada + ", fecha_entregareal=" + fecha_entregareal + ", dias_retraso=" + dias_retraso + ", multa=" + multa + ", costo_arriendo=" + costo_arriendo + ", cliente_involucrado=" + cliente_involucrado + ", trabajador_involucrado=" + trabajador_involucrado + '}';
    }
    
    
}
