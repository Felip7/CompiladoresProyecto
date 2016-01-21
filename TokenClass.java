package App;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TokenClass {
    static int i=0;
    static int j=i+1;
    static char t;
    
    public static boolean evaluarCaracter(char c, BufferedWriter fw1) {
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
        }        }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
         return false;
    }

    public static boolean operando(String c, BufferedWriter fw1) {
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

    public static boolean palabraRes (String cad, BufferedWriter fw1, int nrol)
    {
        String part1="";
        try
        {
            System.out.println(cad.length()+"");
            
            if (cad.contains(" "))
            {
                String [] palabras = cad.split(" ");
//            System.out.println(palabras.length+"");
                
                for (int z=0; z<palabras.length; z++) {
                    part1 = palabras[z];
//                    System.out.println(z+" "+part1);
                    if(part1.equals("int")|| part1.equals("float")|| part1.equals("string")||part1.equals("bool")||part1.equals("char") )
                    {
                        System.out.println("Tipo de dato, " +part1);
                        fw1.write("Tipodedato, " + part1    );
                        fw1.newLine();
                        fw1.flush();
                    }
                    else if (operandoFunciones(part1, fw1, nrol)){}
                    else
                    {
                        if(Character.isLetter(part1.charAt(0))&& Letra(part1.charAt(0), part1, fw1, nrol)==false);
                        else {evaluarCaracter(part1.charAt(0), fw1);}
                    }
                    
                }
                
//                if(evaluarCaracter(part1.charAt(0), fw1)){/*System.out.println(part1+"");*/}
            }

        
         }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }

     return false;   
    }
    
     public static boolean operandoFunciones(String c, BufferedWriter fw1, int nrol)
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
////             default:
////                 System.out.println("Valor entre corchetes no admitido. ERROR SINTACTICO en línea " + nrol);
                 
        }
        }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
        return false;
     }
    public static boolean palabraReservada(String cad, BufferedWriter fw1) {
//        int, float, bool, char, string, if, then, else, while, do, input, output, return
//        System.out.println(cad+" "+cad.length());
       
        try
        {            
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
//            case "for":
//                 System.out.println("Palabra reservada, "+cad);
//                                       fw1.write("Palabrareservada, "+cad   );
//                                       fw1.newLine();
//                                       fw1.flush();
//                return true;

        }
          }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }
        return false;

    }
    
   public static boolean Especial(char t, char n, String cad, BufferedWriter fw1, int NroL)
   { 
       
       if(cad.length()==1)
       {
           if (evaluarCaracter(t, fw1)) {}
                            else if(evaluarCaracter(t,fw1)==false) 
                            {
                                 System.out.println("ERROR LÉXICO "+t+ " en línea "+NroL);
                            }
                        return true;
       }
       else if(cad.length()==2)
       {
           OperandoCompuesto(n, cad, fw1, NroL); 
       }
       else if (cad.length()>2)
       {
             String ora="";
             ora+=cad.charAt(0);
             ora+=cad.charAt(1);
             ora+=cad.charAt(2);
            System.out.println(ora+" es Operador no definido, ERROR LÉXICO "+"en línea " +NroL);  
       }
       else if(evaluarCaracter(n, fw1))
       {
           System.out.println(n+" es O");
       }
       
       return false;
   }
   
   public static boolean OperandoCompuesto(char n, String cad, BufferedWriter fw1, int NroL)
   {
       String ora="";
       char div=cad.charAt(1);  
       
       if(cad.length()==2 && evaluarCaracter(div, fw1))
       {
       
       ora+=cad.charAt(0);
       ora+=cad.charAt(1);
        
                        if (operando(ora, fw1)) 
                         {
                             return true;
                         }
                        else if(evaluarCaracter(n, fw1)){  }
                        else
                        {
                            System.out.println(ora+" es Operador no definido, ERROR LÉXICO een línea " +NroL);
                        }
       }
       else
       {
           ora+=div;
           if(Numeros(t, ora, fw1, NroL))
           { }
           else
           {
               System.out.println("no");
           }
           
       }
        return false;
   }
   
   public static boolean Letra(char t, String cad,  BufferedWriter fw1, int nrol)
   {
       String c="";
       try    
       {
//           System.out.println(cad.length()+" x "+cad);
           switch(cad.length())
                {
                    case 1:
                        System.out.println("Identificador, "+t);
                        fw1.write("Identificador, "+t   );
                        fw1.newLine();
                        fw1.flush();
                        return true;
                        
                    case 2:
                        if(Character.isLetter(cad.charAt(1))==true)
                        {   
                            if(palabraRes(cad, fw1, nrol)){}
                        }
                        else if(Character.isDigit(cad.charAt(1)))
                        {
                           System.out.println("Identificador, "+cad);
                           fw1.write("Identificador, "+cad);
                           fw1.newLine();
                           fw1.flush();
                        }
                        else if(Character.isLetterOrDigit(cad.charAt(1))==false)
                        {   if(Character.isLetter(cad.charAt(0)))
                            {   System.out.println("Identificador, "+cad.charAt(0));
                                fw1.write("Identificador, "+cad.charAt(0));
                                fw1.newLine();
                                fw1.flush();
                                evaluarCaracter(cad.charAt(1), fw1);
                            }} return true;
                        
                    case 3:  
                        if(Character.isLetter(cad.charAt(0))) {

                        if (Character.isLetter(cad.charAt(1)) && Character.isLetter(cad.charAt(2)))
                        {System.out.println("Identificador, "+cad);}
                        else {System.out.println("ERROR LÉXICO "+"en línea " +nrol);}}                    
                        return true;
                    case 4:
                        if(Character.isLetter(cad.charAt(0))) {
                            if (Character.isLetter(cad.charAt(1)) && Character.isLetter(cad.charAt(2)))
                            {System.out.println("Identificador, "+cad);}
                            else{ System.out.println("ERROR LÉXICO "+"en línea " +nrol);}}
                    return true;
                     case 5:
                        if(Character.isLetter(cad.charAt(0))) {
                            if (Character.isLetter(cad.charAt(1)) && Character.isLetter(cad.charAt(2)))
                            {System.out.println("Identificador, "+cad);}
                            else{ System.out.println("ERROR LÉXICO "+"en línea " +nrol);}}
                     return true;
                     case 6:
                        if(Character.isLetter(cad.charAt(0))) {
                            if (Character.isLetter(cad.charAt(1)) && Character.isLetter(cad.charAt(2)))
                            {System.out.println("Identificador, "+cad);}
                            else{ System.out.println("ERROR LÉXICO "+"en línea " +nrol);}}
                     return true;
                     case 7:
                        if(Character.isLetter(cad.charAt(0))) {
                            if (Character.isLetter(cad.charAt(1)) && Character.isLetter(cad.charAt(2)))
                            {System.out.println("Identificador, "+cad);}
                            else{ System.out.println("ERROR LÉXICO "+"en línea " +nrol);}} 
                     return true;
                        
                    case 8:
                        Identificador(cad, fw1, nrol);
                        return true;
                    case 9:
                        Identificador(cad, fw1, nrol);
                        return true;
                    case 11:
                        if( cad.charAt(4)=='['|| cad.charAt(5)=='['|| cad.charAt(6)=='[' || cad.charAt(7)=='['){palabraRes(cad, fw1, nrol);}
                        else{Identificador(cad, fw1, nrol);}
                        return true;
                    case 12:
                        if( cad.charAt(4)=='['|| cad.charAt(5)=='['|| cad.charAt(6)=='[' || cad.charAt(7)=='['){palabraRes(cad, fw1, nrol);}
                        else{Identificador(cad, fw1, nrol);}
                        return true;
                    case 13:
                        if( cad.charAt(4)=='['|| cad.charAt(5)=='['|| cad.charAt(6)=='[' || cad.charAt(7)=='['){palabraRes(cad, fw1, nrol);}
                        else{Identificador(cad, fw1, nrol);}
                        return true;
                    case 14:
                        if( cad.charAt(4)=='['|| cad.charAt(5)=='['|| cad.charAt(6)=='[' || cad.charAt(7)=='['){palabraRes(cad, fw1, nrol);}
                        else{Identificador(cad, fw1, nrol);}
                        return true;        
                    case 15:
                             palabraRes(cad, fw1, nrol);
                        return true;
                        case 16:
                             palabraRes(cad, fw1, nrol);
                        return true;
                            case 17:
                             palabraRes(cad, fw1, nrol);
                        return true;
                    case 18:
                            palabraRes(cad, fw1, nrol);
                        return true;
                    default:
                        System.out.println("ERROR SINTACTICO "+"en línea " +nrol);
                        break;
       }   
       }    catch (IOException ex) {
               Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
           }
       return false;
   }

    public static boolean identificadorCompuesto(char t, String cad, BufferedWriter fw1, int NroL) 
    {
//        System.out.println(cad.length()+"");
        try {
        if (cad.contains(" "))
        {
            String [] palabras = cad.split(" ");
            
            for(int z=0; z<=palabras.length; z++)
            {            
                String part1 = palabras[z];
                String part2 = palabras[z+1];

                    if(palabraReservada(part1, fw1))
                    {
                        if(Letra(t, part2, fw1, NroL)){}
                    }
                break;    
                
            } 
        }
        else if(cad.contains("="))
            {
                String [] palabras = cad.split("=");
                 for(int z=0; z<=palabras.length; z++)
            {            
                String part1 = palabras[z];
                String part2 = palabras[z+1];

//                    System.out.println(part1+"---"+part2);
                    if(palabraReservada(part1, fw1))
                    {
                        if(Letra(t, part2, fw1, NroL)){}
                    }
                    else if(Letra(t, part1, fw1, NroL))
                    {
                        if (Numeros(t, part2, fw1, NroL));
                    }
                    break;
                } 
            }
        else if(Character.isLetter(cad.charAt(0)))
        {

//                String [] palabras = cad.split(";");
//                System.out.println(palabras.length+"---");
               
                System.out.println("Identificador, "+cad);
                fw1.write("Identificador, "+cad);
                fw1.newLine();
                fw1.flush();  
            
            
        }
 
           }    catch (IOException ex) {
               Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
           } 
        return false;
    }
    
    public static boolean Numeros(char n, String num, BufferedWriter fw1, int nrol) 
    {
        try
        {//System.out.println(num+"b"+num.length()+num.charAt(1));
                switch(num.length())
                {
                    case 1:
                        System.out.println("Número, "+num);
                        fw1.write("Numero, "+num);
                        fw1.newLine();
                        fw1.flush();
                        return true;
             
                    case 2: 
                        if(Character.isDigit(num.charAt(1)) && Character.isLetter(0))
                        {
                            Concatenar(num, fw1);
                        }
                        else if(Character.isLetter(num.charAt(1)) && Character.isDigit(0))
                                  {
                                         System.out.println(num+" ERROR LÉXICO "+"en línea " +nrol);
                                          break;
                                  }return true;
                    case 3:
                        if(Character.isDigit(num.charAt(2)) && !Character.isLetter(num.charAt(1)))
                        {
                            Concatenar(num, fw1);
                        }
                        else if(Character.isLetter(num.charAt(2))==true)
                        {
                            System.out.println(num+" ERROR LÉXICO en línea " +nrol);
                        }
                         else if(Character.isLetter(num.charAt(1))==true)
                        {
                            System.out.println(num+" ERROR LÉXICO en línea " +nrol);
                        }
                        return true;      
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
                            System.out.println("ERROR LÉXICO en línea " +nrol);
                            y++;
                            break;
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
            {
                concat+=cad.charAt(x);
            }
            System.out.println("Número, "+concat);
            fw1.write("Numero, "+concat);
            fw1.newLine();
            fw1.flush();
        } catch (IOException ex) {
            Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
        }
}

 public static boolean Identificador (String cad, BufferedWriter fw1, int nrol)
    {
        String part1="";
        try
        {
            System.out.println(cad.length()+"");
            
            if (cad.contains(" "))
            {
                String [] palabras = cad.split(" ");
//            System.out.println(palabras.length+"");
                
                for (int z=0; z<palabras.length; z++) {
                    part1 = palabras[z];
//                    System.out.println("" +part1);
                    if(part1.equals("int:")|| part1.equals("float:")|| part1.equals("string:")||part1.equals("bool:")||part1.equals("char:") )
                    {
                        System.out.println("Tipo de dato, " +part1);
                        fw1.write("Tipodedato, " + part1    );
                        fw1.newLine();
                        fw1.flush();
                    }else if(evaluarCaracter(part1.charAt(0), fw1)){}
                    else if (Numeros(part1.charAt(0), part1, fw1, nrol)){}
                    else{if (Character.isLetter(part1.charAt(0))) {Letra(part1.charAt(0), part1, fw1, nrol);}}
                   
                }
                
//                if(evaluarCaracter(part1.charAt(0), fw1)){/*System.out.println(part1+"");*/}
            }

        
         }catch (IOException ex) {
                                    Logger.getLogger(TokenClass.class.getName()).log(Level.SEVERE, null, ex);
                                }

     return false;   
    }
}


