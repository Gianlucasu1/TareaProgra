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
        
        
        CreacionArchivo escribiendoArch=new CreacionArchivo();
        escribiendoArch.LlenarArch();

        
        
        LeerArchivo accediendo=new LeerArchivo();
        accediendo.lee();
        
        
       
       
        
       
    
}
    }
