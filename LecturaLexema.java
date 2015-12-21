package App;

import static App.TokenClass.Especial;
import static App.TokenClass.Letra;
import static App.TokenClass.Numeros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaLexema {

    public void leerarchivo(String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader bf) {
        int NumeroLineas=1;
        try
        {
        while((bufferIn=in.readLine())!=null && bf.readLine()!=null)
        {
           
            //mientras no se llegue al fin de archivo
                    int i=0;
                    String cad=bufferIn.trim();
                    //eliminar espacios en blanco al inicio o al final (pero no a la mitad)
                    while(i<cad.length())
                    {//recorremos la línea
                        
                        char t=cad.charAt(i);//vamos leyendo caracter por caracter
                        if(Character.isDigit(t))
                        {//comprobamos si es un digito
                            Numeros(t, cad, fw1, NumeroLineas);
                            break;
                        }
//                        end if si es Digito    
                        else if(Character.isLetter(t))
                        {//comprobamos si es una letra
                            
                            Letra(t,cad, fw1, NumeroLineas );
                            break;
                        }
                             
//                              mientras el siguiente elemento no sea una letra o un digito
                        else  if (Character.isLetterOrDigit(cad.charAt(0))==false ) {
                           
                            Especial(t,cad.charAt(i), cad,fw1,NumeroLineas);
                            break;
                        }
                        i++;
                    }
                    
                    NumeroLineas++;
                    }
        
        
        } catch (IOException ex) {
            Logger.getLogger(LecturaLexema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
