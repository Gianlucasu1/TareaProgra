/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivobinnum;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author gianlucasorem
 */
public class EscribirArchivoBin {
    
    
    public void crearArchBin() throws IOException{
        
      Scanner teclado = new Scanner(System.in);
        
      
      
        FileWriter archivo=new FileWriter("binario.txt");
        PrintWriter imprimir=new PrintWriter(archivo);
        int cont=0;
        for(int i=0; i<50; i++)
        {
            
            cont=cont+1;
            
            
            imprimir.println(cont);
        }

        archivo.close();


}
}
