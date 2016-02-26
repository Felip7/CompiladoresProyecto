package Semantics;

import java.io.*;
import java.util.*;

public class Induccion {
    String[] inducc;
    
     public Induccion(List<List<String>> f, List<List<String>> g, 
        int i, int lineas, String[] p, String[] coincidenciaslineas, BufferedWriter fw1) throws IOException 
     {
          
         //Remover nulos
         String[] cl= new String[coincidenciaslineas.length];
         System.arraycopy(coincidenciaslineas, 0, cl, 0, coincidenciaslineas.length);
         
         List<String> list = new ArrayList<>();
         for(String s : cl) {
             if(s != null && s.length() > 0) {
                 list.add(s);
             }
         }
         cl = list.toArray(new String[list.size()]);
         
         System.out.println(Arrays.toString(cl)+""); 
         
         inducc=new String[g.size()];
         
         System.out.println("\nInducción de Tipos");
         System.out.println("Variables encontradas");
            
         for ( i = 0; i < g.size(); i++) 
         {
             for (int v = 1; v < g.get(i).size() ; v++) {
            if (g.get(i).get(0).equals("int")||g.get(i).get(0).equals("float")) 
            {
                     int e=i+1;
                     
                     if(g.get(i).size()>1 && !Character.isLetterOrDigit((g.get(i).get(1).charAt(0))))
                     {
                         inducc[i]=g.get(i).get(0)+" "+g.get(i).get(1)+" "+g.get(i).get(2);
                          
                         int l = g.size() - 1;
                         int nrol;
                         
                         for (int k = 0; k < l; k++) {
                             for (int j = 1; j < g.size(); j++) {   
                                if (g.get(k).size() > 1 && g.get(j).size() > 1 && k != j) {
                                    if (g.get(k).get(1).equals("=") || g.get(j).get(1).equals(";")
                                        ||g.get(j).get(2).equals("(")||g.get(j).get(2).equals(")")
                                        ||g.get(k).get(1).equals("(") || g.get(j).get(1).equals(")")
                                        ||g.get(j).get(2).equals("=")||g.get(j).get(2).equals(";")){}
                                    else if (g.get(k).get(1).equals(g.get(j).get(1))) 
                                    {
                                        nrol = j + 1;
                                        System.out.println("\nUso de variable en línea " + nrol);
                                         
//                        System.out.println(g.get(k).get(1)+(g.get(j).get(1)));
                                        break;
                                    }
                                    else if (g.get(k).get(1).equals(g.get(j).get(2)))
                                    {
                                        nrol = j + 1;
                                        System.out.println("Uso de variable "+g.get(k).get(1)+" en línea "
                                        + j+" y en línea "+nrol+". Sin posible inducción"); 
                                       
                                        break;
                                    }
                                } 
                            } break;
                        }
                } 
               
                else
                {
                    inducc[i]=g.get(i).get(0)+" "+g.get(i).get(1);
                }
            }
            else if (g.get(i).get(0).equals("string") || g.get(i).get(0).equals("char")) 
            {
                i = i + 1;
                System.out.println("No existe inducción de tipos para string o char en línea " +i);
            }
             if(!g.get(i).get(v).equals("int")|| !g.get(i).get(v).equals("float")|| !g.get(i).get(v).equals("bool"))
                { 
                    i = i + 1;
                    System.out.println("No existe inducción posible en línea "+i);
//                    fw1.write(i + " N.I.");
//                    fw1.newLine();
//                    fw1.flush();
                }
                 else if(!Character.isLetterOrDigit(g.get(i).get(0).charAt(0)))
        {
//             i=i+1;
            System.out.println("No existe inducción posible (simbolo) en línea "+i);
//                    fw1.write(i + " N.I.");
//                    fw1.newLine();
//                    fw1.flush();
        }
        else
        {
            i=i+1;
            System.out.println("No existe inducción posible (letra) en línea "+i);
//                    fw1.write(i + " N.I.");
//                    fw1.newLine();
//                    fw1.flush();
        }
     }
         }
//         System.out.println(Arrays.toString(inducc)+""); 

         System.out.println("\nNo existen más Inducciones o Inferencias por comprobar.");        
}

     
