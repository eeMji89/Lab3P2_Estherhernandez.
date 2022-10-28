/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Barbaro extends Personajes {
    private String arma;
    private int xp;

    public Barbaro() {
        super();
    }

    public Barbaro(String arma, int xp) {
        this.arma = arma;
        this.xp = xp;
    }

    public Barbaro(String arma, int xp, String nombre, String raza, int estatura, int peso, int edad, String descripcion, String nacionalidad, String tipo) {
        super(nombre, raza, estatura, peso, edad, descripcion, nacionalidad, tipo);
        this.arma = arma;
        this.xp = xp;
    }

  
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return super.toString()+ " Barbaro{" + "arma=" + arma + ", xp=" + xp + '}';
    }
    
}
