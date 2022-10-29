
package lab3.p2_estherhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Lab3P2_Estherhernandez {
    static Scanner lea = new Scanner(System.in);
    static Random rd = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Personajes> P = new ArrayList();
        boolean flag = true;
        P.add(new Barbaro("Ligera",50,"Mason","Mediano",
        180,60,30,55,"Bronceado","Maridia","Lead",65));
        P.add(new Mago("Mago Blanco","Roderik","Humano",
        176,58,41,60,"Esbelto","Zebes","Support",20));
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
                    P = Modificar(P);
                    break;
                case 3:
                    System.out.println("PERSONAJES ");
                    System.out.println(Listar(P));
                    break;
                case 4:
                    System.out.println(Listar(P));
                    System.out.println("Seleccione el personaje que desea Eliminar: ");
                    int pp = lea.nextInt();
                    int op2=0;
                    if (pp<= P.size()-1&& P.get(pp)instanceof Personajes ) {
                        P.remove(pp);
                        System.out.println("El personaje se ha eliminado exitosamente");
                    }
                    break;
                case 5:
                    System.out.println(Listar(P));
                    Combate(P);
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
        int tipoP=0,xp=0,robo=0,hp=0,ac=0;
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
                    ac=40;
                    System.out.println("Ingrese el nombre del dios o demonio al que sirve: ");
                     lea.nextLine(); Ds =lea.nextLine(); System.out.println(Ds);
                    System.out.println("Ingrese el tipo de invocacion del personaje: ");
                    inv=lea.nextLine();               
                    flag2 = true;
                   
                    break;
                case 2:
                    tipoP = 2;
                    ac=65;
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
                    ac=20;
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
                    ac=50;
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
                        hp=50+rd.nextInt(60);
                        flag3=true;
                        break;
                    case 2:
                        raza="Enano";
                        hp=80+rd.nextInt(100);
                        flag3=true;
                        break;
                    case 3:
                        raza="Elfo";
                        hp=50+rd.nextInt(70);
                        flag3=true;
                        break;
                    case 4:
                        raza="Humano";
                        hp=40+rd.nextInt(75);
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
                p.add(new Clerigo(Ds,inv,nombre,raza,estatura,peso,edad,hp,descripcion,nacionalidad,tipo,ac));
            }
            else if (tipoP==2) {
                p.add(new Barbaro(arma,xp,nombre,raza,estatura,peso,edad,hp,descripcion,nacionalidad,tipo,ac));
            }
            else  if (tipoP==3) {
                p.add(new Mago(mag,nombre, raza, estatura, peso, edad,hp, descripcion, nacionalidad, tipo,ac));
            }
             if (tipoP==4) {
                 p.add(new Picaro(instrumento, robo, nombre, raza, estatura, peso, edad,hp, descripcion, nacionalidad, tipo,ac));
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
    public static ArrayList Modificar(ArrayList p){       
        System.out.println(Listar(p));
        System.out.println("Seleccione el personaje que desea modificar: ");
        int p1 = lea.nextInt();
        int op2=0;
        if (p1<= p.size()-1) {
            System.out.println("---General---\n Seleccione lo que desea modificar: "
                    + "\n1. Nombre"
                    + "\n2. Raza "
                    + "\n3. Estatura"
                    + "\n4. Peso"
                    + "\n5. Años"
                    + "\n6. Descripcion"
                    + "\n7. Nacionalidad"
                    + "\n---Especifico--- ");
                     
            if ( p.get(p1)instanceof Clerigo) {
                System.out.println( "8)Dios o demonio del que es creyente"
                        + "\n 9)Tipo de invocacion");                                   
            }
            else if (p.get(p1) instanceof Barbaro) {
                System.out.println("10)Tipo de arma"
                        + "\n11) Nivel de XP");              
            }
            else if (p.get(p1) instanceof Mago) {
                System.out.println("12)Tipo de magia");                
            }
            else if (p.get(p1) instanceof Picaro) {
                System.out.println("13) Tipo de instrumento"
                        + "\n14)Cantidad de robo exitoso realizados");                          
            }
            System.out.println("15) Tipo");
            op2= lea.nextInt();
            int hp1=0;
            switch (op2) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre:");
                    String nombre= lea.next();
                    ((Personajes)p.get(p1)).setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Seleccione la nueva raza"
                            + "\n 1. Mediano"
                        + "\n2. Enano"
                        + "\n3. Elfo"
                        + "\n4. Humano\n...");
                    int op4= lea.nextInt();
                    if (op4==1) {
                        hp1= 50+rd.nextInt(60);
                         ((Personajes)p.get(p1)).setRaza("Mediano");
                          ((Personajes)p.get(p1)).setHp(hp1);
                    }
                    else if (op4==2) {
                        hp1= 80+rd.nextInt(100);
                         ((Personajes)p.get(p1)).setRaza("Enano");
                          ((Personajes)p.get(p1)).setHp(hp1);
                    }
                    else if (op4==3) {
                        hp1= 50+rd.nextInt(70);
                         ((Personajes)p.get(p1)).setRaza("Elfo");
                          ((Personajes)p.get(p1)).setHp(hp1);
                    }
                    else if (op4==4) {
                        hp1= 40+rd.nextInt(75);
                         ((Personajes)p.get(p1)).setRaza("Humano");
                          ((Personajes)p.get(p1)).setHp(hp1);
                    }
                    else{
                        System.out.println("Opcion no disponible: ");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la nueva estatura: ");
                    int est=lea.nextInt();
                    ((Personajes)p.get(p1)).setEstatura(est);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo peso: ");
                    int peso=lea.nextInt();
                    ((Personajes)p.get(p1)).setPeso(peso);
                    break;
                case 5:
                    System.out.println("Ingrese la nueva edad: ");
                    int edad=lea.nextInt();
                    ((Personajes)p.get(p1)).setEdad(edad);
                    break;
                case 6:
                    System.out.println("Ingrese la nueva descripcion: ");
                    String desc=lea.next();
                    ((Personajes)p.get(p1)).setDescripcion(desc);
                    break;
                    
                case 7:
                    System.out.println("Seleccione la nueva nacionalidad del personaje: ");
                System.out.println("1. Norfair"
                        + "\n2. Brinstar"
                        + "\n3. Maridia"
                        + "\n4. Zebes"
                        + "\n5. Crateria\n...");
                int nc = lea.nextInt();
                    if (nc==1) {
                        ((Personajes)p.get(p1)).setNacionalidad("Norfair");
                    }
                    else if (nc==2) {
                        ((Personajes)p.get(p1)).setNacionalidad("Brinstar");
                    }
                    else if (nc==3) {
                        ((Personajes)p.get(p1)).setNacionalidad("Maridia");
                    }
                    else if (nc==4) {
                        ((Personajes)p.get(p1)).setNacionalidad("Zebes");
                    }
                    else if (nc==5) {
                        ((Personajes)p.get(p1)).setNacionalidad("Crrateria");
                    }
                    else{
                        System.out.println("Opcion no disponible: ");
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el nombre del nuevo dios o demonio del que es creyente");
                    String dd= lea.nextLine(); dd=lea.next();
                    ((Clerigo)p.get(p1)).setDcreyente(dd);
                    break;
                case 9:
                    System.out.println("Ingrese el nuevo tipo de invocacion: ");
                    String invoc= lea.next();
                    ((Clerigo)p.get(p1)).setTinvocacion(invoc);
                    break;
                case 10:
                     System.out.println("Seleccione el tipo de arma del barbaro: "
                            + "\n1. Pesada"
                            + "\n2. Ligera"
                            + "\n3. Escudo\n...");
                    int ar2=lea.nextInt();
                    if (ar2==1) {
                        ((Barbaro)p.get(p1)).setArma("Pesada");
                    }
                    else if (ar2==2) {
                        ((Barbaro)p.get(p1)).setArma("Ligera");
                    }
                     else if (ar2==3) {
                        ((Barbaro)p.get(p1)).setArma("Escudo");
                    }
                     else{
                         System.out.println("Opcion no disponible ");
                     }
                    break;
                case 11:
                    System.out.println("Ingrese el nuevo nivel de Xp: ");
                    int exp= lea.nextInt();
                    ((Barbaro)p.get(p1)).setXp(exp);
                    break;
                case 12:
                    System.out.println("Seleccione el tipo de magia:"
                            + "\n1. Mago Blanco"
                            + "\n2. Mago Negro"
                            + "\n3. Sanador");
                    int mg= lea.nextInt();
                    if (mg==1) {
                        ((Mago)p.get(p1)).setMagia("Mago Blanco");
                    }
                    else if (mg==2) {
                        ((Mago)p.get(p1)).setMagia("Mago Negro");
                    }
                    else if (mg==3) {
                        ((Mago)p.get(p1)).setMagia("Sanador");
                    }
                    else{
                         System.out.println("Opcion no disponible ");
                    }
                    break;
                case 13:
                    System.out.println("Seleccione el nuevo tipo de instrumento del personaje: "
                            + "\n1. Amuleto"
                            + "\n2. Arma"
                            + "\n3. Piedra Antigua");
                    int ins= lea.nextInt();
                    if (ins ==1) {
                         ((Picaro)p.get(p1)).setInstrumento("Amuleto");
                    }
                    else if (ins ==2) {
                        ((Picaro)p.get(p1)).setInstrumento("Arma");
                    } 
                    else if (ins ==3) {
                        ((Picaro)p.get(p1)).setInstrumento("Piedra Antigua");
                    } 
                    else{
                         System.out.println("Opcion no disponible ");
                    }
                    break;
                case 14:
                    System.out.println("Ingrese la nueva cantidad de robos exitosos realizados");
                    int rb= lea.nextInt();
                    ((Picaro)p.get(p1)).setRobos(rb);
                    
                    break;
                case 15:
                     System.out.println("Seleccione el tipo del personaje: "
                        + "\n1. Lead"
                        + "\n2. Support"
                        + "\n3. Offensive"
                        + "\n4. Spammer"
                        + "\n5. Tank"
                        + "\n... ");
                int tp1=lea.nextInt();
                    if (tp1==1) {
                        ((Personajes)p.get(p1)).setTipo("Lead");
                    }
                    else if (tp1==2) {
                        ((Personajes)p.get(p1)).setTipo("Support");
                    }
                     else if (tp1==3) {
                        ((Personajes)p.get(p1)).setTipo("Offensive");
                    }
                      else if (tp1==4) {
                        ((Personajes)p.get(p1)).setTipo("Spammer");
                    }
                       else if (tp1==5) {
                        ((Personajes)p.get(p1)).setTipo("Tank");
                    }
                     else{
                         System.out.println("Opcion no disponible ");
                    }
                    
                    break;
                default:
                     System.out.println("Opcion no disponible");
                    break;
            }
            System.out.println("Se ha modificado exitosamente");
        }
        return p;
    }
    public static void Combate(ArrayList P){
        System.out.println("Seleccione el personaje con el que desea jugar : ");
        int p0 = lea.nextInt();
        if (p0 <= P.size() - 1 && P.get(p0) instanceof Personajes) {
            System.out.println(Listar(P));
            System.out.println("Seleccione el personaje contra quien desea jugar: ");
            int op8 = lea.nextInt();
            if (op8 != p0) {
                if (op8 <= P.size() - 1 && P.get(op8) instanceof Personajes) {
                    double hpj1 = ((Personajes) P.get(p0)).getHp();
                    double hpj2 = ((Personajes) P.get(op8)).getHp();
                    double CS1 = 0, CS2 = 0, DM1 = 0, DM2 = 0;
                    double bono = 0, bonoc = 0;
                    double AC1 = ((Personajes) P.get(p0)).getAc(), AC2 = ((Personajes) P.get(op8)).getAc();

                    if (P.get(p0) instanceof Clerigo || P.get(op8) instanceof Clerigo) {
                        if (P.get(p0) instanceof Clerigo) {
                            CS1 = 97;
                            DM1 = 5 + rd.nextInt(15);
                        } else if (P.get(op8) instanceof Clerigo) {
                            CS2 = 97;
                            DM2 = 5 + rd.nextInt(15);
                        }
                    } else if (P.get(p0) instanceof Barbaro || P.get(op8) instanceof Barbaro) {
                        if (P.get(p0) instanceof Barbaro) {
                            CS1 = 93;
                            DM1 = 15 + rd.nextInt(30);
                        } else if (P.get(op8) instanceof Barbaro) {
                            CS2 = 93;
                            DM2 = 15 + rd.nextInt(30);
                        }

                    } else if (P.get(p0) instanceof Mago || P.get(op8) instanceof Mago) {
                        if (P.get(p0) instanceof Mago) {
                            CS1 = 0;
                            DM1 = 5 + rd.nextInt(10);
                        } else if (P.get(op8) instanceof Mago) {
                            CS2 = 0;
                            DM2 = 5 + rd.nextInt(10);
                        }
                    } else if (P.get(p0) instanceof Picaro || P.get(op8) instanceof Picaro) {
                        if (P.get(p0) instanceof Picaro) {
                            CS1 = 80;
                            DM1 = 15 + rd.nextInt(25);
                        } else if (P.get(op8) instanceof Picaro) {
                            CS2 = 80;
                            DM2 = 15 + rd.nextInt(25);
                        }
                    }
                    if (((Personajes) P.get(p0)).getTipo().equals("Lead") || ((Personajes) P.get(op8)).getTipo().equals("Lead")) {
                        if (((Personajes) P.get(p0)).getTipo().equals("Lead") && (P.get(p0) instanceof Clerigo || P.get(p0) instanceof Barbaro)) {
                            bono = CS1 * 0.05;
                            CS1 = CS1 + bono;
                        } else if (((Personajes) P.get(op8)).getTipo().equals("Lead") && (P.get(op8) instanceof Clerigo || P.get(op8) instanceof Barbaro)) {
                            bono = CS2 * 0.05;
                            CS2 = CS2 + bono;
                        }
                    } else if (((Personajes) P.get(p0)).getTipo().equals("Support") || ((Personajes) P.get(op8)).getTipo().equals("Support")) {
                        if (((Personajes) P.get(p0)).getTipo().equals("Support") && (P.get(p0) instanceof Mago || P.get(p0) instanceof Barbaro)) {
                            bono = CS1 * 0.02;
                            CS1 = CS1 + bono;
                            bonoc = AC1*0.03;
                            AC1=AC1+bonoc;

                        } else if (((Personajes) P.get(op8)).getTipo().equals("Support") && (P.get(op8) instanceof Mago || P.get(op8) instanceof Barbaro)) {
                            bono = CS2 * 0.02;
                            CS2 = CS2 + bono;
                            bonoc = AC2*0.03;
                            AC2=AC2+bonoc;
                        }
                    } else if (((Personajes) P.get(p0)).getTipo().equals("Offensive") || ((Personajes) P.get(op8)).getTipo().equals("Offensive")) {
                        if (((Personajes) P.get(p0)).getTipo().equals("Offensive") && P.get(p0) instanceof Barbaro) {
                            bono = DM1 * 0.05;
                            DM1 = DM1 + bono;
                            hpj1=hpj1-(hpj1*0.01);
                        } else if (((Personajes) P.get(op8)).getTipo().equals("Offensive") && P.get(op8) instanceof Barbaro) {
                            bono = DM2 * 0.05;
                            DM2 = DM2 + bono;
                            hpj2=hpj2-(hpj2*0.01);
                        }
                    } else if (((Personajes) P.get(p0)).getTipo().equals("Spammer") || ((Personajes) P.get(op8)).getTipo().equals("Spammer")) {
                        if (((Personajes) P.get(p0)).getTipo().equals("Spammer") && P.get(p0) instanceof Picaro) {
                            bonoc = AC1*0.02;
                            AC1=AC1+bonoc;
                            bono = DM1 * 0.03;
                            DM1 = DM1 + bono;
                            CS1 = CS1-(CS1*0.01);
                        } else if (((Personajes) P.get(op8)).getTipo().equals("Spammer") && P.get(op8) instanceof Picaro) {
                            bonoc = AC1*0.02;
                            AC2 = AC2+bonoc;
                             bono = DM2 * 0.03;
                            DM2 = DM2 + bono;
                            CS1 = CS1-(CS1*0.01);
                        }
                    } else if (((Personajes) P.get(p0)).getTipo().equals("Tank") || ((Personajes) P.get(op8)).getTipo().equals("Tank")) {
                        if (((Personajes) P.get(p0)).getTipo().equals("Tank") && (P.get(p0) instanceof Mago || P.get(p0) instanceof Picaro)) {
                            hpj1=hpj1+(hpj1*0.02);
                        } else if (((Personajes) P.get(op8)).getTipo().equals("Tank") && (P.get(op8) instanceof Mago || P.get(op8) instanceof Picaro)) {
                             hpj2=hpj2+(hpj2*0.02);
                        }
                    }
                    while (hpj1 > 0 || hpj2 > 0) {
                        System.out.println("Turno Jugador 1: (Usuario)");
                        System.out.println("Desea \n 1. Atacar?"
                                + "\n2. Defender?");
                        int ad = lea.nextInt();
                        boolean flag0 = false;
                        while (flag0 == false) {
                            switch (ad) {
                                case 1:
                                    int ard = 1 + rd.nextInt(100);
                                    if (ard > AC2) { 
                                        if (ard> CS2) {
                                            DM1 = DM1*2;
                                        hpj2=hpj2-DM1;
                                        System.out.println("Ha acertado el doble del golpe!!");
                                        }
                                        hpj2=hpj2-DM1;
                                        System.out.println("Ha acertado eL golpe!!");
                                    }
                                    else if (ard<AC2) {
                                        System.out.println("No ha hecho daño...");
                                        
                                    }
                                    flag0 = true;
                                    break;
                                case 2:
                                    AC1 = AC1 +15;
                                    flag0 = true;
                                    break;
                                default:
                                    System.out.println("Opcion invalida, intente de nuevo!...");
                                    flag0 = false;
                            }
                            
                        }
                         System.out.println("Turno Jugador 2: ");
                        System.out.println("Desea \n 1. Atacar?"
                                + "\n2. Defender?");
                        int ad1 = lea.nextInt();
                        boolean flagp = false;
                        while (flagp == false) {
                            switch (ad) {
                                case 1:
                                    int ard = 1 + rd.nextInt(100);
                                    if (ard > AC1) { 
                                        if (ard> CS2) {
                                            DM2 = DM2*2;
                                        hpj1=hpj1-DM2;
                                        System.out.println("Ha acertado el doble del golpe!!");
                                        }
                                        hpj1=hpj1-DM2;
                                        System.out.println("Ha acertado eL golpe!!");
                                    }
                                    else if (ard<AC2) {
                                        System.out.println("No ha hecho daño...");
                                        
                                    }
                                    flag0 = true;
                                    break;
                                case 2:
                                    AC1 = AC1 +15;
                                    flag0 = true;
                                    break;
                                default:
                                    System.out.println("Opcion invalida, intente de nuevo!...");
                                    flag0 = false;
                            }
                        }

                        System.out.println("Turno Jugador 2: ");

                    }
                }
            } else {
                System.out.println("No puede seleccionarse a si mismo");
            }
        }
    }
    
}
