package App;
import Lexico.Leer;
import java.io.*;

import java.util.*;
class dosPrueba1{
    

    public dosPrueba1(String f){
        String bufferIn="";
        try{
            DataInputStream in=new DataInputStream(new FileInputStream(f));//leemos nuestro archivo de entrada 
            try{
                do
                {//mientras no lleguemos al fin del archivo...
                    int i=0;
                    String cad=bufferIn.trim();
                    //eliminamos los espacios en blanco al incio o al final (pero no a la mitad)
                    while(i<cad.length())
                    {//recorremos la línea
                        char t=cad.charAt(i);//vamos leyendo caracter por caracter
                        int j=i+1;
                        if(Character.isDigit(t))
                        {//comprobamos si es un digito
                            String ora="";
                            ora+=t;
//                            int j=i+1;
                            while(Character.isDigit(cad.charAt(j))){
                           // mientras el siguiente elemento sea un numero
                                ora+=cad.charAt(j);//concatenamos
                                j++;
                                if(j==cad.length())break;//rompemos si llegamos al final de la línea
                            }
                            i=j;//movemos a nuestra variable i en la cadena
                            System.out.println("Número-->"+ora);
                            continue;//pasamos al siguiente elemento
                        }//end if si es Digito
                       
                        else if(Character.isLetter(t))
                        {//comprobamos si es una letra
                            String ora="";
                            ora+=t;
//                            int j=i+1;
                            while(Character.isLetterOrDigit(cad.charAt(j))){
//                            mientras el siguiente elemento sea una letra o un digito
//                            ya que las variables pueden ser con numeros
                                ora+=cad.charAt(j);
                                j++;
                                if(j==cad.length())break;
                            }
                            i=j;
                           
                            if(palabraReservada(ora))
                            
                            {//comprobamos si es una palabra reservada
                                System.out.println("Palabra reservada: "+ora);
                            }
                            else
                            {//caso contrario es un identificador o variable
                                System.out.println("Identificador: "+ora);
                            }
                            
                        }
                             
                             
                             else if(!Character.isLetterOrDigit(cad.charAt(j)))
                            {String ora="";
                             ora+=t;
//                            int j=i+1;
                            //mientras el siguiente elemento no sea una letra o un digito
//                            literal(cad);
                                ora+=cad.charAt(j);
                                j++;
                                if(j==cad.length())
                                    break;
                            
                            
                            i=j;
                            if(evaluarCaracter(t))
                            {
                                System.out.println("Operando compuesto: "+t);
                            }
                            else 
                            {

                                if(evaluarCaracter(t))
                                {
                                    System.out.println("Caracter especial: "+t);
                                }
                            } 
                          }
                        }
                        

                     
            
                }while((bufferIn=in.readLine())!=null);
                //end while
            }catch(IOException e){}
        }catch(FileNotFoundException e){}
    }
     

    public static boolean evaluarCaracter(char c){
       
        switch(c)
        {
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
            case ']':
                return true;
            case '[':
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

            case '&':
                return true;
            case '$':
                    return true;
            case '=':
                return true;   
                

        }
        return false;
    }
     
    public static boolean operando(String c){
//        <= >= == != && ||
    
        switch(c)
        {
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
        }
        return false;
    }
     

    public static boolean palabraReservada(String cad){
//        int, float, bool, char, string, if, then, else, while, do, input, output, return
        switch(cad)
        {
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

        }
        return false;
        
        
    }
    
    
   public static boolean literal(String cad){

        switch(cad)
        {
            case "int":
                return true;
          
        }
        return false;
        
        
    }
   
    
    public static void main(String ar[]){
        
        //Leer lexema;
//        lexema = new Leer("entrada.txt");
        dosPrueba1 ds = new dosPrueba1("entrada_prueba_3.txt");

    }

    }