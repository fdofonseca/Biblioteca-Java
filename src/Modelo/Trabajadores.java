package Modelo;

public class Trabajadores {

    /**
 *
 * @author Fefo
 * * 04-07-2018
     * 10:00
 */
    
    
    private String rut;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;
    private String direccion;
    private int telefono;
    private String correo;
    private int fecha_contrato;

    public Trabajadores(String rut, String nombre, String apellido_pat, String apellido_mat, String direccion, int telefono, String correo, int fecha_contrato) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha_contrato = fecha_contrato;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(int fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "rut=" + rut + ", nombre=" + nombre + ", apellido_pat=" + apellido_pat + ", apellido_mat=" + apellido_mat + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", fecha_contrato=" + fecha_contrato + '}';
    }
    
    
}
