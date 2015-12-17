package App;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TokenClass {
    
    
    public static boolean evaluarCaracter(char c) {

        switch (c) {
            case '(':
                return true;
            case ',':
                return true;
            case ':':
                return true;
            case ';':
                return true;
            case '<':
                return true;
            case '>':
                return true;
            case '{':
                return true;
            case '[':
                return true;
            case ']':
                return true;
            case '*':
                return true;
            case ')':
                return true;
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case '!':
                return true;
            case '}':
                return true;
            case '&':
                return true;
            case '$':
                return true;
            case '=':
                return true;
            case '"':
                return true;

        }
        return false;
    }

    public static boolean operando(String c) {
//        <= >= == != && ||

        switch (c) {
            case ">=":
                return true;
            case "<=":
                return true;
            case "==":
                return true;
            case "!=":
                return true;
            case "&&":
                return true;
            case "||":
                return true;
            case "++":
                return true;
            case "+=":
                return true;
        }
        return false;
    }

    public static boolean palabraReservada(String cad) {
//        int, float, bool, char, string, if, then, else, while, do, input, output, return
        switch (cad) {
            case "int":
                return true;
            case "float":
                return true;
            case "bool":
                return true;
            case "char":
                return true;
            case "string":
                return true;
            case "if":
                return true;
            case "then":
                return true;
            case "else":
                return true;
            case "while":
                return true;
            case "do":
                return true;
            case "input":
                return true;
            case "output":
                return true;
            case "return":
                return true;
            case "true":
                return true;
            case "false":
                return true;
            case "for":
                return true;
            

        }
        return false;

    }
    
   public static boolean encabezado(String cad)
   {
       switch(cad)
       {
       case "include":
       return true;
       }
       return false;
   }
   public static boolean espacio(char t){
       char c=' ';
   
                if(t==c)
                {
                    //Programa ignora espacios vacíos
                }
                 
        return true;
    }
   
   public static boolean Especial(char t, String cad, BufferedWriter fw1, int NroL)
   { 
       try {
       if(cad.length()==1)
       {

                            if (evaluarCaracter(t)) {
                               
                                    System.out.println("Caracter especial, " + t);
                                    fw1.write("Caracter especial, " + t);
                                    fw1.newLine();
                                    fw1.flush();
                                
                            
                            } 
                            else if(evaluarCaracter(t)==false)
                                    
                            {
                                 System.out.println("ERROR "+t+ " en línea "+NroL);
                                 
                                
                            }
       
           return true;
       }
       else if(cad.length()==2)
       
       {
           
           Operando(t, cad, fw1, NroL);
           
       }
       else if (cad.length()>2)
       {
             String ora="";
             ora+=cad.charAt(0);
             ora+=cad.charAt(1);
             ora+=cad.charAt(2);
            System.out.println(ora+" es Operador no definido, ERROR "+"en línea " +NroL);
           
       }
       }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
       return false;
   }
   
   public static boolean Operando(char t, String cad, BufferedWriter fw1, int NroL)
   {
   try {
       String ora="";
       ora+=cad.charAt(0);
       ora+=cad.charAt(1);

     
                        if (operando(ora)) 
                         {
           
                            System.out.println("Operando compuesto, " + ora);
                            fw1.write("Operando compuesto, " + ora);
                            fw1.newLine();
                            fw1.flush();
                            return true;
           
                            }
                            else 
                            {
                                 System.out.println(ora+" es Operador no definido, ERROR "+"en línea " +NroL);

                            }
                
        
   }               catch (IOException ex) {
               Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
           }
        return false;
   }
   
   public static boolean Letra(char t,int i, int j, String cad,  BufferedWriter fw1)
   {
       try    
       {
           if(cad.length()==1)
           {
               System.out.println("Identificador, "+t);
                             
                                fw1.write("Identificador, "+t);
                                fw1.newLine();
                                 fw1.flush();
           }
           else{            
           
                            String ora="";
                            ora+=t;
                            j=i+1;
                            while(Character.isLetterOrDigit(cad.charAt(j))){
//                            mientras el siguiente elemento sea una letra o un digito
//                            ya que las variables pueden ser con numeros
                                ora+=cad.charAt(j);
                                j++;
                                if(j==cad.length()){
                                     break; 
                                }
                                  
                            }
                            i=j;
                           
                            
                            if(palabraReservada(ora))
                            
                            {//comprobamos si es una palabra reservada
                                System.out.println("Palabra reservada, "+ora);
                                
                                fw1.write("Palabra reservada, "+ora);
                                fw1.newLine();
                                 fw1.flush();
                            }
                            else if (encabezado(ora))
                            {
                                System.out.println("Encabezado, "+ora);
                                
                                fw1.write("Encabezado, "+ora);
                                fw1.newLine();
                                 fw1.flush();
                            }
                             else
                            {//caso contrario es un identificador o variable
                                System.out.println("Identificador, "+ora);
                             
                                fw1.write("Identificador, "+ora);
                                fw1.newLine();
                                 fw1.flush();
                            }
           }
       }    catch (IOException ex) {
               Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
           }
       return false;
   }
   
}


