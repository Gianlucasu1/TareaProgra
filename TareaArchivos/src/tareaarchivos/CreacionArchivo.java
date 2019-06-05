/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gianlucasorem
 */
public class CreacionArchivo {
    
    
    
    public void LlenarArch() {
        
     
         for(int i=0; i<50; i++){
        
            System.out.println("Escribe una palabra");
            String entradaTeclado = "";

            Scanner entradaEscaner = new Scanner (System.in);
            entradaTeclado = entradaEscaner.nextLine ();

          try {
              FileWriter escritura=new FileWriter("/Users/gianlucasorem/Desktop/Hola.txt");
              
             escritura.write(entradaTeclado);
             escritura.close();
             
          } catch (IOException ex) {
              Logger.getLogger(CreacionArchivo.class.getName()).log(Level.SEVERE, null, ex);
          }
             
        }
       
    }
    
}
