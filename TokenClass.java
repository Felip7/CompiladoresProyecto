package App;

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
                            System.out.println("Número, "+num);
                            fw1.write("Numero, "+num);
                            fw1.newLine();
                            fw1.flush();
                        }
                    return true;
             
                    case 2: 
                        if(Character.isDigit(num.charAt(1)) && Character.isLetter(num.charAt(0))){
                            Concatenar(num, fw1); 
                            return true;}
                        else if(Character.isLetter(num.charAt(1)) && Character.isDigit(num.charAt(0))){
                            System.out.println(num+" es ERROR LÉXICO "+"en línea " +nrol);
                            return false;}
                        else{
                            System.out.println("Número, "+num);
                            fw1.write("Numero, "+num);
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
                            System.out.println("Número, "+num);
                            fw1.write("Numero, "+num);
                            fw1.newLine();
                            fw1.flush();
                            return true;
                        }}
                                                                   
                    case 4:  
                        Concatenar(num, fw1);
                        return true;
                }    
                    
                if (num.length()>=5)        
                {    
                        for(int y=1;y<num.length();y++)
                        {
                            if(Character.isLetter(num.charAt(y)))
                            {
                            System.out.println("ERR1OR LÉXICO en línea " +nrol);
                            y++;
                            
                            }
                        }        
                }
        }  catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}

public static void Concatenar(String cad, BufferedWriter fw1)
{
        try {
            String concat="";
            int longitud=cad.length();
            for(int x=0; x<longitud; x++)
            {concat+=cad.charAt(x);}
            System.out.println("Número, "+concat);
            fw1.write("Numero, "+concat);
            fw1.newLine();
            fw1.flush();
        } catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public static boolean Especial(char t, char n, String cad, BufferedWriter fw1, int NroL)
{ 
    if(!Character.isLetterOrDigit(cad.charAt(0))){
////       System.out.println(cad.length()+"*"+cad);
       
       switch(cad.length())
       {
           case 1:
               if (CaracterEsp(t, fw1, NroL)) {return true;}
               else {
                   System.out.println("ERROR L2ÉXICO "+t+ " en línea "+NroL);
               return false;}
           
           case 2:
               operandoB(n, cad, fw1, NroL); 
       }
               
       if (cad.length()>2)
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

public static boolean operandoB(char n, String cad, BufferedWriter fw1, int NroL)
{
       String ora="";

           char div=cad.charAt(1);
//           System.out.println(div+"div");
           
           if(Character.isLetterOrDigit(div)==false)//Si es un simbolo
           {
               ora+=cad.charAt(0);
               ora+=cad.charAt(1);
        
                        if (operadores(ora, fw1)){return true;}
                        else{System.out.println(ora+" Operador no definido, ERROR LÉXICO een línea " +NroL);}
           }
           else
           {
               System.out.println(cad+" Operador no definido, ERROR LÉXICO een línea " +NroL);
           }
        return false;
   }

public static boolean CaracterEsp(char c, BufferedWriter fw1, int NumeroLineas) {
        
        try
        {
        switch (c) {
            case '(':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
                
            case ',':
                                    System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ':':
                                    System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ';':
                                    System.out.println("Terminador, " + c);
                                    fw1.write("Terminador, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '<':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '>':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '{':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '[':
                 System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ']':
                 System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '*':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case ')':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '+':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '-':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c);
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '/':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '!':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c);
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '}':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '&':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '$':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '=':
                System.out.println("Operador unario, " + c);
                                    fw1.write("Operadorunario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case '"':
                System.out.println("Caracter especial, " + c);
                                    fw1.write("Caracterespecial, " + c    );
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

public static boolean operadores(String c, BufferedWriter fw1)
{
//        <= >= == != && ||
        try{
        switch (c) {
            case ">=":
                System.out.println("Operador binario, " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "<=":
                System.out.println("Operador binario, " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "==":
                System.out.println("Operador binario, " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "!=":
                System.out.println("Operador binario: " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "&&":
                System.out.println("Operador binario: " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "||":
                System.out.println("Operador binario: " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "++":
                System.out.println("Operador binario: " + c);
                                    fw1.write("Operadorbinario, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "+=":
                System.out.println("Operador binario: " + c);
                                    fw1.write("Operadorbinario, " + c    );
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
                    System.out.println("Tipo de valor de retorno " +part1);
                        fw1.write("Tipovalorretorno, " + part1);
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
                        System.out.println("Tipo de dato, " +cad);
                        fw1.write("Tipodedato, " + cad   );
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
                 System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                                    return true;
            case "then":
                 System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "else":
                 System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "while":
                 System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "do":
                 System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "input":
                System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "output":
                System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "return":
                System.out.println("Palabra reservada, "+cad);
                                    fw1.write("Palabrareservada, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "true":
                System.out.println("Valor booleano, "+cad);
                                    fw1.write("Valorbooleano, "+cad   );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "false":
                System.out.println("Valor booleano, "+cad);
                                        fw1.write("Valorbooleano, "+cad   );
                                        fw1.newLine();
                                        fw1.flush();
                return true;
            case "void":
                 System.out.println("Palabra reservada, "+cad);
                                       fw1.write("Palabrareservada, "+cad   );
                                       fw1.newLine();
                                       fw1.flush();
                return true;
            case "null":
                 System.out.println("Palabra reservada, "+cad);
                                       fw1.write("Palabrareservada, "+cad   );
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

public static boolean vectores(String c, BufferedWriter fw1, int nrol)
{
    try{
        switch (c) {
            case "[]:":
                //Inicializar vectores vacíos
                c="[0]:";
                System.out.println("operadorFuncionvacio, " + c );
                                    fw1.write("operadorFuncionvacio, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[0]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[1]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[2]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[3]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;    
            case "[4]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[5]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;     
            case "[6]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[7]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[8]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;
            case "[9]:":
                System.out.println("operadorFuncion, " + c);
                                    fw1.write("operadorFuncion, " + c    );
                                    fw1.newLine();
                                    fw1.flush();
                return true;    
//             default:
//                 System.out.println("Valor entre corchetes no admitido. ERROR SINTACTICO en línea " + nrol);
//                 return false;
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
                else if (vectores(part1, fw1, nrol)){}
                else if (Especial(part1.charAt(0), part1.charAt(0), part1, fw1, nrol)){}
//                else if(vectores(cad, fw1, nrol)){}
//                else if(Especial(cad.charAt(0), cad.charAt(1), cad, fw1, nrol)){}
            }

        }
        else
        {
//            System.out.println("ve");
            if(funcion(cad, fw1, nrol)){}
            else if (vectores(cad, fw1, nrol)){}
            else if (Especial(cad.charAt(0), cad.charAt(cad.length()-1), cad, fw1, nrol)){}
            
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
                            id(cad, fw1);
                        return true;
                        }
                    case 2:
                        if(Character.isLetter(cad.charAt(cad.length()-1))==true)
                        {   
                            id(cad, fw1);
                              return true;
                        }
                        else if(Character.isDigit(cad.charAt(cad.length()-1)))
                        {
                           id(cad, fw1);
                             return true;
                        }
                        else if(Character.isLetterOrDigit(cad.charAt(cad.length()-1))==false)
                        {   if(Character.isLetter(cad.charAt(0)))
                            {  System.out.println("Se esperaba una letra. ERROR LÉXICO "+"en línea " +nrol);
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
                            else {id(cad, fw1);}
                        }                    
                        return true;
           }
           
           if (cad.length()>=4)        
                {    
                    int x=0;
                    while(x!=cad.length()){
                       if (Character.isLetter(cad.charAt(x)))
                            {
//                                System.out.println(cad.charAt(x)+" "+x);
                                x++;
                                if(x==cad.length())
                                {
                                    id(cad, fw1);
                                }
                            }
                       else
                            {
                                System.out.println("ERROR LÉXICO_ "+"en línea " +nrol);
                                break;
                            }
                    }   
                }}catch (IOException ex) {
               Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
           }
       return false;
   }

public static void id(String cad, BufferedWriter fw1) throws IOException
{
        try {
            if(cad.length()==1){
            System.out.println("Identificador, "+cad.charAt(0));
            fw1.write("Identificador, "+ cad.charAt(0));
            fw1.newLine();
            fw1.flush();}
            else
            {
                System.out.println("Identificador, "+cad);
            fw1.write("Identificador, "+ cad);
            fw1.newLine();
            fw1.flush();}
            
        } catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
}

}
