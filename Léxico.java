/*Autores: Esteban Diaz, Carlos Osorio*/
package Lex;

import java.io.*;
import java.util.logging.*;

public class Léxico{

    public Léxico(String f, BufferedWriter bwriter, int lineas)
    {
        String buffer = "";
        try
        {
            DataInputStream in=new DataInputStream(new FileInputStream(f));
            FileReader freader = new FileReader("D:\\entrada.txt");
            BufferedReader breader = new BufferedReader(freader);
            
            LecturaLexema lx=new LecturaLexema();
            lx.leerarchivo(buffer, in, bwriter, breader, lineas);
                     
        } catch (IOException ex) {
        Logger.getLogger(Léxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
