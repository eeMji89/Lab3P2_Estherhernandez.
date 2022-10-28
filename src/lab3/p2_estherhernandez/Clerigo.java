
package lab3.p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Clerigo extends Personajes {
    private String Dcreyente;
    private String Tinvocacion;

    public Clerigo() {
        super();
    }

    public Clerigo(String Dcreyente, String Tinvocacion, String nombre, String raza, int estatura, int peso, String descripcion, String nacionalidad) {
        super(nombre, raza, estatura, peso, descripcion, nacionalidad);
        this.Dcreyente = Dcreyente;
        this.Tinvocacion = Tinvocacion;
    }

    public String getDcreyente() {
        return Dcreyente;
    }

    public void setDcreyente(String Dcreyente) {
        this.Dcreyente = Dcreyente;
    }

    public String getTinvocacion() {
        return Tinvocacion;
    }

    public void setTinvocacion(String Tinvocacion) {
        this.Tinvocacion = Tinvocacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "Clerigo{" + "Dcreyente=" + Dcreyente + ", Tinvocacion=" + Tinvocacion + '}';
    }
    
    
    
    
}
