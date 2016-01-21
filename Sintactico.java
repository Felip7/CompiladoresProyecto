
package Syntax;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class Sintactico {

    int NumeroLineas=1;
    
    
    public Sintactico(String part1, String part2) throws IOException {


        try {
             BufferedReader br = new BufferedReader( new FileReader("D:\\salida.csv"));
             String line;
           
            line = br.readLine();
//            System.out.println(part1+"__"+part2+"__"+part3+"__"+part4);

//            String no[]= {"Numero","Caracter especial","Operando Compuesto",
//                "Literal","Identificador","Palabra reservada","OperadorUnario","Valorbooleano","Tipodedato"};
            int i=0;
            int tokenNumber=0;
            
            while((line != null))
            { 
                StringTokenizer st = new StringTokenizer(line, ",");
                
                
                if (st.countTokens()==2)
                {
                    for(int z=0; z<=st.countTokens(); z++)
                    {
                        String part = st.nextToken(",");
                        
                        if(part.equals(part1))
                        {
                             System.out.println("Es declaración, en línea "+NumeroLineas+" : "+part1+" "+part2);
                             break;
                        }
                        else
                        {
//                            System.out.println(st.countTokens());
                            z++;
                            break;
                        }
                    }
                    break;
                }
                else
                {
//                    System.out.println(st.countTokens()+"");
                    System.out.println("Error sintactico en línea "+NumeroLineas);  
                    NumeroLineas++;
                    break;
                }
  
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Sintactico.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}



