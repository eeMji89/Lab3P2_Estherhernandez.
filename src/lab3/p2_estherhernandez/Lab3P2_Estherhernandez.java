
package lab3.p2_estherhernandez;

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
        boolean flag = true;
        while (flag== true) {            
            int op = lea.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("1. Creacion de personajes"
                            + "\n2. Modificar personajes"
                            + "\n3. Ver atributos de un personaje"
                            + "\n4. Eliminar Personajes"
                            + "\n5. Combate");
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
    
}
