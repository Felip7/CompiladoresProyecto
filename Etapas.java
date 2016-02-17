package Control;

import GenCod.Gencod;
import Lex.CrearTexto;
import Semantics.Semantico;
import Syntax.Sintactico;
import java.io.IOException;

public class Etapas {
    
    public static int lineas;
    public static int lineas1;
    
      public static void main(String args[]) throws IOException {
//          Analizador Léxico
        CrearTexto ct=new CrearTexto();
        ct.creaArchivoTexto("D:\\", "salida",lineas);
        
//        System.out.println(lineas1+"");
        
        //Analizador Sintáctico
        Sintactico sx = new Sintactico(lineas1);
   
        //Analizador Semántico
        Semantico scs=new Semantico(lineas1);
        
        //Generación de Código
        Gencod gcd=new Gencod(lineas1);
    
      }
      
      public void recuperar(int nrolineas)
      {
          lineas1=nrolineas;
//          System.out.println(lineas1+"ya");
      }
}

}
