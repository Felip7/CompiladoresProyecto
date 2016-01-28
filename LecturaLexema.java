package App;

import java.io.*;
import java.util.logging.*;
import static App.TokenClass.*;

public class LecturaLexema {

    public void leerarchivo(String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader bf) throws IOException {
        
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
                               Especial(t,cad.charAt(i), cad, fw1, NumeroLineas);
                               break;
                           }
                       }
                       else if (Character.isLetter(cad.charAt(0))==false)
                       {
                          
                          Especial(t,cad.charAt(i), cad, fw1, NumeroLineas);
                          break;
                       }
                    }
                    if(Character.isLetter(cad.charAt(0)))
                    {
                        Identificador(cad, fw1, NumeroLineas);
                        break;
                    }
                }  
                i++;  
                NumeroLineas++;
                }
//              NumeroLineas++;
   
        } catch (IOException ex) {
            Logger.getLogger(LecturaLexema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
