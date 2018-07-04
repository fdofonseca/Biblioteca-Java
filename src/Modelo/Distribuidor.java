
package Modelo;

public class Distribuidor {
    
    /**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */
    
    
    
    private String rut;
    private String nombre_empresa;
    private String direccion;
    private int telefono;
    private int anodesdequevende;

    public Distribuidor(String rut, String nombre_empresa, String direccion, int telefono, int anodesdequevende) {
        this.rut = rut;
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.anodesdequevende = anodesdequevende;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getAnodesdequevende() {
        return anodesdequevende;
    }

    public void setAnodesdequevende(int anodesdequevende) {
        this.anodesdequevende = anodesdequevende;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "rut=" + rut + ", nombre_empresa=" + nombre_empresa + ", direccion=" + direccion + ", telefono=" + telefono + ", anodesdequevende=" + anodesdequevende + '}';
    }
    
    
}
