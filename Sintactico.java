
package Syntax;

import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
 
public class Sintactico {

    HashTables ht=new HashTables();
    Hashtable c1=new Hashtable();
    Hashtable c2=new Hashtable();
    
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
        
         System.out.println("Claves: " +c1.toString());
         System.out.println("Claves: " +c2.toString());
//         ht.comparar(c1,c2);
         
    }
    
    public void id(String part, int NumeroLineas) throws IOException {
        
        StringTokenizer st=new StringTokenizer(part);
      
        
//        System.out.println(NumeroLineas+"");
        if (part.contains(" "))
        {         
                String part1=st.nextToken();
//                System.out.println(part1+"");
                
                
                if(NumeroLineas>3)
                {
                    c2.put(NumeroLineas, part1);
                }
                else
                {
                    c1.put(NumeroLineas, part1);
                }
//                Enumeration<String> enu = c1.elements();
//                Enumeration llaves = c1.keys();
//                while (enu.hasMoreElements() &&llaves.hasMoreElements()) {
//                System.out.println("k: " + llaves.nextElement()+" v: " + enu.nextElement()); 
                       
        }
 
        
}

    public void Sep(String linea, int NumeroLineas) {
        
        
                
                
//                String part2=st.nextToken();
////                System.out.println(part2+"_");
//                
//                String cad2 = String.valueOf(NumeroLineas);
//                Hashtable<String,String> c2=new Hashtable<>();
//                c2.put(cad2, part2);
//               
//               Enumeration<String> enumeration2 = c2.elements();
//                while (enumeration2.hasMoreElements()) {
//                    System.out.println(""+"v2 " + enumeration2.nextElement());}
//                
//                Enumeration<String> llaves2 = c2.keys();
//                while (llaves2.hasMoreElements()) {
//                    System.out.println(""+"k2 " + llaves2.nextElement());}
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



