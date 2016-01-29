
package Syntax;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static App.TokenClass.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tables {
 
    Hashtable d=new Hashtable();
    Hashtable c=new Hashtable();
    Hashtable e=new Hashtable();
               
    Hashtable declaracion=new Hashtable(); 
    Hashtable declaracion2=new Hashtable();
    
    Hashtable comando=new Hashtable(); 
    Hashtable comando2=new Hashtable();
    Hashtable comando3=new Hashtable();
    Hashtable comando4=new Hashtable();
    Hashtable operacion=new Hashtable();

    Hashtable operacion2=new Hashtable();
    Hashtable operacion3=new Hashtable();
    Hashtable operacion4=new Hashtable();
    Hashtable atribucion3=new Hashtable();
    Hashtable atribucion4=new Hashtable();
    Hashtable atribucion5=new Hashtable();
    Hashtable atribucion6=new Hashtable();
    Hashtable expresion=new Hashtable();
    Hashtable expresion1=new Hashtable();
   
   
    Hashtable call=new Hashtable();
    Hashtable callv=new Hashtable();
    Hashtable call2=new Hashtable();
    Hashtable call3=new Hashtable();
    Hashtable flujo1=new Hashtable();
    Hashtable flujo2=new Hashtable();
    Hashtable flujo3=new Hashtable();
    Hashtable flujo4=new Hashtable();
    Hashtable flujo5=new Hashtable();
    Hashtable flujo6=new Hashtable();
    Hashtable flujo7=new Hashtable();
    Hashtable flujo8=new Hashtable();
    Hashtable flujo9=new Hashtable();
    
    Hashtable cuerpo=new Hashtable();
    Hashtable fn=new Hashtable();
    
    public Tables() 
    {
            comandosSimples();
            expresion();
            llamada();
            controlFlujo();
            decla();
            Funcion();
    }
   
    public void imprimir(Hashtable i)
    {
        Enumeration<String> enumeration = i.elements();
        Enumeration llaves = i.keys();
                while (enumeration.hasMoreElements() &&llaves.hasMoreElements()) {
                System.out.println("k_" + llaves.nextElement()+" v_" + enumeration.nextElement()); }
    }
    
    
    public boolean comparar(Hashtable h1, int linea)
    {

        if(h1.equals(fn)){return false;}
        else if(h1.equals(declaracion)){System.out.println("DECLARACIÓN GLOBAL EN LÍNEA "+linea);return true;} 
        else if (h1.equals(declaracion2)){System.out.println("DECLARACIÓN GLOBAL EN LÍNEA "+linea++);return true;}    
        else{System.out.println("No iguales"); 
            return false;}
       
    }
    
    
     public void decla()
    {
        declaracion.put(3,"Terminador,");
        declaracion.put(2,"Identificador,");  //int: i ;
        declaracion.put(1,"Tipodedato,");
        
        declaracion2.put(1,"Tipodedato,");
        declaracion2.put(2,"operadorFuncionvacio,");
        declaracion2.put(3,"Identificador," );        //string []: s ;
        declaracion2.put(4,"Terminador,");
        
        d.put(1, declaracion);
        d.put(2, declaracion2);
        
//        System.out.println("de " +declaracion.toString());
        
    }
     
     
     public void expresion()
    {
        atribucion3.put(1,"Identificador,");
        atribucion3.put(2,"Operadorbinario," );        //i += z ;
        atribucion3.put(3,"Identificador,");
        atribucion3.put(4,"Terminador,");
        
        atribucion4.put(1,"Identificador,");
        atribucion4.put(2,"Operadorbinario," );        //i += 5 ;
        atribucion4.put(3,"Numero,");
        atribucion4.put(4,"Terminador,");
        
        atribucion5.put(1,"Identificador,");
        atribucion5.put(2,"Operadorb1nario," );        //i == 5 ;
        atribucion5.put(3,"Numero,");
        atribucion5.put(4,"Terminador,");
      
        atribucion6.put(1,"Identificador,");
        atribucion6.put(2,"Operadorb1nario," );        //i == x ;
        atribucion6.put(3,"Identificador,");
        atribucion6.put(4,"Terminador,");
        
        expresion.put(1,"Identificador,");
        expresion.put(2,"Op3radorbinario," );        //i != 0 ;
        expresion.put(3,"Numero,");
        expresion.put(4,"Terminador,");
        
        expresion1.put(1,"Identificador,");
        expresion1.put(2,"Op3radorbinario," );        //i != x ;
        expresion1.put(3,"Identificador,");
        expresion1.put(4,"Terminador,");
        
        e.put(1, atribucion3);
        e.put(2, atribucion4);
        e.put(3, atribucion5);
        e.put(4, atribucion6);
        e.put(5, expresion);
        e.put(6, expresion1);
   
        
    }
     
    public void comandosSimples()
    {
        
        comando.put(1,"Tipodedato,");
        comando.put(2,"operadorFuncion,");
        comando.put(3,"Identificador," );       // string [1]: s = car ;
        comando.put(4,"Operadorasignacion," );
        comando.put(5,"Identificador,");
        comando.put(6,"Terminador,");
        
        comando2.put(1,"Tipodedato,");
        comando2.put(2,"operadorFuncionvacio,");
        comando2.put(3,"Identificador," );        //string []: s = car ;
        comando2.put(4,"Operadorasignacion," );
        comando2.put(5,"Identificador,");
        comando2.put(6,"Terminador,");
             
        comando3.put(1,"Tipodedato,");
        comando3.put(2,"Identificador,");
        comando3.put(3,"Operadorasignacion," );        //int i = 0 ;
        comando3.put(4,"Numero,");
        comando3.put(5,"Terminador,");
        
        comando4.put(1,"Identificador,");
        comando4.put(2,"Operadorasignacion," );        //i = 0 ;
        comando4.put(3,"Numero,");
        comando4.put(4,"Terminador,");
        
        operacion.put(1,"Identificador,");
        operacion.put(2,"Operadorasignacion,");
        operacion.put(3,"Identificador,");
        operacion.put(4,"Operadorunar1o,"); 
        operacion.put(5,"Identificador,");              //i = x + z ;
        operacion.put(6,"Terminador,");
        
        operacion2.put(1,"Identificador,");
        operacion2.put(2,"Operadorasignacion,");
        operacion2.put(3,"Identificador,");
        operacion2.put(4,"Operadorbinar1o,");  //i = x ++ ;
        operacion2.put(5,"Terminador,");
        
        operacion3.put(1,"Identificador,");
        operacion3.put(2,"Operadorasignacion,");
        operacion3.put(3,"Numero,");
        operacion3.put(4,"Operadorunar1o,"); 
        operacion3.put(5,"Numero,");              //i = 1 + 1 ;
        operacion3.put(6,"Terminador,");
        
        operacion4.put(1,"Identificador,");
        operacion4.put(2,"Operadorbinar1o,");   // i ++ ;
        operacion4.put(3,"Terminador,");
        

        c.put(1, comando);
        c.put(2, comando2);
        c.put(3, comando3);
        c.put(4, comando4);
        c.put(5, operacion);
        c.put(6, operacion2);
        c.put(7, operacion3);
        c.put(8, operacion4);
       
    }
    
    public void Funcion()
    {
        fn.put(1, "Tipovalorretorno,");
        fn.put(2, "Identificador,");
        fn.put(3, "Caracterespecial,");
        fn.put(4, "Tipodedato,");
        fn.put(5, "Identificador,");
        fn.put(6, "Coma,");
        fn.put(7, "Tipodedato,");
        fn.put(8, "Identificador,");
        fn.put(9, "Caracterespecial,");
        fn.put(10, cuerpo);
        
    
    }
    
    public void CuerpoFuncion()
    {
        cuerpo.put(1,"InicioFuncion");
        cuerpo.put(2,fn);
        cuerpo.put(3,"TerminadorFuncion");
    }
    
    public void llamada()
    {
        callv.put(1,"Identificador,");
        callv.put(2,"Caracterespecial,");        //funcion ( )
        callv.put(3,"Caracterespecial,");
        
        call.put(1,"Identificador,");
        call.put(2,"Caracterespecial,");
        call.put(3,"Identificador,");               //funcion ( i , y ) 
        call.put(4,"Coma");
        call.put(5,"Identificador,");
        call.put(6,"Caracterespecial,");
        
        call2.put(1,"Identificador,");
        call2.put(2,"Caracterespecial,");
        call2.put(3,"Identificador,");               //funcion ( i ) 
        call2.put(4,"Caracterespecial,");
        
        call3.put(1,"Identificador,");
        call3.put(2,"Caracterespecial,");
        call3.put(3,"Identificador,");               //funcion ( i , y , z ) 
        call3.put(4,"Coma");
        call3.put(5,"Identificador,");
        call3.put(6,"Coma");
        call3.put(7,"Identificador,");
        call3.put(8,"Caracterespecial,");
        
        
        Hashtable cF=new Hashtable();
        cF.put(1, callv);
        cF.put(2, call);
        cF.put(3, call2);
        cF.put(4, call3);
        
       
    }
    
    public void controlFlujo()
    {
        flujo1.put(1, "Palabrareservadaf,");
        flujo1.put(2, e);                           //if (expresión) then declaraciones
        flujo1.put(3, "Palabrareservadag,");
        flujo1.put(4, d);
        
        flujo2.put(1, "Palabrareservadaf,");
        flujo2.put(2, e);                         //  if (expresión) then comando
        flujo2.put(3, "Palabrareservadag,");
        flujo2.put(4, c);
                
        flujo3.put(1, "Palabrareservadaf,");
        flujo3.put(2, e);
        flujo3.put(3, "Palabrareservadag,");
        flujo3.put(4, d);                        //if (expresión) then decla else decla
        flujo3.put(3, "Palabrareservadagt");
        flujo3.put(4, d);
        
        flujo4.put(1, "Palabrareservadaf,");
        flujo4.put(2, e);
        flujo4.put(3, "Palabrareservadag,");    //if (expresión) then comando else comando
        flujo4.put(4, c);
        flujo4.put(3, "Palabrareservadagt");
        flujo4.put(4, c);
       
        
        flujo5.put(1, "Palabrareservadaf,");
        flujo5.put(2, e);
        flujo5.put(3, "Palabrareservadag,");
        flujo5.put(4, d);                        //if (expresión) then decla else comando
        flujo5.put(3, "Palabrareservadagt");
        flujo5.put(4, c);
        
        flujo6.put(1, "Palabrareservadaf,");
        flujo6.put(2, e);
        flujo6.put(3, "Palabrareservadag,");    //if (expresión) then comando else decla
        flujo6.put(4, c);
        flujo6.put(3, "Palabrareservadagt");
        flujo6.put(4, d);
        
        flujo7.put(1, "Palabrareservada1,");
        flujo7.put(2, e);
        flujo7.put(3, "Palabrareservada2,");        //while (expresión) do comando
        flujo7.put(4, c);
         
        flujo8.put(1, "Palabrareservada1,");
        flujo8.put(2, e);
        flujo8.put(3, "Palabrareservada2,");        //while (expresión) do decla
        flujo8.put(4, d);
          
        flujo9.put(1, "Palabrareservada2,");
        flujo9.put(2, c);
        flujo9.put(3, "Palabrareservada1,");        //do comando while (expresión)
        flujo9.put(4, e);
        
        
        Hashtable Flujo=new Hashtable();
        Flujo.put(1, flujo1);
        Flujo.put(2, flujo2);
        Flujo.put(3, flujo3);
        Flujo.put(4, flujo4);
        Flujo.put(5, flujo5);
        Flujo.put(6, flujo6);
        Flujo.put(7, flujo7);
        Flujo.put(8, flujo8);
        Flujo.put(9, flujo9);
//        System.out.println("Flujo " +Flujo.toString());
        
    }

    public Hashtable comprobar(ArrayList c2, int numero) {
        
        try {
            BufferedWriter fw1;
            File archivo = new File("1.txt");
            fw1=new BufferedWriter(new FileWriter(archivo, false));
            
            Hashtable hashLista = new Hashtable();
//        System.out.println("asxa");
            
            Set<String> quipu = new HashSet<String>(c2);
            for (String key : quipu) {
//                System.out.println(key + " " + Collections.frequency(c2, key));
                if(Collections.frequency(c2, key)>1)
                {
                    if(Especial(key.charAt(0), key.charAt(0), key, fw1, numero)==true)
                    {
                        
                    }
                    else
                    {
                        System.out.println("Variables repetidas en línea "+numero);
                    }
                    
                }
            }
            
            return hashLista;
        } catch (IOException ex) {
            Logger.getLogger(HashTables.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
}
    }

