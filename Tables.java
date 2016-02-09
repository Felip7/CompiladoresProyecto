package Semantics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tables {
     
    ArrayList d=new ArrayList();
    ArrayList c=new ArrayList();
    ArrayList e=new ArrayList();
               
    ArrayList declaracion=new ArrayList(); 
    ArrayList declaracion2=new ArrayList();
    
    ArrayList comando=new ArrayList(); 
    ArrayList comando2=new ArrayList();
    ArrayList comando3=new ArrayList();
    ArrayList comando4=new ArrayList();
    ArrayList operacion=new ArrayList();

    ArrayList operacion2=new ArrayList();
    ArrayList operacion3=new ArrayList();
    ArrayList operacion4=new ArrayList();
    ArrayList atribucion3=new ArrayList();
    ArrayList atribucion4=new ArrayList();
    ArrayList atribucion5=new ArrayList();
    ArrayList atribucion6=new ArrayList();
    ArrayList expresion=new ArrayList();
    ArrayList expresion1=new ArrayList();
      
    ArrayList call=new ArrayList();
    ArrayList callv=new ArrayList();
    ArrayList call2=new ArrayList();
    ArrayList call3=new ArrayList();
    ArrayList flujo1=new ArrayList();
    ArrayList flujo2=new ArrayList();
    ArrayList flujo3=new ArrayList();
    ArrayList flujo4=new ArrayList();
    ArrayList flujo5=new ArrayList();
    ArrayList flujo6=new ArrayList();
    ArrayList flujo7=new ArrayList();
    ArrayList flujo8=new ArrayList();
    ArrayList flujo9=new ArrayList();
    
    ArrayList cuerpo=new ArrayList();
    ArrayList cuerpo1=new ArrayList();
    ArrayList fn=new ArrayList();
    ArrayList fn1=new ArrayList();
    ArrayList fn2=new ArrayList();
    ArrayList fn3=new ArrayList();
    ArrayList fn4=new ArrayList();
    ArrayList fn5=new ArrayList();
    ArrayList fn6=new ArrayList();
    
    public Tables() 
    {
            comandosSimples();
            expresion();
            llamada();
            controlFlujo();
            decla();
            Funcion();
    }
    
    public boolean comparar(ArrayList h,  long linea)
    {

//        System.out.println(h.size()+"");

            h.remove(""); 
            if(h.equals(fn6)){System.out.println("Declaración de función (7 argumentos) en Línea "+linea);return true;}
            else if(h.equals(fn5)){System.out.println("Declaración de función (6 argumentos) en Línea "+linea);return true;}
            else if(h.equals(fn4)){System.out.println("Declaración de función (5 argumentos) en Línea "+linea);return true;}
            else if(h.equals(fn3)){System.out.println("Declaración de función (4 argumentos) en Línea "+linea);return true;}
            else if(h.equals(fn2)){System.out.println("Declaración de función (3 argumentos) en Línea "+linea);return true;}
            else if(h.equals(fn1)){System.out.println("Declaración de función (2 argumentos) en Línea "+linea);return true;}
            else if (h.equals(fn)){System.out.println("Declaración de función (1 argumento) en Línea "+linea);return true;}
            else if(h.equals(declaracion2)){System.out.println("DECLARACION GLOBAL EN LÍNEA "+linea);return true;}
            else if(h.equals(declaracion)){System.out.println("DECLARACION GLOBAL EN LÍNEA "+linea);return true;}
            else if(h.equals(comando3)){System.out.println("DECLARACION GLOBAL EN LÍNEA "+linea);return true;}
            else if(h.equals(comando2)){System.out.println("DECLARACION GLOBAL EN LÍNEA "+linea);return true;}
            else if(h.equals(comando)){System.out.println("DECLARACION VECTOR GLOBAL EN LÍNEA "+linea);return true;}
            else if(h.equals(call)){System.out.println("Llamada de función EN LÍNEA "+linea);return true;}
//            else
//            {
//                System.err.println("ERROR en línea "+linea+"\nEstructura sintáctica no definida.");
//                return false;
//            }
        return false;
     

   
    }
    
    public ArrayList comprobar(ArrayList c, long numero) {

            ArrayList hashLista = new ArrayList();
           
            Set<String> quipu = new HashSet<>(c);
            for (String key : quipu) {
                
//                System.out.println(numero+" valor "+key + " frecuencia: " + Collections.frequency(c, key));
                if(Collections.frequency(c, key)>1)
                {
//                    System.out.println(key+"#");
                    if(special(key)==true)
                    {
//                        System.out.println("sda");
//                        break;
                    }
                    else
                    {
                        System.out.println("Variable "+key+" repetida en línea "+numero);
                        break;
                    } 
                }
                else
                {
//                    System.out.println("n");
                }
                           }
        return hashLista;
    
    }
        
    public void decla()
    {
        declaracion.add("Tipodedato,");
        declaracion.add("Identificador,");  //int: i ;
        declaracion.add("Terminador,");
        
        declaracion2.add("Tipodedato,");
        declaracion2.add("operadorFuncionvacio,");
        declaracion2.add("Identificador," );        //string []: s ;
        declaracion2.add("Terminador,");
        
        comando3.add("Tipodedato,");
        comando3.add("Identificador,");
        comando3.add("Operadorasignacion," );        //int i = 0 ;
        comando3.add("Numero,");
        comando3.add("Terminador,");
        
         comando.add("Tipodedato,");
        comando.add("operadorFuncion,");
        comando.add("Identificador," );       // string [1]: s = car ;
        comando.add("Operadorasignacion," );
        comando.add("Identificador,");
        comando.add("Terminador,");
        
        comando2.add("Tipodedato,");
        comando2.add("operadorFuncionvacio,");
        comando2.add("Identificador," );        //string []: s = car ;
        comando2.add("Operadorasignacion," );
        comando2.add("Identificador,");
        comando2.add("Terminador,");
        
    }
     
     
     public void expresion()
    {
        atribucion3.add("Identificador,");
        atribucion3.add("Operadorbinario," );        //i += z ;
        atribucion3.add("Identificador,");
        atribucion3.add("Terminador,");
        
        atribucion4.add("Identificador,");
        atribucion4.add("Operadorbinario," );        //i += 5 ;
        atribucion4.add("Numero,");
        atribucion4.add("Terminador,");
        
        atribucion5.add("Identificador,");
        atribucion5.add("Operadorb1nario," );        //i == 5 ;
        atribucion5.add("Numero,");
        atribucion5.add("Terminador,");
      
        atribucion6.add("Identificador,");
        atribucion6.add("Operadorb1nario," );        //i == x ;
        atribucion6.add("Identificador,");
        atribucion6.add("Terminador,");
        
        expresion.add("Identificador,");
        expresion.add("Op3radorbinario," );        //i != 0 ;
        expresion.add("Numero,");
        expresion.add("Terminador,");
        
        expresion1.add("Identificador,");
        expresion1.add("Op3radorbinario," );        //i != x ;
        expresion1.add("Identificador,");
        expresion1.add("Terminador,");
        
    }
     
    public void comandosSimples()
    {
        comando4.add("Identificador,");
        comando4.add("Operadorasignacion," );        //i = 0 ;
        comando4.add("Numero,");
        comando4.add("Terminador,");
        
        operacion.add("Identificador,");
        operacion.add("Operadorasignacion,");
        operacion.add("Identificador,");
        operacion.add("Operadorunar1o,"); 
        operacion.add("Identificador,");              //i = x + z ;
        operacion.add("Terminador,");
        
        operacion2.add("Identificador,");
        operacion2.add("Operadorasignacion,");
        operacion2.add("Identificador,");
        operacion2.add("Operadorbinar1o,");  //i = x ++ ;
        operacion2.add("Terminador,");
        
        operacion3.add("Identificador,");
        operacion3.add("Operadorasignacion,");
        operacion3.add("Numero,");
        operacion3.add("Operadorunar1o,"); 
        operacion3.add("Numero,");              //i = 1 + 1 ;
        operacion3.add("Terminador,");
        
        operacion4.add("Identificador,");
        operacion4.add("Operadorbinar1o,");   // i ++ ;
        operacion4.add("Terminador,");
       
    }
    
    public void Funcion()
    {
        fn.add( "Tipovalorretorno,");
        fn.add( "Identificador,");
        fn.add( "Caracterespecial,");
        fn.add( "Tipodedato,");
        fn.add( "Identificador,");
        fn.add( "Caracterespecial,");

        fn1.add( "Tipovalorretorno,");
        fn1.add( "Identificador,");
        fn1.add( "Caracterespecial,");
        fn1.add( "Tipodedato,");
        fn1.add( "Identificador,");
        fn1.add( "Coma,");
        fn1.add( "Tipodedato,");
        fn1.add( "Identificador,");
        fn1.add( "Caracterespecial,");
        
        fn2.add( "Tipovalorretorno,");
        fn2.add( "Identificador,");
        fn2.add( "Caracterespecial,");
        fn2.add( "Tipodedato,");
        fn2.add( "Identificador,");
        fn2.add( "Coma,");
        fn2.add( "Tipodedato,");
        fn2.add( "Identificador,");
        fn2.add( "Coma,");
        fn2.add( "Tipodedato,");
        fn2.add( "Identificador,");
        
        
        fn3.add( "Tipovalorretorno,");
        fn3.add( "Identificador,");
        fn3.add( "Caracterespecial,");
        fn3.add( "Tipodedato,");
        fn3.add( "Identificador,");
        fn3.add( "Coma,");
        fn3.add( "Tipodedato,");
        fn3.add( "Identificador,");
        fn3.add( "Coma,");
        fn3.add( "Tipodedato,");
        fn3.add( "Identificador,");
        fn3.add( "Coma,");
        fn3.add( "Tipodedato,");
        fn3.add( "Identificador,");
        fn3.add( "Caracterespecial,");
        
        
        fn4.add( "Tipovalorretorno,");
        fn4.add( "Identificador,");
        fn4.add( "Caracterespecial,");
        fn4.add( "Tipodedato,");
        fn4.add( "Identificador,");
        fn4.add( "Coma,");
        fn4.add( "Tipodedato,");
        fn4.add( "Identificador,");
        fn4.add( "Coma,");
        fn4.add( "Tipodedato,");
        fn4.add( "Identificador,");
        fn4.add( "Coma,");
        fn4.add( "Tipodedato,");
        fn4.add( "Identificador,");
        fn4.add( "Coma,");
        fn4.add( "Tipodedato,");
        fn4.add( "Identificador,");
        fn4.add( "Caracterespecial,");
        
        fn5.add( "Tipovalorretorno,");
        fn5.add( "Identificador,");
        fn5.add( "Caracterespecial,");
        fn5.add( "Tipodedato,");
        fn5.add( "Identificador,");
        fn5.add( "Coma,");
        fn5.add( "Tipodedato,");
        fn5.add( "Identificador,");
        fn5.add( "Coma,");
        fn5.add( "Tipodedato,");
        fn5.add( "Identificador,");
        fn5.add( "Coma,");
        fn5.add( "Tipodedato,");
        fn5.add( "Identificador,");
        fn5.add( "Coma,");
        fn5.add( "Tipodedato,");
        fn5.add( "Identificador,");
        fn5.add( "Coma,");
        fn5.add( "Tipodedato,");
        fn5.add( "Identificador,");
        fn5.add( "Caracterespecial,");
        
        fn6.add( "Tipovalorretorno,");
        fn6.add( "Identificador,");
        fn6.add( "Caracterespecial,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Coma,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Coma,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Coma,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Coma,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Coma,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Coma,");
        fn6.add( "Tipodedato,");
        fn6.add( "Identificador,");
        fn6.add( "Caracterespecial,");
        
    }
    
    public void CuerpoFuncion()
    {
        
        cuerpo1.add("InicioFuncion");
        cuerpo1.add(fn);
        cuerpo1.add("TerminadorFuncion");
    }
    
    public void llamada()
    {
        callv.add("Identificador,");
        callv.add("Caracterespecial,");        //funcion ( )
        callv.add("Caracterespecial,");
        
        call.add("Identificador,");
        call.add("Caracterespecial,");
        call.add("Identificador,");               //funcion ( i , y ) 
        call.add("Coma,");
        call.add("Identificador,");
        call.add("Caracterespecial,");
        
        call2.add("Identificador,");
        call2.add("Caracterespecial,");
        call2.add("Identificador,");               //funcion ( i ) 
        call2.add("Caracterespecial,");
        
        call3.add("Identificador,");
        call3.add("Caracterespecial,");
        call3.add("Identificador,");               //funcion ( i , y , z ) 
        call3.add("Coma,");
        call3.add("Identificador,");
        call3.add("Coma,");
        call3.add("Identificador,");
        call3.add("Caracterespecial,");
        
        
        ArrayList cF=new ArrayList();
        cF.add( callv);
        cF.add( call);
        cF.add( call2);
        cF.add( call3);
        
    }
    
    public void controlFlujo()
    {
        flujo1.add( "Palabrareservadaf,");
        flujo1.add( e);                           //if (expresión) then declaraciones
        flujo1.add( "Palabrareservadag,");
        flujo1.add( d);
        
        flujo2.add( "Palabrareservadaf,");
        flujo2.add( e);                         //  if (expresión) then comando
        flujo2.add( "Palabrareservadag,");
        flujo2.add( c);
                
        flujo3.add( "Palabrareservadaf,");
        flujo3.add( e);
        flujo3.add( "Palabrareservadag,");
        flujo3.add( d);                        //if (expresión) then decla else decla
        flujo3.add( "Palabrareservadagt");
        flujo3.add( d);
        
        flujo4.add( "Palabrareservadaf,");
        flujo4.add( e);
        flujo4.add( "Palabrareservadag,");    //if (expresión) then comando else comando
        flujo4.add( c);
        flujo4.add( "Palabrareservadagt");
        flujo4.add( c);
       
        
        flujo5.add( "Palabrareservadaf,");
        flujo5.add( e);
        flujo5.add( "Palabrareservadag,");
        flujo5.add( d);                        //if (expresión) then decla else comando
        flujo5.add( "Palabrareservadagt");
        flujo5.add( c);
        
        flujo6.add( "Palabrareservadaf,");
        flujo6.add( e);
        flujo6.add( "Palabrareservadag,");    //if (expresión) then comando else decla
        flujo6.add( c);
        flujo6.add( "Palabrareservadagt");
        flujo6.add( d);
        
        flujo7.add( "Palabrareservada");
        flujo7.add( e);
        flujo7.add( "Palabrareservada");        //while (expresión) do comando
        flujo7.add( c);
         
        flujo8.add( "Palabrareservada");
        flujo8.add( e);
        flujo8.add( "Palabrareservada");        //while (expresión) do decla
        flujo8.add( d);
          
        flujo9.add( "Palabrareservada");
        flujo9.add( c);
        flujo9.add( "Palabrareservada");        //do comando while (expresión)
        flujo9.add( e);
        
        
        ArrayList Flujo=new ArrayList();
        Flujo.add( flujo1);
        Flujo.add( flujo2);
        Flujo.add( flujo3);
        Flujo.add( flujo4);
        Flujo.add( flujo5);
        Flujo.add( flujo6);
        Flujo.add( flujo7);
        Flujo.add( flujo8);
        Flujo.add( flujo9);
//        System.out.println("Flujo " +Flujo.toString());
        
    }
 
    public boolean special(String key)
    {
        if(key.equals("int"))
            {
                return true;
            }
    
        else
    
        {
//        System.out.println("nospecial");
            return false;
        }
    }
    
    
}

