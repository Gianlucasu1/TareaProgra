/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivobinnum;

import java.io.IOException;

/**
 *
 * @author gianlucasorem
 */
public class ArchivoBinNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        EscribirArchivoBin miArch1= new EscribirArchivoBin();
        miArch1.crearArchBin();
        
        LeerArchivoBin miArch= new LeerArchivoBin();
        miArch.lee();
    }
    
}
