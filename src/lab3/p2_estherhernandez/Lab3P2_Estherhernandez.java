
package lab3.p2_estherhernandez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Lab3P2_Estherhernandez {
    static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Personajes> P = new ArrayList();
        boolean flag = true;
        while (flag== true) {            
            System.out.println("1. Creacion de personajes"
                + "\n2. Modificar personajes"
                + "\n3. Ver atributos de un personaje"
                + "\n4. Eliminar Personajes"
                + "\n5. Combate");
            int op = lea.nextInt();
            
            switch (op) {
                case 1:
                    P = AgregarPersonaje(P);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        }
    }
    public static ArrayList AgregarPersonaje(ArrayList p) {
        String tipoP = "",Ds="",inv="",arma="",mag="";
        int xp=0;
        boolean flag2 = false;
        while (flag2 == false) {
            System.out.println("Seleccione el tipo de personaje: ");
            System.out.println("1. Clerigo"
                    + "\n2. Barbaro"
                    + "\n3. Mago"
                    + "\n4. Picaro"
                    + "\n...");
            int tipo = lea.nextInt();
            switch (tipo) {
                case 1:
                    tipoP = "Clerigo";
                    System.out.println("Ingrese el nombre del dios o demonio al que sirve: ");
                    Ds= lea.nextLine(); lea.next();
                    System.out.println("Ingrese el tipo de invocacion del personaje: ");
                    inv= lea.nextLine(); lea.next();                 
                    flag2 = true;
                    break;
                case 2:
                    tipoP = "Barbaro";
                    System.out.println("Seleccione el tipo de arma del barbaro: "
                            + "\n1. Pesada"
                            + "\n2. Ligera"
                            + "\n3. Escudo\n...");
                    int ar2=lea.nextInt();
                    boolean flag5=false;
                    while (flag5==false) {                        
                        if (ar2==1) {
                            arma= "Pesada";
                            flag5=true;
                        }
                        else if (ar2==2) {
                            arma= "Ligera";
                            flag5=true;
                        }
                        else if (ar2==3) {
                            arma= "Escudo";
                            flag5=true;
                        }
                        else{
                            System.out.println("Opcion no valida, intente de nuevo...");
                            flag5=false;
                        }
                    }
                    System.out.println("Ingrese el xp del barbaro: ");
                    xp = lea.nextInt();
                    flag2 = true;
                    break;
                case 3:
                    tipoP = "Mago";
                    System.out.println("Seleccione el tipo de magia:"
                            + "\n1. Mago Blanco"
                            + "\n2. Mago Negro"
                            + "\n3. Sanador");
                    int mg= lea.nextInt();
                    boolean flag6 = false;
                    while (flag6==false) {                        
                        if (mg==1) {
                           mag="Mago Blanco"; 
                           flag6=true;
                        }
                        else  if (mg==2) {
                            mag="Mago Negro";
                            flag6=true;
                        }
                        else  if (mg==3) {
                            mag="Sanador";
                            flag6=true;
                        }
                        else{
                            System.out.println("Opcion no valida, intente de nuevo...");
                            flag6=false;
                        }
                    }
                    flag2 = true;
                    break;
                case 4:
                    tipoP = "Picaro";
                    flag2 = true;
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    flag2 = false;
                    break;
            }
        }
            String raza = "";
            System.out.println("Ingrese el nombre del personaje:");
                String nombre = lea.nextLine();
                lea.next();
            boolean flag3 = false;
            while (flag3 == false) {               
                System.out.println("Eliga la Raza de su personaje: ");
                System.out.println("1. Mediano"
                        + "\n2. Enano"
                        + "\n3. Elfo"
                        + "\n4. Humano\n...");
                int traza = lea.nextInt();
                switch (traza) {
                    case 1:
                        raza ="Mediano";
                        flag3=true;
                        break;
                    case 2:
                        raza="Enano";
                        flag3=true;
                        break;
                    case 3:
                        raza="Elfo";
                        flag3=true;
                        break;
                    case 4:
                        raza="Humano";
                        flag3=true;
                        break;
                    default:
                        System.out.println("Opcion no valida, intente de nuevo...");
                        flag3 = false;
                        break; 
            }
                System.out.println("Ingrese la estatura del personaje: ");
                int estatura=lea.nextInt();
                System.out.println("Ingrese la edad del personaje: ");
                int edad=lea.nextInt();
                System.out.println("Ingrese la descripcion de personaje: ");
                String descripcion = lea.nextLine();lea.next();
                System.out.println("Seleccione la nacionalidad del personaje: ");
        }
     return p;       
    }
    
}
