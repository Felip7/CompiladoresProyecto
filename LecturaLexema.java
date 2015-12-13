package App;

import static App.TokenClass.Especial;
import static App.TokenClass.Letra;
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
                        int j=i+1;
                      
                        if(Character.isDigit(t))
                        {//comprobamos si es un digito
                            String ca="";
                            ca+=t;
                          
                           if (cad.length()==1)
                                   {
                                       System.out.println("Número: "+t);
                                    fw1.write("Numero: "+t+",");
                                    fw1.newLine();
                                    fw1.flush(); 
                                    break;
                                   }
                           
                          
                                                               
                              if(cad.length()==2)
                              {
                                   if(Character.isDigit(cad.charAt(j)))
                                   {
                                       while(j!=cad.length())
                                       {
                                           // mientras el siguiente elemento sea un numero
                                           
                                           ca+=cad.charAt(j);//concatenamos
                                           j++;
                                           System.out.println("Número: "+ca);
                                           fw1.write("Numero: "+ca+",");
                                           fw1.newLine();
                                           fw1.flush();
                                        }
                                     i=j;              
                                    }
                                   else if(Character.isLetter(cad.charAt(1)))
                                  {
                                         System.out.println(cad+" ERROR "+"en línea " +NumeroLineas);
                                          break;
                                  }
                                   break;
                              }
                               
                             
                                 
                            if(cad.length()==3)
                              {
                                  if(Character.isDigit(cad.charAt(2)))
                                   {
                                      
                                           // mientras el siguiente elemento sea un numero
                                           String sd="";
                                           sd+=cad.charAt(0);//concatenamos
                                           sd+=cad.charAt(1);
                                           sd+=cad.charAt(2);
                                           
                                          
                                           System.out.println("Número: "+sd);
                                           fw1.write("Numero: "+sd+",");
                                           fw1.newLine();
                                           fw1.flush();
                                         j++;
                                     i=j;             
                                   }
                                  
                                  else if(Character.isLetter(cad.charAt(2))==true)
                                  {
                                         System.out.println(cad+" ERROR "+"en línea " +NumeroLineas);
                                          break;
                                  }
                               break;
                              
                              }
                               
                                if(cad.length()==4)
                              { 
                                   if(Character.isDigit(cad.charAt(j)) && j!=cad.length())
                                   {
//                                       while(j!=cad.length())
//                                       {
//                                            mientras el siguiente elemento sea un numero
                                           String sd="";
                                           sd+=cad.charAt(1);//concatenamos
                                           sd+=cad.charAt(2);
                                           sd+=cad.charAt(3);
                                           System.out.println("Número: "+t+sd);
                                           fw1.write("Numero: "+ca+sd+",");
                                           fw1.newLine();
                                           fw1.flush();
                                           j++;
                                        }
                                     i=j;              
//                                    }
                               break;
                                     
                           }   
                        }
//                        end if si es Digito    
                        else if(Character.isLetter(t))
                        {//comprobamos si es una letra
                            
                            Letra(t,i,j,cad, fw1);
                            break;
                        }
                             
//                              mientras el siguiente elemento no sea una letra o un digito
                        else  if (Character.isLetterOrDigit(cad.charAt(0))==false ) {
                           
                            Especial(t,cad,fw1,NumeroLineas);
                            break;
                        }
                    }
                    
                    NumeroLineas++;
        }
        
        } catch (IOException ex) {
            Logger.getLogger(LecturaLexema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
