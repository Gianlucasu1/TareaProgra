/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos;
import java.util.Scanner;


/**
 *
 * @author gianlucasorem
 */
public class TareaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        LeerArchivo accediendo=new LeerArchivo();
        accediendo.lee();
        
        /*for(int i=0; i<50; i++){
        
            System.out.println("Escribe una palabra");
            String entradaTeclado = "";

            Scanner entradaEscaner = new Scanner (System.in);
            entradaTeclado = entradaEscaner.nextLine ();

             CreacionArchivo arch=new CreacionArchivo(entradaTeclado);
             arch.LlenarArch();
        }
       */
        
        
        
       
    
}
    }
