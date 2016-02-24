package GenCod;

import java.io.*;
import java.util.logging.*;

public class Gencod {
    
BufferedWriter bw1;
Reg csv;
        
public Gencod(int lineas1){
    File archivo = new File("D:\\gc.asm");
    archivo("D:\\simbolos.txt", bw1, lineas1);
    }

public Gencod(String[] st) { 
      System.out.println("\nGENERACIÓN DE CÓDIGO");
      csv = new Reg(st);}
    
public void archivo(String rutaArchivo, BufferedWriter bw1, int lineas1)
{
        String buffer = "";
        try{
            DataInputStream in=new DataInputStream(new FileInputStream(rutaArchivo));

            FileReader fr1 = new FileReader("D:\\simbolos.txt");
            BufferedReader br = new BufferedReader(fr1);
            csv=new Reg(lineas1, buffer, in, bw1, br);
        } catch (IOException ex) {Logger.getLogger(Gencod.class.getName()).log(Level.SEVERE, null, ex); }  
}
}
