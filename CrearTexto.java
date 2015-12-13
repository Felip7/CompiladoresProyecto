
package App;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearTexto {
    
    public  BufferedWriter bw;;
    
    public boolean creaArchivoTexto(String strRuta, String strNombreArchivo) {
//        try {
            File archivo = new File(strRuta + strNombreArchivo + ".csv");

        try {
           
            bw = new BufferedWriter(new FileWriter(archivo, false));
            
        }
        catch(Exception e) {
           System.out.println("Error de escritura del fichero");
           System.out.println(e.getMessage());
        }
        
            Léxico ds = new Léxico("D:\\entrada.txt", bw);

//        } catch (Exception e) {
//            System.out.println("Error al escribir: " + e.getMessage());
//            return false;
//        }
        return true;
    }


    
   
      public static void main(String ar[]) {
        
        CrearTexto ct=new CrearTexto();
        ct.creaArchivoTexto("D:\\", "salida");

    }

    
    
    
    
}
