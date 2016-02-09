/*Esteban Díaz, Carlos Osorio*/
package Lex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearTexto {
    
public  BufferedWriter bw;
    
    public boolean creaArchivoTexto(String strRuta, String strNombreArchivo, int lineas) {
        
        System.out.println("LÉXICO \n");
//        try {
            File archivo = new File(strRuta + strNombreArchivo + ".csv");
            
            try {
                bw = new BufferedWriter(new FileWriter(archivo, false));
            } catch(Exception e) {
           System.out.println("Error de escritura del fichero");
           System.out.println(e.getMessage());
        }
        
            Léxico l = new Léxico("D:\\entrada.txt", bw, lineas);
            
//        } catch (Exception e) {
//            System.out.println("Error al escribir: " + e.getMessage());
            return false;
        }
      
    }

