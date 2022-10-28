
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
        P.add(new Barbaro("Ligera",50,"Mason","Mediano",
        180,60,30,"Bronceado","Maridia","Lead"));
        P.add(new Mago("Mago Blanco","Roderik","Humano",
        176,58,41,"Esbelto","Zebes","Support"));
        while (flag== true) {            
            System.out.println("1. Creacion de personajes"
                + "\n2. Modificar personajes"
                + "\n3. Ver atributos de un personaje"
                + "\n4. Eliminar Personajes"
                + "\n5. Combate");
            int op = lea.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println(Listar(P));
                    P = AgregarPersonaje(P);
                    
                    System.out.println(Listar(P));
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
        String Ds="",inv="",arma="",mag="",instrumento="";
        int tipoP=0,xp=0,robo=0;
        boolean flag2 = false;
        while (flag2 == false) {
            System.out.println("Seleccione la clase del personaje: ");
            System.out.println("1. Clerigo"
                    + "\n2. Barbaro"
                    + "\n3. Mago"
                    + "\n4. Picaro"
                    + "\n...");
            int tipo = lea.nextInt();
            switch (tipo) {
                case 1:
                    tipoP = 1;
                    System.out.println("Ingrese el nombre del dios o demonio al que sirve: ");
                     lea.nextLine(); Ds =lea.nextLine(); System.out.println(Ds);
                    System.out.println("Ingrese el tipo de invocacion del personaje: ");
                    inv=lea.nextLine();               
                    flag2 = true;
                   
                    break;
                case 2:
                    tipoP = 2;
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
                    tipoP = 3;
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
                    tipoP = 4;
                    System.out.println("Seleccione el tipo de instrumento del personaje: "
                            + "\n1. Amuleto"
                            + "\n2. Arma"
                            + "\n3. Piedra Antigua");
                    int ins= lea.nextInt();
                    boolean flag7 =false;
                    while (flag7==false) {                        
                        if (ins==1) {
                            instrumento= "Amuleto";
                            flag7=true;
                        }
                        else if (ins==2) {
                            instrumento="Arma";
                            flag7=true;
                        }
                        else if (ins==3) {
                            instrumento="Piedra Antigua";
                            flag7=true;
                        }
                        else{
                            flag7=false;
                        }
                    }
                    System.out.println("Ingrese la cantidad de robo exitoso realizados del personaje: ");
                    robo = lea.nextInt();
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
                String nombre = lea.next();
                
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
            }
                System.out.println("Ingrese la estatura del personaje: ");
                int estatura=lea.nextInt();
                System.out.println("Ingrese la edad del personaje: ");
                int edad=lea.nextInt();
                System.out.println("Ingrese el peso del personaje:");
                int peso = lea.nextInt();
                System.out.println("Ingrese la descripcion de personaje: ");
                String descripcion = lea.nextLine();lea.next();
                System.out.println("Seleccione la nacionalidad del personaje: ");
                System.out.println("1. Norfair"
                        + "\n2. Brinstar"
                        + "\n3. Maridia"
                        + "\n4. Zebes"
                        + "\n5. Crateria\n...");
                int nac= lea.nextInt();
                String nacionalidad="";
                boolean flag8=false;
                while (flag8==false) {                    
                    switch (nac){
                        case 1:
                            nacionalidad="Norfair";
                            flag8=true;
                            break;
                        case 2:
                            nacionalidad="Brinstar";
                            flag8=true;
                            break;
                        case 3:
                            nacionalidad="Maridia";
                            flag8=true;
                            break;
                        case 4:
                            nacionalidad="Zebes";
                            flag8=true;
                            break;
                        case 5 :
                            nacionalidad="Crateria";
                            flag8=true;
                            break;
                        default:
                            System.out.println("Opcion no valida, intente de nuevo...");
                            flag8= false;
                            break;                          
                    }
                }
                System.out.println("Seleccione el tipo del personaje: "
                        + "\n1. Lead"
                        + "\n2. Support"
                        + "\n3. Offensive"
                        + "\n4. Spammer"
                        + "\n5. Tank"
                        + "\n... ");
                int op4=lea.nextInt();
                String tipo = "";
                boolean flag9=false;
                while (flag9==false) {            
                    switch (op4) {
                        case 1:
                            tipo = "Lead";
                            flag9=true;       
                            break;
                        case 2:
                            tipo = "Support";
                            flag9=true;
                            break;
                        case 3:
                            tipo = "Offensive";
                            flag9=true;
                            break;
                        case 4:
                            tipo = "Spammer";
                            flag9=true;
                            break;
                        case 5:
                            tipo = "Tank";
                            flag9=true;
                            break;
                        
                        default:
                            throw new AssertionError();
                    }
        }
            if (tipoP==1) {
                p.add(new Clerigo(Ds,inv,nombre,raza,estatura,peso,edad,descripcion,nacionalidad,tipo));
            }
            else if (tipoP==2) {
                p.add(new Barbaro(arma,xp,nombre,raza,estatura,peso,edad,descripcion,nacionalidad,tipo));
            }
            else  if (tipoP==3) {
                p.add(new Mago(mag,nombre, raza, estatura, peso, edad, descripcion, nacionalidad, tipo));
            }
             if (tipoP==4) {
                 p.add(new Picaro(instrumento, robo, nombre, raza, estatura, peso, edad, descripcion, nacionalidad, tipo));
            }
    
     return p;       
    }
    public static String Listar(ArrayList p){
        String Listar ="";
        for (Object o : p) {
           Listar+= p.indexOf(o)+"-"+o+"\n";
        }
        return Listar;
    }
    
}
