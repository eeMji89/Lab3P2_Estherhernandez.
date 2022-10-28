
package lab3.p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Personajes {
    private String nombre;
    private String raza;
    private int estatura;
    private int peso;
    private String descripcion;
    private String nacionalidad;

    public Personajes() {
        
    }

    public Personajes(String nombre, String raza, int estatura, int peso, String descripcion, String nacionalidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", raza=" + raza + ", estatura=" + estatura + ", peso=" + peso + ", descripcion=" + descripcion + ", nacionalidad=" + nacionalidad+ ",";
    }
    
    
}