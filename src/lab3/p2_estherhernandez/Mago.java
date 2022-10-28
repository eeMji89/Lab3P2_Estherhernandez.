/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3.p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Mago extends Personajes {
    private String magia;

    public Mago() {
        super();
    }

    public Mago(String magia, String nombre, String raza, int estatura, int peso, String descripcion, String nacionalidad) {
        super(nombre, raza, estatura, peso, descripcion, nacionalidad);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return super.toString()+ "Mago{" + "magia=" + magia + '}';
    }
    
}