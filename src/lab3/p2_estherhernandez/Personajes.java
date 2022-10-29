
package lab3.p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Personajes {
    protected String nombre;
    protected String raza;
    protected int estatura;
    protected int peso;
    protected int edad;
    protected int hp;
    protected String descripcion;
    protected String nacionalidad;
    protected String tipo;
    protected int Ac;

    public Personajes() {
    }

    public Personajes(String nombre, String raza, int estatura, int peso, int edad,int hp, String descripcion, String nacionalidad, String tipo,int Ac) {
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.hp = hp;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.tipo = tipo;
        this.Ac= Ac;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAc() {
        return Ac;
    }

    public void setAc(int Ac) {
        this.Ac = Ac;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "Personajes{" + "nombre=" + nombre + ", raza=" + raza + ", estatura=" + estatura + ", peso=" + peso +",Años= "+edad+
                 ",HP="+hp+", descripcion=" +descripcion + ", nacionalidad=" + nacionalidad+ ",Tipo="+tipo+",AC= "+Ac+", ";
    }
    
    
}
