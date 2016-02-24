/*Esteban Díaz, Carlos Osorio*/
package Lex;

import java.io.*;

public class CrearTexto {
    
BufferedWriter bwriter;
    
    public boolean creaArchivoTexto(String Ruta, String NombreArchivo, int lineas) 
    {
        
        File archivocsv = new File(Ruta + NombreArchivo + ".csv");
            try {
                bwriter = new BufferedWriter(new FileWriter(archivocsv, false));
            } catch(Exception e) {
           System.out.println("Error de escritura del fichero");
           System.out.println(e.getMessage());
        }
            Léxico l = new Léxico("D:\\entrada.txt", bwriter, lineas);
            
            return false;
    }
}