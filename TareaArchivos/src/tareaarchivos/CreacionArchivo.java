/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaarchivos;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author gianlucasorem
 */
public class CreacionArchivo {
    
    private final String palabra;
    
    
    public CreacionArchivo(String palabra) {
        this.palabra=palabra;
    }
    
    public void LlenarArch() {
        
      System.out.println ("Entrada recibida por teclado es: \"" + palabra +"\"");
        
    }
    
}
