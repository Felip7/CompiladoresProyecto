/*Esteban Díaz, Carlos Osorio*/
package Lex;

import Control.Etapas;
import java.io.*;
import java.util.logging.*;
import static Lex.TokenClass.*;

public class LecturaLexema {

public void leerarchivo(String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader bf, int lineas) throws IOException {
        
        int NumeroLineas=1;
        try
        {
            //mientras no se llegue al fin de archivo
            while((bufferIn=in.readLine())!=null && bf.readLine()!=null)
            {
                int i=0;
                //elimina espacios en blanco al inicio o al final (pero no a la mitad)
                String cad=bufferIn.trim();
                
                //recorremos la línea
                while(i<cad.length())
                {
                    char t=cad.charAt(i);//vamos leyendo caracter por caracter
                    
                    if(Character.isDigit(t))
                    {
                        Numeros(t, cad, fw1, NumeroLineas);
//                        System.out.println(NumeroLineas);
                        break;
                    }
                    
                    else if (Character.isLetterOrDigit(cad.charAt(0))==false ) 
                    {
                       if (cad.length()>=2)
                       {
                           if(Character.isLetter(cad.charAt(1)))
                           {
                               
                               Identificador(cad, fw1, NumeroLineas);
                              
                               break;
                           }
                           else
                           {
//                               System.out.println("kk"+NumeroLineas);
                               Especial(t,cad, fw1, NumeroLineas);
                               break;
                           }
                       }
                       else if (Character.isLetter(cad.charAt(0))==false)
                       {
                          
//                          System.out.println(NumeroLineas);
                          Especial(t, cad, fw1, NumeroLineas);
                          
                          break;
                       }
                    }
                    if(Character.isLetter(cad.charAt(0)))
                    {
//                        System.out.println(NumeroLineas);
                        Identificador(cad, fw1, NumeroLineas);
                        
                        break;
                    }}
                i++;  
                NumeroLineas++;
                
                Etapas et=new Etapas();
                et.recuperar(NumeroLineas);
                }
//              NumeroLineas++;
        }catch (IOException ex) {
            Logger.getLogger(LecturaLexema.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
