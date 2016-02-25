package Semantics;

import java.io.*;

public class Semantico {
    
public  BufferedWriter bw1;
        
public Semantico(int lineas1) throws FileNotFoundException, IOException{ 
     
    File archivo = new File("D:\\tipos.txt");
        try 
            {
                bw1 = new BufferedWriter(new FileWriter(archivo, false));
            } catch(Exception e) {
           System.out.println("Error de escritura del fichero");
           System.out.println(e.getMessage());
        }
        extraerSintactico(lineas1,bw1);
}

public void extraerSintactico(int lineas1, BufferedWriter bw1) throws FileNotFoundException, IOException
{
     String bufferIn = "";
     DataInputStream in=new DataInputStream(new FileInputStream("D:\\simbolos.txt"));
     FileReader fr1 = new FileReader("D:\\simbolos.txt");
     BufferedReader br = new BufferedReader(fr1);
     Extraer e=new Extraer("D:\\simbolos.txt", bw1, br, bufferIn, in, lineas1);    
}
}
