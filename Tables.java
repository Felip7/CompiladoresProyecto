package Syntax;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Tables {               
    ArrayList declaracion=new ArrayList();              ArrayList comandol=new ArrayList(); 
    ArrayList comandol3=new ArrayList();                ArrayList comandol2=new ArrayList();
    ArrayList operacion=new ArrayList();                ArrayList operacion2=new ArrayList();
    ArrayList atribucion3=new ArrayList();              ArrayList comandol4=new ArrayList();
    ArrayList atribucion4=new ArrayList();              ArrayList operacion3=new ArrayList();
    ArrayList declaracionl=new ArrayList();             ArrayList operacion4=new ArrayList();
    
    ArrayList atribucion5=new ArrayList();              ArrayList flujo1=new ArrayList();
    ArrayList atribucion6=new ArrayList();              ArrayList comando=new ArrayList(); 
    ArrayList comando4=new ArrayList();                 ArrayList comando2=new ArrayList();
    ArrayList comando5=new ArrayList();                 ArrayList comando3=new ArrayList();
    ArrayList declaracion2=new ArrayList();             ArrayList declaracion3=new ArrayList();                            
    
    ArrayList cs=new ArrayList();                       ArrayList declaracionl2=new ArrayList();
    ArrayList expresion=new ArrayList();                ArrayList fnvacia=new ArrayList();
    ArrayList expresion1=new ArrayList();               ArrayList fp=new ArrayList();
    ArrayList cs3=new ArrayList();                      ArrayList cs1=new ArrayList();
    ArrayList cs2=new ArrayList();                      ArrayList cs4=new ArrayList();
    ArrayList cs5=new ArrayList();                      ArrayList cs6=new ArrayList();
    ArrayList cs7=new ArrayList();
   
    ArrayList call=new ArrayList();                 ArrayList cuerpo=new ArrayList();
    ArrayList fn=new ArrayList();                   ArrayList cuerpo1=new ArrayList();
    ArrayList cuerpo2=new ArrayList();              ArrayList fn1=new ArrayList();
    ArrayList fn4=new ArrayList();                  ArrayList fn3=new ArrayList();
    ArrayList fn2=new ArrayList();                  ArrayList fn5=new ArrayList();
    ArrayList fn6=new ArrayList();                  ArrayList flujo6=new ArrayList();  
    
    ArrayList flujo2=new ArrayList();               ArrayList callv=new ArrayList();
    ArrayList call2=new ArrayList();                ArrayList flujo3=new ArrayList(); 
    ArrayList call3=new ArrayList();                ArrayList flujo4=new ArrayList();   
    ArrayList call4=new ArrayList();                ArrayList flujo5=new ArrayList();   
    ArrayList call5=new ArrayList();                ArrayList flujo7=new ArrayList(); 
    ArrayList call6=new ArrayList();                ArrayList flujo8=new ArrayList();    
    ArrayList call7=new ArrayList();                ArrayList flujo9=new ArrayList();           

    public Tables() 
    {
        Funcion();
    declaracionl.add("Tipodedato,");                    declaracionl2.add("Tipodedato,");
    declaracionl.add("Identificador,");/*int: i */      declaracionl2.add("operadorFuncionvacio,");
                                                        declaracionl2.add("Identificador," );        /*string []: s */   
    comandol3.add("Tipodedato,");                   
    comandol3.add("Identificador,");                        comandol.add("Tipodedato,");
    comandol3.add("Operadorasignacion," );/*int i = 0 */    comandol.add("operadorFuncion,");
    comandol3.add("Numero,");                               comandol.add("Identificador," ); // string [1]: s = car 
    
    cs3.add("Identificador,");                              comandol.add("Operadorasignacion," );   
    cs3.add("Mas1,");   /* i ++ */                          comandol.add("Identificador,"); 
                                                    
   cs.add("Identificador,");
   cs.add("Operadorasignacion,");
   cs.add("Identificador,");
   cs.add("Operadorunar1o,");
   cs.add("Identificador,");  
    
    comandol2.add("Tipodedato,");                            cs4.add("Tipodedato,");
    comandol2.add("operadorFuncionvacio,");                  cs4.add("operadorFuncion,");
    comandol2.add("Identificador," );/*string []: s = car */ cs4.add("Identificador,");
    comandol2.add("Operadorasignacion," );
    comandol2.add("Identificador,");
   
    cs1.add("Identificador,");                          cs2.add("Identificador,");
    cs1.add("Operadorasignacion,");                     cs2.add("Operadorasignacion,");
    cs1.add("Identificador,");                          cs2.add("Numero,");
    cs1.add("Mas1,");  /*i = x ++ */                   cs2.add("Operadorunar1o,"); 
                                                        cs2.add("Numero,");              //i = 1 + 1 
    cs5.add("Tipodedato,");                             
    cs5.add("Identificador,");                         
    cs5.add("Operadorasignacion," );/*int i = z */     
    cs5.add("Identificador,");                          

    cuerpo1.add("InicioFuncion,"); 
    cuerpo2.add("TerminadorFuncion,");

    comando4.add("Identificador,");                         operacion.add("Identificador,");
    comando4.add("Operadorasignacion," );/*i = 0 ; */       operacion.add("Operadorasignacion,"); /* i = i+; */
    comando4.add("Numero,");                                operacion.add("Identificador,");
                                                            operacion.add("Operadorunar1o,");        
                                                            operacion.add("Terminador,");
    operacion2.add("Identificador,");
    operacion2.add("Operadorasignacion,");                  operacion3.add("Identificador,");
    operacion2.add("Identificador,");                       operacion3.add("Operadorasignacion,");
    operacion2.add("Mas1,");  /*i = x ++ ;*/                operacion3.add("Numero,");
    operacion2.add("Terminador,");                          operacion3.add("Operadorunar1o,"); 
                                                            operacion3.add("Numero,");              //i = 1 + 1 ;
    operacion4.add("Identificador,");                       operacion3.add("Terminador,"); 
    operacion4.add("Mas1,");   // i ++ ;
    operacion4.add("Terminador,"); 

    /*Declaraciones globales con punto y coma*/
    declaracion.add("Tipodedato,");                  declaracion2.add("Tipodedato,");
    declaracion.add("Identificador,"); /*int: i ;*/  declaracion2.add("operadorFuncionvacio,");
    declaracion.add("Terminador,");                  declaracion2.add("Identificador," );        //string []: s ;
                                                     declaracion2.add("Terminador,");

    declaracion3.add("Tipodedato,");                         comando3.add("Tipodedato,");       
    declaracion3.add("operadorFuncion,");                    comando3.add("Identificador,");      
    declaracion3.add("Identificador," );/*string [0]: s ;*/  comando3.add("Operadorasignacion," );        //int i = 0 ;           
    declaracion3.add("Terminador,");                         comando3.add("Numero,");      
                                                             comando3.add("Terminador,");

    comando5.add("Tipodedato,");                             comando.add("Tipodedato,");
    comando5.add("Identificador,");                          comando.add("operadorFuncion,");
    comando5.add("Operadorasignacion," );/*int i = z ;*/     comando.add("Identificador," ); /* string [1]: s = car ;*/
    comando5.add("Identificador,");                          comando.add("Operadorasignacion," );   
    comando5.add("Terminador,");                             comando.add("Identificador,");
                                                             comando.add("Terminador,");

    comando2.add("Tipodedato,");
    comando2.add("operadorFuncionvacio,");
    comando2.add("Identificador," );        //string []: s = car ;
    comando2.add("Operadorasignacion," );
    comando2.add("Identificador,");
    comando2.add("Terminador,");

    atribucion3.add("Identificador,");
    atribucion3.add("Aumentar," );        //i += z ;
    atribucion3.add("Identificador,");
    atribucion3.add("Terminador,");

    atribucion4.add("Identificador,");
    atribucion4.add("Aumentar," );      //i += 5 ;
    atribucion4.add("Numero,");
    atribucion4.add("Terminador,");

    atribucion5.add("Identificador,");
    atribucion5.add("Igualdad," );        //i == 5 ;
    atribucion5.add("Numero,");
    atribucion5.add("Terminador,");

    atribucion6.add("Identificador,");
    atribucion6.add("Igualdad," );        //i == x ;
    atribucion6.add("Identificador,");
    atribucion6.add("Terminador,");

    expresion.add("Identificador,");
    expresion.add("Diferente," );        //i != 0 ;
    expresion.add("Numero,");
    expresion.add("Terminador,");

    expresion1.add("Identificador,");
    expresion1.add("Diferente," );        //i != x ;
    expresion1.add("Identificador,");
    expresion1.add("Terminador,");
    
    cs6.add("Identificador,");
    cs6.add("Operadorasignacion,");
    cs6.add("Identificador,");         /* a = b ^ c */
    cs6.add("Caracterspecial,");
    cs6.add("Identificador,");
    cs6.add("Caracterespecial,");
    
    cs7.add("Numero,");
    cs7.add("Operadorasignacion,");
    cs7.add("Numero,");         /* a = b ^ c */
    cs7.add("Caracterspecial,");
    cs7.add("Numero,");
    
        flujo1.add( "Palabrareservadaf,"); //if (expresión) then declaraciones
//        flujo1.add( "Palabrareservadag,");
        
        flujo2.add( "Palabrareservadaf,");  //  if (expresión) then comando
        flujo2.add( "Palabrareservadag,");
                
        flujo3.add( "Palabrareservadaf,");
        flujo3.add( "Palabrareservadag,"); //if (expresión) then decla else decla
        flujo3.add( "Palabrareservadagt");
        
        flujo4.add( "Palabrareservadaf,");
        flujo4.add( "Palabrareservadag,");    //if (expresión) then comando else comando
        flujo4.add( "Palabrareservadagt");
        flujo5.add( "Palabrareservadaf,");
  
        flujo5.add( "Palabrareservadag,");//if (expresión) then decla else comando
        flujo5.add( "Palabrareservadagt");
        
        
        flujo6.add( "Palabrareservadaf,");
        flujo6.add( "Palabrareservadag,");    //if (expresión) then comando else decla
        flujo6.add( "Palabrareservadagt");
        
        flujo7.add( "Palabrareservada");
        flujo7.add( "Palabrareservada");        //while (expresión) do comando
       
        flujo8.add( "Palabrareservada");
        flujo8.add( "Palabrareservada");        //while (expresión) do decla
        
        flujo9.add( "Palabrareservada");
        flujo9.add( "Palabrareservada");        //do comando while (expresión)
        
    }
    
    public void estructura(List<List<String>> h,  long linea, BufferedWriter fw1)
    {
        int e=0;
        try
        {
            for (int i = 0; i < h.size(); i++) {   
                controlFlujo(h, fw1, i, linea);
                comandosSimples(h, fw1, i, linea);
                 t(h,fw1,i);
                if(h.get(i).equals(fp))
                {
                    linea=i+1;
                    System.out.println("Declaración de función main en Línea "+linea);//        
                    fw1.write(linea+" PalabraReservada "+"Funcionprincipal "+"Caracterespecial "+"Caracterespecial "+"EncabezadoFuncionPrincipal");
                    fw1.newLine();
                    fw1.flush();
                    e=i+1;
                    CuerpoFuncion(h, fw1, i, e);
                }
                if (h.get(i).equals(fnvacia))
                {
                    linea=i+1;
                    System.out.println("Declaración de función (sin argumentos) en Línea "+linea);//        
                    fw1.write(linea+" Tipovalorretorno "+"Identificador "+"Caracterespecial "+"Caracterespecial "+"EncabezadoFuncion");
                    fw1.newLine();
                    fw1.flush();
                    e=i+1;
                    CuerpoFuncion(h, fw1, i, e);
                }
            if(h.get(i).equals(fn6))
            {
                linea=i+1;
                System.out.println("Declaración de función (7 argumentos) en Línea "+linea);
                
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            if(h.get(i).equals(fn5))
            {
                linea=i+1;
                System.out.println("Declaración de función (6 argumentos) en Línea "+linea);
                
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            if(h.get(i).equals(fn4))
            {
                linea=i+1;
                System.out.println("Declaración de función (5 argumentos) en Línea "+linea);
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            if(h.get(i).equals(fn3))
            {
                linea=i+1;
                System.out.println("Declaración de función (4 argumentos) en Línea "+linea);
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            if(h.get(i).equals(fn2))
            {
                linea=i+1;
                System.out.println("Declaración de función (3 argumentos) en Línea "+linea);
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            if(h.get(i).equals(fn1))
            {
                linea=i+1;
                System.out.println("Declaración de función (2 argumentos) en Línea "+linea);
                fw1.write(linea+" Tipovalorretorno "+"Identificador "+"Caracterespecial "
                        +"Tipodedato "+"Identificador "+"Coma "
                        +"Tipodedato "+"Identificador "+"Caracterespecial "+" EncabezadoFuncion");
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            if (h.get(i).equals(fn))
            {
                linea=i+1;
                System.out.println("Declaración de función (1 argumento) en Línea "+linea);
                fw1.write(linea+" Tipovalorretorno "+"Identificador "+"Caracterespecial "
                        +"Tipodedato "+"Identificador "+"Caracterespecial "+" EncabezadoFuncion");
                fw1.newLine();
                fw1.flush();
                e=i+1;
                CuerpoFuncion(h, fw1, i, e);
            }
            else
            {
                declaracionesglobales(h, fw1, i, linea); 
            }
            if(h.get(i).equals(atribucion3)){linea=i+1;System.out.println("Atribucion en línea "+linea);}
            else if(h.get(i).equals(atribucion4)){linea=i+1;System.out.println("Atribución en línea "+linea);}
            else if(h.get(i).equals(atribucion5)){linea=i+1;System.out.println("Atribución en línea "+linea);}
            else if(h.get(i).equals(atribucion6)){linea=i+1;System.out.println("Atribución en línea "+linea);}
            else if(h.get(i).equals(expresion)){linea=i+1;System.out.println("Atribución (condición) en línea "+linea);}
            else if(h.get(i).equals(expresion1)){linea=i+1;System.out.println("Atribución (condición) en línea "+linea);}

            else if(h.get(i).equals(cuerpo2)){linea=i+1;
            System.out.println("Termina Función en línea "+linea);
            fw1.write(linea+" TerminaFuncion");
            fw1.newLine();
            fw1.flush();
            }
            else
            {
                llamadaFunciones(h, i, linea, fw1);
            }
            }  
        
        } catch (IOException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        
    public void declaracionesglobales(List<List<String>> h, BufferedWriter fw1, int i, long linea) throws IOException
    {
//        System.out.println(h.get(i)+" ");

        if(h.get(i).equals(declaracion))
        {linea=i+1;System.out.println("Declaración Global en Línea "+linea);
         fw1.write(linea+" Tipodedato "+"Identificador "+"Terminador "+"DeclaracionGlobal");
         fw1.newLine();
         fw1.flush();
        }
        if(h.get(i).equals(declaracion2))
        {linea=i+1;System.out.println("Declaración Global en Línea "+linea);
        fw1.write(linea+" Tipodedato "+"operadorFuncionvacio "+"Identificador "+"Terminador "+"Declaracion Global en Líne");
        fw1.newLine();
        fw1.flush();
        }
        if(h.get(i).equals(declaracion3)){linea=i+1;System.out.println("Declaración Global en Línea "+linea);
        fw1.write(linea+" Tipodedato "+"operadorFuncion "+"Identificador "+"Terminador "+"DeclaracionGlobal");
         fw1.newLine();
         fw1.flush();
        }
        if(h.get(i).equals(comando3)){linea=i+1;System.out.println("Declaración Global en Línea "+ linea);
         fw1.write(linea+" Tipodedato "+"Identificador "+"Operadorasignacion "+"Numero "+"Terminador "+"DeclaracionGlobal");
         fw1.newLine();
         fw1.flush();}
        if(h.get(i).equals(comando5)){linea=i+1;System.out.println("Declaración Global en Línea "+linea);
         fw1.write(linea+" Tipodedato "+"Identificador "+"Operadorasignacion "+"Identificador "+"Terminador "+"DeclaracionGlobal");
         fw1.newLine();
         fw1.flush();}
        if(h.get(i).equals(comando2)){linea=i+1;System.out.println("Declaración Global en Línea "+linea);
         fw1.write(linea+" Tipodedato "+"operadorFuncionvacio "+"Identificador " 
                 +"Operadorasignacion " +"Identificador "+"Terminador "+"DeclaracionGlobal");
         fw1.newLine();
         fw1.flush();}
        if(h.get(i).equals(comando))
        {
         linea=i+1;System.out.println("DECLARACION VECTOR GLOBAL EN LÍNEA "+linea);
           fw1.write(linea+"Tipodedato "+"operadorFuncion "+"Identificador " 
                 +"Operadorasignacion " +"Identificador "+"Terminador "+"DeclaracionGlobal");
         fw1.newLine();
         fw1.flush();
        }
        else
        {
            declaracioneslocales(h, fw1, i, linea);}
    }
     
    public void declaracioneslocales(List<List<String>> h, BufferedWriter fw1, int i, long linea) throws IOException
    {
//        System.out.println(h.get(i)+"");

   if(h.get(i).equals(declaracionl2)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Tipodedato "+"operadorFuncionvacio "+"Terminador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(declaracionl)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Tipodedato "+"Identificador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(comandol3)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
  fw1.write(linea+" Tipodedato "+"Identificador "+"operadorasignacion "+"Numero "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(comandol2)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
  fw1.write(linea+" Tipodedato "+"operadorFuncionvacio "+"Identificador "+"Operadorasignacion "+"Terminador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(comandol)){
   linea=i+1;System.out.println("Declaracion local (vector) en línea "+linea);
  fw1.write(linea+" Tipodedato "+"operadorFuncion "+"Identificador "+"Operadorasignacion "+"Identificador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(cs)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Identificador "+"Operadorasignacion "+"Identificador "+"Operadorunario "+"Identificador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(cs1)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Identificador "+"Operadorasignacion "+"Identificador "+"Mas1 "+"Atribucion");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(cs2)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Identificador "+"Operadorasignacion "+"Numero "+"Operadorunar1o "+"Numero "+"Aritmetica");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(cs3)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Identificador "+"Mas1 "+ "Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(cs4)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Tipodedato "+ "operadorFuncion "+"Identificador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
   if(h.get(i).equals(cs5)){linea=i+1;System.out.println("Declaracion local en línea "+linea);
   fw1.write(linea+" Tipodedato "+ "Identificador "+"Operadorasignacion "+"Identificador "+"Declaracionlocal");
   fw1.newLine();
   fw1.flush();}
       

    }

    public void comandosSimples(List<List<String>> h, BufferedWriter fw1, int i, long linea) throws IOException
    {
//        System.out.println("+++"+comando4.toString());
                                             
       if(h.get(i).equals(operacion4)){linea=i+1;System.out.println("Atribución (comandosimple) en línea "+linea);
       fw1.write(linea+" Identificador "+"Mas1 "+"Terminador "+"Atribucion(comandosimple)");
       fw1.newLine();
       fw1.flush();}
       if(h.get(i).equals(operacion3)){linea=i+1;System.out.println("Atribución (comandosimple) en línea "+linea);
       fw1.write(linea+" Identificador "+"Operadorasignacion "+"Numero "+"Operadorunar1o "
               +"Numero "+"Terminador "+"Atribucion(comandosimple)");
       fw1.newLine();
       fw1.flush();}
       if(h.get(i).equals(operacion2)){linea=i+1;System.out.println("Atribución (comandosimple) en línea "+linea);
       fw1.write(linea+" Identificador "+"Operadorasignacion "+"Identificador "
               +"Mas1 "+"Terminador "+"Atribucion(comandosimple)");
       fw1.newLine();
       fw1.flush();}
       if(h.get(i).equals(comando4)){linea=i+1;System.out.println("Atribución (comandosimple) en línea "+linea);
       fw1.write(linea+" Identificador "+ "Operadorasignacion "+"Numero "+ "Atribucion(comandosimple)");
       fw1.newLine();
       fw1.flush();}
       if(h.get(i).equals(operacion)){ linea=i+1;System.out.println("Atribución (comandosimple) en línea "+linea);
       fw1.write(linea+" Identificador "+ "Operadorasignacion "+"Identificador "
               + "Operadorunar1o "+"Terminador "+"Atribucion(comandosimple)");
       fw1.newLine();
       fw1.flush();}
    }
    
    public void Funcion()
    {
        fnvacia.add( "Tipovalorretorno,");
        fnvacia.add( "Identificador,");
        fnvacia.add( "Caracterespecial,");
        fnvacia.add( "Caracterespecial,");
        
        
        fp.add( "PalabraReservada,");
        fp.add( "Funcionprincipal,");
        fp.add( "Caracterespecial,");
        fp.add( "Caracterespecial,");
        
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
        fn2.add( "Caracterespecial,");
        
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
        
        callv.add("Identificador,");
        callv.add("Caracterespecial,");        //funcion ( )
        callv.add("Caracterespecial,");
        
        call2.add("Identificador,");
        call2.add("Caracterespecial,");
        call2.add("Identificador,");               //funcion ( i ) 
        call2.add("Caracterespecial,");
        
        call.add("Identificador,");
        call.add("Caracterespecial,");
        call.add("Identificador,");               //funcion ( i , y ) 
        call.add("Coma,");
        call.add("Identificador,");
        call.add("Caracterespecial,");
        
        call3.add("Identificador,");
        call3.add("Caracterespecial,");
        call3.add("Identificador,");               //funcion ( i , y , z ) 
        call3.add("Coma,");
        call3.add("Identificador,");
        call3.add("Coma,");
        call3.add("Identificador,");
        call3.add("Caracterespecial,");
        
        call4.add( "Identificador,");
        call4.add( "Caracterespecial,");
        call4.add( "Identificador,");        //funcion ( i , y , z , a) 
        call4.add( "Coma,");
        call4.add( "Identificador,");
        call4.add( "Coma,");
        call4.add( "Identificador,");
        call4.add( "Coma,");
        call4.add( "Identificador,");
        call4.add( "Caracterespecial,");
        
        call5.add( "Identificador,");
        call5.add( "Caracterespecial,");
        call5.add( "Identificador,");
        call5.add( "Coma,");
        call5.add( "Identificador,");    //funcion ( i , y , z , a , x) 
        call5.add( "Coma,");
        call5.add( "Identificador,");
        call5.add( "Coma,");
        call5.add( "Identificador,");
        call5.add( "Coma,");    
        call5.add( "Identificador,");
        call5.add( "Caracterespecial,");

        call6.add( "Identificador,");
        call6.add( "Caracterespecial,");
        call6.add( "Identificador,");
        call6.add( "Coma,");
        call6.add( "Identificador,");
        call6.add( "Coma,");
        call6.add( "Identificador,");        //funcion ( i , y , z , a , x , h) 
        call6.add( "Coma,");
        call6.add( "Identificador,");
        call6.add( "Coma,");
        call6.add( "Identificador,");
        call6.add( "Coma,");
        call6.add( "Identificador,");
        call6.add( "Caracterespecial,");
   
        call7.add( "Identificador,");
        call7.add( "Caracterespecial,");
        call7.add( "Identificador,");
        call7.add( "Coma,");
        call7.add( "Identificador,");
        call7.add( "Coma,");
        call7.add( "Identificador,");    //funcion ( i , y , z , a , x , h , u) 
        call7.add( "Coma,");
        call7.add( "Identificador,");
        call7.add( "Coma,");
        call7.add( "Identificador,");
        call7.add( "Coma,");
        call7.add( "Identificador,");
        call7.add( "Coma,");
        call7.add( "Identificador,");
        call7.add( "Caracterespecial,");
        
    }
        
    public void llamadaFunciones(List<List<String>> h, int i, long linea, BufferedWriter fw1)
    {
        if(h.get(i).equals(call)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
        if(h.get(i).equals(callv)){linea=i+1;System.out.println("Llamada de función vacía en línea "+linea);}
        if(h.get(i).equals(call2)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
        if(h.get(i).equals(call3)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
        if(h.get(i).equals(call4)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
        if(h.get(i).equals(call5)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
        if(h.get(i).equals(call6)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
        if(h.get(i).equals(call7)){linea=i+1;System.out.println("Llamada de función en línea "+linea);}
       
    }
 
    public void CuerpoFuncion(List<List<String>> h, BufferedWriter fw1, int i, int e)
    { 
        try
        {
            if (h.get(e).get(0).equals(cuerpo1.get(0)))
            {
                e=e+1;
                System.out.println("Inicia Función en línea "+e);  
                fw1.write(e+" IniciaFuncion");
                fw1.newLine();
                fw1.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void controlFlujo(List<List<String>> h, BufferedWriter fw1, int i, long e) throws IOException
    {
//        System.out.println(i);
        if(h.get(i).get(0).equals(flujo1.get(0)))
        {
            if (h.get(i).get(1).equals("Caracterespecial,"))
            {
                if(h.get(8).get(2).equals(cs6.get(0))&& h.get(9).get(3).equals(cs6.get(1))
                   && h.get(9).get(4).equals(cs6.get(2)) && h.get(9).get(5).equals(cs6.get(3))
                   && h.get(9).get(6).equals(cs6.get(4))&&h.get(9).get(7).equals(cs6.get(5)))
                {
                   i=i+1;System.out.println("if + Atribución (comandosimple) en línea "+i);
                   fw1.write(i+" Palabrareservada "+"Caracterespecial "+"Identificador "+"Operadorasignacion "+"Identificador "
                           +"AND "+"Identificador "+"Caracterespecial "+"ifconComandosimple");
                   fw1.newLine();
                   fw1.flush();}
                }
            }
    }

public void t(List<List<String>> h, BufferedWriter fw1, int i) throws IOException 
    {
//        System.out.println(h.get(i).get(0)+"");
        if(h.get(i).get(0).equals("Palabrareservadag,"))
        {
           i=i+1;
           System.out.println("Palabra reservada en línea "+i);
           fw1.write(i+" Comandothen");
           fw1.newLine();
           fw1.flush();
        }
    }
        
}
