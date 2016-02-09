/*Autores: Esteban Diaz, Carlos Osorio*/
package Lex;

import java.io.*;
import java.util.logging.*;

public class Léxico{

    public Léxico(String f, BufferedWriter bw1, int lineas){

        String bufferIn = "";
        try
        {
            DataInputStream in=new DataInputStream(new FileInputStream(f));
            FileReader fr = new FileReader("D:\\entrada.txt");
            BufferedReader bf = new BufferedReader(fr);
            
            LecturaLexema lx=new LecturaLexema();
            lx.leerarchivo(bufferIn, in, bw1, bf, lineas);
                     
        } catch (IOException ex) {
        Logger.getLogger(Léxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

