
package buscaminas.pkg201602478;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Buscaminas201602478 {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String opcion1;
        Scanner sn = new Scanner(System.in);
        menu objeto = new menu();
        
        
        System.out.println("             Eduardo Francisco Xoquic Poz                  ");
        System.out.println("                    201602478                              ");
        System.out.println("                 IPC A Practica 1                          ");
        System.out.println("                 ¡¡¡BUSCAMINAS!!!                          ");
        
       opcion1 = sn.nextLine();
       
       if(opcion1.equals("")){
        
           objeto.menuprincipal();
    }
              
    }
    
}
