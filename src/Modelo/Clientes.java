
package Modelo;

public class Clientes {
    
    
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


    private int fecha_nacimiento;

    public Clientes(String rut, String nombre, String apellido_pat, String apellido_mat, int fecha_nacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.fecha_nacimiento = fecha_nacimiento;
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


    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Clientes{" + "rut=" + rut + ", nombre=" + nombre + ", apellido_pat=" + apellido_pat + ", apellido_mat=" + apellido_mat + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
}
