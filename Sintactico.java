/*Esteban Díaz, Carlos Osorio*/
package Syntax;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
 
public class Sintactico {

    Tables ht=new Tables();
    Hashtable c1=new Hashtable();
    ArrayList c2=new ArrayList();
    
    public Sintactico(){ 
        
        File f = new File( "D:\\salida.csv" );
        int NroL=1;
        
        BufferedReader entrada;
        try {
            
            entrada = new BufferedReader( new FileReader( f ) );
            String linea;
            while(entrada.ready()==true)
            {
                linea = entrada.readLine();
//              System.out.println(linea+"-");
                id(linea,NroL);
                NroL++;
            }
        }catch (IOException e){{}}
        
        int numero=NroL-3;
        
        System.out.println("Claves: " +c1.toString()+numero);
        ht.comparar(c1,numero);
        ht.comprobar(c2,numero);
//         System.out.println("Claves: " +c1.toString());
        
    }
    
    public void id(String part, int NumeroLineas) throws IOException {
        
        StringTokenizer st=new StringTokenizer(part);
//        System.out.println(NumeroLineas+"");
        if (part.contains(" "))
        {         
                String part1=st.nextToken();
//                System.out.println(part1+"");
                    c1.put(NumeroLineas, part1);
                
//                Enumeration<String> enu = c1.elements();
//                Enumeration llaves = c1.keys();
//                while (enu.hasMoreElements() &&llaves.hasMoreElements()) {
//                System.out.println("k: " + llaves.nextElement()+" v: " + enu.nextElement()); 
                
                    String part2=st.nextToken();
//                System.out.println(part2+"_");
                
                
                
                c2.add(part2);
               
               
                       
        }
 
        
}

    public void Sep(String linea, int NumeroLineas) {

//                
//            String [] palabras = linea.split(" ");
////            System.out.println(palabras.length+"#");
//            System.out.println(st.countTokens());
//            
//            
//                for (int z=0; z<palabras.length; z++) {
//                String part1 = palabras[z];
////                System.out.println(part1+"_");
//                
//                
//                
            
                }


}
                
      
        
    





