/*Esteban Díaz, Carlos Osorio*/
package Syntax;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public final class Sintactico {

public  BufferedWriter bw1;
        
public Sintactico(int lineas1){ 
         
        System.out.println("\nSINTACTICO");
        File archivo = new File("D:\\simbolos.txt");
            
            try 
            {
                bw1 = new BufferedWriter(new FileWriter(archivo, false));
            } catch(Exception e) {
           System.out.println("Error de escritura del fichero");
           System.out.println(e.getMessage());
        }
        
        archivo("D:\\salida.csv", bw1, lineas1);
    }
    
public void archivo(String rutaArchivo, BufferedWriter bw1, int lineas1)
{
        String bufferIn = "";
        try
        {
            DataInputStream in=new DataInputStream(new FileInputStream(rutaArchivo));

            FileReader fr1 = new FileReader("D:\\salida.csv");
            BufferedReader br = new BufferedReader(fr1);
            
            leerCSV csv=new leerCSV(lineas1,bufferIn, in, bw1, br);
        
            
        } catch (IOException ex) {
        Logger.getLogger(Sintactico.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}


}
  
