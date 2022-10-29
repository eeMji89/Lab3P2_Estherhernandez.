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

    public Mago(String magia) {
        this.magia = magia;
    }

    public Mago(String magia, String nombre, String raza, int estatura, int peso, int edad, int hp,String descripcion, String nacionalidad, String tipo,int Ac) {
        super(nombre, raza, estatura, peso, edad,hp, descripcion, nacionalidad, tipo,Ac);
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
