/*Esteban Díaz, Carlos Osorio*/
package Lex;

import Control.Etapas;
import java.io.*;
import java.util.logging.*;
import static Lex.TokenClass.*;

public class LecturaLexema {

public void leerarchivo(String buffer, DataInputStream in, BufferedWriter fwriter, 
                        BufferedReader breader, int lineas) throws IOException {
    
    int NumeroLineas=1;
        try
        {
            //mientras no se llegue al fin de archivo
            while((buffer=in.readLine())!=null && breader.readLine()!=null)
            {
                int i=0;
                //elimina espacios en blanco al inicio o al final (pero no a la mitad)
                String cad=buffer.trim();
                
                //recorremos la línea
                while(i<cad.length())
                {
                    char t=cad.charAt(i);//vamos leyendo caracter por caracter

                    if(Character.isDigit(t))
                    {
                        Numeros(cad, fwriter, NumeroLineas);
                        break;
                    }
                    else if (Character.isLetterOrDigit(cad.charAt(0))==false ) 
                    {
                       if (cad.length()>=2)
                       {
//                           System.out.println(cad+""+cad.length());
                           if(Character.isLetter(cad.charAt(1)))
                           {
                               Identificador(cad, fwriter, NumeroLineas);
                               break;
                           }
                           else if(Character.isLetter(cad.charAt(2)))
                           {
                               Identificador(cad, fwriter, NumeroLineas);
                               break;
                           }
                           else
                           {
                               Especial(t,cad, fwriter, NumeroLineas);
                               break;
                           }
                       }
                       else if (Character.isLetter(cad.charAt(0))==false)
                       {
                          Especial(t, cad, fwriter, NumeroLineas);
                          break;
                       }
                    }
                    if(Character.isLetter(cad.charAt(0)))
                    {
                        Identificador(cad, fwriter, NumeroLineas);
                        break;
                    }
                }
                i++;  
                NumeroLineas++;
                Etapas et=new Etapas();
                et.recuperar(NumeroLineas);
                }
        }catch (IOException ex) {
            Logger.getLogger(LecturaLexema.class.getName()).log(Level.SEVERE, null, ex);}
    }
}
