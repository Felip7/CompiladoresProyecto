/*Autores: Esteban Diaz, Carlos Osorio*/
package App;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Léxico{

    public Léxico(String f, BufferedWriter bw1){

        String bufferIn = "";
        try{
            DataInputStream in=new DataInputStream(new FileInputStream(f));
            
            FileReader fr = new FileReader("D:\\entrada.txt");
            BufferedReader bf = new BufferedReader(fr);
            //leemos nuestro archivo de entrada 
            
                LecturaLexema lx=new LecturaLexema();
                lx.leerarchivo(bufferIn, in, bw1, bf);
                     
            } catch (IOException ex) {
            Logger.getLogger(Léxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
