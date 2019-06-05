/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gianlucasorem
 */
public class LeerArchivo {
    public void lee(){
    
        try {
            FileReader miArch=new FileReader("Hola.txt");
            int c=miArch.read();
            
            
            while(c!= -1){
                 char letra=(char)c;
        
        System.out.print(letra);
        
        c=miArch.read();
        
       
        
        }
        
       miArch.close();
            
           
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
    
}
