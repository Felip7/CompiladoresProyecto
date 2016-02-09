/*Esteban Díaz, Carlos Osorio*/
package Syntax;

import Semantics.Tables;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class leerCSV {
    
    ArrayList arreglo ;
    
    //Estructura del lenguaje
    Tables ht=new Tables();
    
    //Estructura del archivo de entrada
    ArrayList c1=new ArrayList();
    
    //lexemas almacenados
    ArrayList c2=new ArrayList();

  public leerCSV(int lineas1, String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException {
      
      lineas1=lineas1-1;
      System.out.println(lineas1);
     
      
     List<List<String>> stringArray = new ArrayList<List<String>>(lineas1);
     
      for (int i = 0; i < lineas1; i++) 
      {
           stringArray.add(new ArrayList<String>());
      }
     
      usar(stringArray,bufferIn, in, fw1, br);

    }
  
public void usar( List<List<String>> stringArray, String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException
{
//   System.out.println(stringArray.toString()+""+stringArray.size());
    lsyn(stringArray,bufferIn, in, fw1, br);
}


public void lsyn(List<List<String>> stringArray, String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException {
    int NumeroLineas=1;
    int lineaentrada=0;
        try
        {
            while((bufferIn=in.readLine())!=null && br.readLine()!=null)
            {
                int i=0;
                String cad=bufferIn.trim();

                while(i<cad.length())
                {
                    if(Character.isDigit(cad.charAt(0)))
                    {
//                        System.out.println("ls"+NumeroLineas);
                         id(stringArray,cad, fw1, lineaentrada);
                         break;
                    }
                    else
                    {
                        System.err.println("Error en línea "+NumeroLineas+ "se esperaba el número de línea para el símbolo");
                    }    
                }
                i++;  
                NumeroLineas++;
              }
            
        } catch (IOException ex) {
            Logger.getLogger(leerCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
public void id(List<List<String>> stringArray, String cad, BufferedWriter fw1, int nrol) throws IOException {
        
        String part1;
        String part2, part3, part4;    
//            String [] palabras = cad.split(" ");
//            System.out.println(palabras.length+"#");
            
//            for (int z=0; z<palabras.length; z++) 
//            {
//                part1 = palabras[z];
//                System.out.println(z+"_" +part1);
//                if(Character.isDefined(part1.charAt(0)))
//                {
                    StringTokenizer st=new StringTokenizer(cad);
                    if(cad.contains(" "))
                    {
                     part2=st.nextToken();
                     part3=st.nextToken();
                     part4=st.nextToken();
                     
//                  System.out.println(part2+" "+part3+" "+part4);
                  
                  if(Integer.valueOf(part2)==1)
                  {
                  stringArray.get(0).add(part3); 
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(0), nrol);
                  }
                  if(Integer.valueOf(part2)==2)
                  {
                  stringArray.get(1).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(1), nrol);
                  }
                  if(Integer.valueOf(part2)==3)
                  {
                  stringArray.get(2).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(2), nrol);
                  }
                  if(Integer.valueOf(part2)==4)
                  {
                  stringArray.get(3).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(3), nrol);
                  
                  }
                  if(Integer.valueOf(part2)==5)
                  {
                  stringArray.get(4).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(4), nrol);
                  }
                  if(Integer.valueOf(part2)==6)
                  {
                  stringArray.get(5).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(5), nrol);
                  }
                  if(Integer.valueOf(part2)==7)
                  {
                  stringArray.get(6).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(6), nrol);
                  }
                  if(Integer.valueOf(part2)==8)
                  {
                  stringArray.get(7).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(7), nrol);
                  }
                  if(Integer.valueOf(part2)==9)
                  {
                  stringArray.get(8).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(8), nrol);
                  }
                  if(Integer.valueOf(part2)==10)
                  {
                  stringArray.get(9).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(9), nrol);
                  }
                  if(Integer.valueOf(part2)==11)
                  {
                  stringArray.get(10).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(10), nrol);
                  }
                  if(Integer.valueOf(part2)==12)
                  {
                  stringArray.get(11).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(11), nrol);
                  }
                  if(Integer.valueOf(part2)==13)
                  {
                  stringArray.get(12).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(12), nrol);
                  }
                  if(Integer.valueOf(part2)==14)
                  {
                  stringArray.get(13).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(13), nrol);
                  }
                  if(Integer.valueOf(part2)==15)
                  {
                  stringArray.get(14).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(14), nrol);
                  }
                  if(Integer.valueOf(part2)==16)
                  {
                  stringArray.get(15).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(15), nrol);
                  }
                  if(Integer.valueOf(part2)==17)
                  {
                  stringArray.get(16).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(16), nrol);
                  }
                  if(Integer.valueOf(part2)==18)
                  {
                  stringArray.get(17).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(17), nrol);
                  }
                  if(Integer.valueOf(part2)==19)
                  {
                  stringArray.get(18).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(18), nrol);
                  }
                  if(Integer.valueOf(part2)==20)
                  {
                  stringArray.get(19).add(part3);
                  nrol=Integer.valueOf(part2);
                  ht.comparar((ArrayList) stringArray.get(19), nrol);
                  }
                  
                  
//         System.out.println(stringArray.toString()+"");         
                  
                 
                    }

////                else if (part1.equals("Tipovalorretorno,")||part1.equals("Identificador,")||
////                    part1.equals("Caracterespecial,")||part1.equals("Tipodedato,")||
////                        part1.equals("Tipodedato,")|| part1.equals("Numero,"))
                 

}
    
}
