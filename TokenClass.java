/*Esteban Díaz, Carlos Osorio*/
package Lex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;

public class TokenClass {
        
public static boolean Numeros(char n, String num, BufferedWriter fw1, int nrol) 
{
        try
        {
//             System.out.println(num+"_"+num.length());
                switch(num.length())
                {
                    case 1:
                        if(Character.isDigit(num.charAt(0)))
                        {
                            System.out.println(nrol+" Número, "+num);
                            fw1.write(nrol+" Numero, "+num);
                            fw1.newLine();
                            fw1.flush();
                        }
                    return true;
             
                    case 2: 
                        if(Character.isDigit(num.charAt(1)) && Character.isLetter(num.charAt(0))){
                            Concatenar(num, fw1, nrol); 
                            return true;}
                        else if(Character.isLetter(num.charAt(1)) && Character.isDigit(num.charAt(0))){
                            System.out.println(num+" es ERROR LÉXICO "+"en línea " +nrol);
                            return false;}
                        else{
                            System.out.println(nrol+" Número, "+num);
                            fw1.write(nrol+" Numero, "+num);
                            fw1.newLine();
                            fw1.flush();
                            return true;
                        }

                    case 3:
                        if(Character.isDigit(num.charAt(2)) && Character.isLetter(num.charAt(1)))
                        {System.out.println(num+" es ERROR LÉXICO en línea " +nrol);
                        return false;}
                        else if(Character.isLetter(num.charAt(2)))
                        {System.out.println(num+" es ERROR LÉXICO en línea " +nrol);
                        return false;}
                        else if(Character.isDigit(num.charAt(0)) && Character.isLetter(num.charAt(1)))
                        {System.out.println(num+" es ERROR LÉXICO en línea " +nrol);
                        return false;}
                        else {{
                            System.out.println(nrol+" Número, "+num);
                            fw1.write(nrol+" Numero, "+num);
                            fw1.newLine();
                            fw1.flush();
                            return true;
                        }}
                                                                   
                    case 4:  
                        Concatenar(num, fw1, nrol);
                        return true;
                }    
                    
                if (num.length()>=5)        
                {    
                        for(int y=1;y<num.length();y++)
                        {
                            if(Character.isLetter(num.charAt(y)))
                            {System.out.println("ERR1OR LÉXICO en línea " +nrol);
                            y++;}
                        }        
                }
        }  catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}

public static void Concatenar(String cad, BufferedWriter fw1, int nrol)
{
        try {
            String concat="";
            int longitud=cad.length();
            for(int x=0; x<longitud; x++)
            {concat+=cad.charAt(x);}
            System.out.println(nrol+" Número, "+concat);
            fw1.write(nrol+" Numero, "+concat);
            fw1.newLine();
            fw1.flush();
        } catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public static boolean Especial(char t, String cad, BufferedWriter fw1, long NroL)
{ 
    if(!Character.isLetterOrDigit(cad.charAt(0))){
//       System.out.println(cad.length()+"*"+cad);
       
       switch(cad.length())
       {
           case 1:
               if (CaracterEsp(t, fw1, NroL)) {return true;}
               else {
                   System.out.println("ERROR L2ÉXICO "+t+ " en línea "+NroL);
               return false;}
           
           case 2:
               operandoB(cad, fw1, NroL); 
       }
               
       if (cad.length()>2)
       {
             vectores(cad, fw1, NroL);
       }
       else
       {
           String ora="";
             ora+=cad.charAt(0);
             ora+=cad.charAt(1);
             ora+=cad.charAt(2);
            System.out.println(ora+" es Operador no definido, ERROR LÉXICO "+"en línea " +NroL);
       }
}
       return false;
   }

public static boolean operandoB(String cad, BufferedWriter fw1, long NroL)
{
       String ora="";

           char div=cad.charAt(1);
//           System.out.println(div+"div");
           
           if(Character.isLetterOrDigit(div)==false)//Si es simbolo entonces
           {
               ora+=cad.charAt(0);
               ora+=cad.charAt(1);
        
                        if (operadores(ora, fw1, NroL)){return true;}
                        else{System.out.println(ora+" Operador no definido, ERROR LÉXICO een línea " +NroL);}
           }
           else
           {
               System.out.println(cad+" Operador no definido, ERROR LÉXICO een línea " +NroL);
           }
        return false;
   }

public static boolean CaracterEsp(char c, BufferedWriter fw1, long NumeroLineas) 
{
        
        try
        {
        switch (c) {
            case '(':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
                
            case ',':
                                    System.out.println(NumeroLineas+" Coma, " + c);
                                    fw1.write(NumeroLineas+" Coma, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ':':
                                    System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ';':
                                    System.out.println(NumeroLineas+" Terminador, " + c);
                                    fw1.write(NumeroLineas+" Terminador, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '<':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorunario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '>':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorunario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '{':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" InicioFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '[':
                 System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ']':
                 System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '*':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorunar1o, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ')':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '+':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorunar1o, " + c );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '-':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorunar1o, " + c);
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '/':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorunar1o, " + c );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '!':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c);
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '}':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" TerminadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '&':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '$':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '=':
                System.out.println(NumeroLineas+" Operador unario, " + c);
                                    fw1.write(NumeroLineas+" Operadorasignacion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '"':
                System.out.println(NumeroLineas+" Caracter especial, " + c);
                                    fw1.write(NumeroLineas+" Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            default:
                System.out.println("Caracter especial no definido " + c);
                break;
                
        }        }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
         return false;
    }

public static boolean operadores(String c, BufferedWriter fw1, long nrol)
{
//        <= >= == != && ||
        try{
        switch (c) {
            case ">=":
                System.out.println(nrol+" Operador binario, " + c);
                                    fw1.write(nrol+" Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "<=":
                System.out.println(nrol+" Operador binario, " + c);
                                    fw1.write(nrol+" Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "==":
                System.out.println(nrol+" Operador binario, " + c);
                                    fw1.write(nrol+" Operadorb1nario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "!=":
                System.out.println(nrol+" Op3rador binario: " + c);
                                    fw1.write(nrol+" Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "&&":
                System.out.println(nrol+" Operador binario: " + c);
                                    fw1.write(nrol+" Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "||":
                System.out.println(nrol+" Operador binario: " + c);
                                    fw1.write(nrol+" Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "++":
                System.out.println(nrol+" Operador binario: " + c);
                                    fw1.write(nrol+" Operadorbinar1o, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "+=":
                System.out.println(nrol+" Operador binario: " + c);
                                    fw1.write(nrol+" Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
        }
        }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
        return false;
    }
   
public static boolean funcion(String part1, BufferedWriter fw1, int nrol) throws IOException
{
        try
        {
        //System.out.println(part1+" -");
         if (part1.equals(":void:")||part1.equals(":int:")|| part1.equals(":float:")|| 
                 part1.equals(":string:")||part1.equals(":bool:")||part1.equals(":char:"))
         {
                    System.out.println(nrol+" Tipo de valor de retorno " +part1);
                        fw1.write(nrol+" Tipovalorretorno, " + part1);
                        fw1.newLine();
                        fw1.flush();
                        return true;
         }
         else if (palabraRes(part1, fw1, nrol)){ return false;}
////         else{System.out.println("3RROR LÉXICO en línea " +nrol); 
////         return false;}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}
 
public static boolean palabraRes (String cad, BufferedWriter fw1, int nrol)
{
        try
        {
                    if(cad.equals("int")|| cad.equals("float")|| cad.equals("string")
                            ||cad.equals("bool")||cad.equals("char") || cad.equals("int:")
                            || cad.equals("float:")|| cad.equals("string:")
                            ||cad.equals("bool:")||cad.equals("char:"))
                    {
                        System.out.println(nrol+" Tipo de dato, " +cad);
                        fw1.write(nrol+" Tipodedato, " + cad   );
                        fw1.newLine();
                        fw1.flush();
                        return true;
                    }
                    else if (palabraReservada(cad, fw1,nrol)){ return false;}
//                    System.out.println("ERROR LÉXIC{O en línea " +nrol); return false;  
         }catch (IOException ex) 
         {Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);}
     return false;   
    }
 
public static boolean palabraReservada(String cad, BufferedWriter fw1, int nrol) {
//        int, float, bool, char, string, if, then, else, while, do, input, output, return

        try
        {    
//            System.out.println(cad+"cad");
        switch (cad) {
            
            case "if":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservadaf, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                                    return true;
            case "then":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservadag, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "else":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservadat, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "while":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservada1, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "do":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservada2, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "input":
                System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "output":
                System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write(nrol+" Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "return":
                System.out.println(nrol+" Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "true":
                System.out.println(nrol+" Valor booleano, "+cad);
                                    fw1.write(nrol+" Valorbooleano, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "false":
                System.out.println(nrol+" Valor booleano, "+cad);
                                        fw1.write(nrol+" Valorbooleano, "+cad   );
                                        fw1.newLine();
                                        fw1.flush();
                return true;
            case "void":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                       fw1.write(nrol+" Palabrareservada, "+cad   );
                                       fw1.newLine();
                                       fw1.flush();
                return true;
            case "null":
                 System.out.println(nrol+" Palabra reservada, "+cad);
                                       fw1.write(nrol+" Palabrareservada, "+cad   );
                                       fw1.newLine();
                                       fw1.flush();
                return true;
            default:
                Letra(cad, fw1, nrol);
                return false;

        }
          }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
        return false;

    }

public static boolean vectores(String c, BufferedWriter fw1, long nrol)
{
    try{
//        System.out.println(c+"j");
        switch (c) {
            case "[]:":
                //Inicializar vectores vacíos
                c="[0]:";
                System.out.println(nrol+" (asignado) operador de Funcion vacio, " + c );
                                    fw1.write(nrol+" operadorFuncionvacio, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[0]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[1]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[2]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[3]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;    
            case "[4]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[5]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;     
            case "[6]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[7]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[8]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[9]:":
                System.out.println(nrol+" operadorFuncion, " + c);
                                    fw1.write(nrol+" operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;    
             default:
                 
                 Especial(c.charAt(0), c, fw1, nrol);
                 return false;
        }}catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
        return false;
     }

public static boolean Identificador (String cad, BufferedWriter fw1, int nrol) throws IOException
{
        String part1;
        if (cad.contains(" "))
        {
            String [] palabras = cad.split(" ");
//            System.out.println(palabras.length+"#");
            
            for (int z=0; z<palabras.length; z++) {
                part1 = palabras[z];
//                System.out.println("_" +part1);
                if(funcion(part1, fw1, nrol)){}
                else if(Especial(part1.charAt(0), part1, fw1, nrol)){}
            }
        }
        else
        {
//            System.out.println("ve");
            if(funcion(cad, fw1, nrol)){}
            else if(Especial(cad.charAt(0), cad, fw1, nrol)){}
        }
     return false;   
    }

public static boolean Letra(String cad, BufferedWriter fw1, int nrol) throws IOException
{
       try    
       {
//           System.out.println(cad.length()+"_"+cad);
           switch(cad.length())
                {
                    case 1:
                        if(Character.isLetter(cad.charAt(0))){
                            id(cad, fw1,nrol);
                        return true;
                        }
                    case 2:
                        if(Character.isLetter(cad.charAt(cad.length()-1))==true)
                        {   
                            id(cad, fw1,nrol);
                              return true;
                        }
                        else if(Character.isDigit(cad.charAt(cad.length()-1)))
                        {
                           id(cad, fw1,nrol);
                             return true;
                        }
                        else if(Character.isLetterOrDigit(cad.charAt(cad.length()-1))==false)
                        {   if(Character.isLetter(cad.charAt(0)))
                            {  
//                                System.out.println("Se esperaba una letra. ERROR LÉXICO "+"en línea " +nrol);
                            return false;
                            }
                        } 
                    
                    case 3:  
                        if(Character.isLetter(cad.charAt(0))) 
                        {
//                            System.out.println(cad.charAt(0)+" "+cad.charAt(cad.length()-1));
                            
                            if (Character.isDigit(cad.charAt(1)) && Character.isLetter(cad.charAt(2)))
                            {
                                System.out.println("4ERROR LÉXICO "+"en línea " +nrol);
                            }
                            else {id(cad, fw1,nrol);}
                        }                    
                        return true;
           }
           
           if (cad.length()>=4&&Character.isLetter(cad.charAt(0)))        
                {    
//                    System.out.println(cad+">");
                    int x=0;
                    while(x!=cad.length()){
                       if (Character.isLetter(cad.charAt(x)))
                            {
//                                System.out.println(cad.charAt(x)+" "+x);
                                x++;
                                if(x==cad.length())
                                {
                                    id(cad, fw1,nrol);
                                }
                            }
                       else
                            {
                                System.out.println("ERROR LÉXICO_ "+"en línea " +nrol);
                                break;
                            }
                    }   
                }
//           else
//           {
//               vectores(cad, fw1, nrol);
//           }
       }catch (IOException ex) {
               Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
           }
       return false;
   }

public static void id(String cad, BufferedWriter fw1,int nrol) throws IOException
{
        try {
            if(cad.length()==1 && Character.isLetter(cad.charAt(0))){
            System.out.println(nrol+" Identificador, "+cad.charAt(0));
            fw1.write(nrol+" Identificador, "+ cad.charAt(0));
            fw1.newLine();
            fw1.flush();}
            else if(cad.length()>1 && Character.isLetter(cad.charAt(0)))
            {
                System.out.println(nrol+" Identificador, "+cad);
            fw1.write(nrol+" Identificador, "+ cad);
            fw1.newLine();
            fw1.flush();
            }
            else if(Character.isDigit(cad.charAt(0)))
            {
                Numeros(cad.charAt(0), cad, fw1, nrol);
            }
            else
            {
                System.out.println("Se esperaba un identificador en línea "+nrol);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
}



}




