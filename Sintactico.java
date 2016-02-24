/*Esteban Díaz, Carlos Osorio*/
package Syntax;

import java.io.*;
import java.util.logging.*;
 
public final class Sintactico {

BufferedWriter bwriter;
        
public Sintactico(int lineas1)
{ 
    File archivo = new File("D:\\simbolos.txt");
            
        try {
            bwriter = new BufferedWriter(new FileWriter(archivo, false));
            } catch(Exception e) {
           System.out.println("Error de escritura del fichero");
           System.out.println(e.getMessage());
        }
    archivo("D:\\salida.csv", bwriter, lineas1);
}
    
public void archivo(String rutaArchivo, BufferedWriter bw1, int lineas1)
{
        String buffer = "";
        try
        {
            DataInputStream in=new DataInputStream(new FileInputStream(rutaArchivo));

            FileReader freader = new FileReader("D:\\salida.csv");
            BufferedReader breader = new BufferedReader(freader);
            
            leerCSV csv=new leerCSV(lineas1,buffer, in, bw1, breader);

        } catch (IOException ex) {Logger.getLogger(Sintactico.class.getName()).log(Level.SEVERE, null, ex);}  
}
}  
