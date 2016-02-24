package Semantics;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class Induccion {
    
     public Induccion(List<List<String>> g, BufferedWriter fw1) throws IOException {
         
         System.out.println(g.toString()+"");
         for (int i = 0; i < g.size(); i++) {
//        System.out.println(i+" "+g.get(2).get(0));
        if (g.get(i).get(0).equals("string") || g.get(i).get(0).equals("char")) 
        {
//            i = i + 1;
            System.out.println("No existe inducción de tipos para string o char en línea " +i);
        }
        else if (g.get(i).get(0).equals("int")||g.get(i).get(0).equals("float")) 
        {
            for (int j = 1; j < g.get(i).size() ; j++) {
                
                if(!g.get(i).get(j).equals("int")|| !g.get(i).get(j).equals("float")|| !g.get(i).get(j).equals("bool"))
                { 
                    i = i + 1;
                    System.out.println("No existe inducción posible en línea "+i);
                    fw1.write(i + " N.I.");
                    fw1.newLine();
                    fw1.flush();
                }
                else
                {
                     i=i+1;
                System.out.println("No existe inducción posible en línea "+i);
                    fw1.write(i + " N.I.");
                    fw1.newLine();
                    fw1.flush();
                }
            }
        }
        
        else if(!Character.isLetterOrDigit(g.get(i).get(0).charAt(0)))
        {
//             i=i+1;
            System.out.println("No existe inducción posible (simbolo) en línea "+i);
                    fw1.write(i + " N.I.");
                    fw1.newLine();
                    fw1.flush();
        }
        else
        {
            i=i+1;
            System.out.println("No existe inducción posible (letra) en línea "+i);
                    fw1.write(i + " N.I.");
                    fw1.newLine();
                    fw1.flush();
        }
     }
         System.out.println("\nNo existen más Inducciones o Inferencias por comprobar.");
     }
    
