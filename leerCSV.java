/*Esteban Díaz, Carlos Osorio*/
/*Esteban Díaz, Carlos Osorio*/
package Syntax;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class leerCSV {
    //Estructura del lenguaje
    Tables ht=new Tables();
    //Estructura del archivo de entrada
    List<List<String>> c1=new ArrayList<>();
    ArrayList h2=new ArrayList();
    String part2 = "", part3 = "";
    

public leerCSV(int lineas1, String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException {
      lineas1=lineas1-1;
//      System.out.println(lineas1);
     List<List<String>> stringArray = new ArrayList<>(lineas1);
     
      for (int i = 0; i < lineas1; i++) 
      {
           stringArray.add(new ArrayList<>());
      }
      usar(stringArray,bufferIn, in, fw1, br);
    }
  
public void usar( List<List<String>> stringArray, String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException
{
//   System.out.println(stringArray.toString()+""+stringArray.size());
    syn(stringArray,bufferIn, in, fw1, br);
}

public void syn(List<List<String>> stringArray, String bufferIn, DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException {
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
                        StringTokenizer st=new StringTokenizer(cad);
                        if(cad.contains(" "))
                        {
                            part2=st.nextToken();
                            part3=st.nextToken();
                            c1=partir(stringArray, part2, part3, fw1);
                            lineaentrada=lineastxt(part2);
//                            System.out.println(stringArray.toString());
                        }
                         break;
                    }
                    else
                    {
                       System.err.println("Error en línea "+NumeroLineas+ " se esperaba un número en el archivo CSV.");
                    }    
                }
                i++;  
                NumeroLineas++;
              }
            ht.estructura(c1,lineaentrada,fw1);
        } catch (IOException ex) {
            Logger.getLogger(leerCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
public List<List<String>> partir(List<List<String>> stringArray, String part2, String part3, BufferedWriter fw1) throws IOException {

                  if(Integer.valueOf(part2)==1)
                  {
                  stringArray.get(0).add(part3); 
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==2)
                  {
                  stringArray.get(1).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==3)
                  {
                  stringArray.get(2).add(part3);
                   
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==4)
                  {
                  stringArray.get(3).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==5)
                  {
                  stringArray.get(4).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==6)
                  {
                  stringArray.get(5).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==7)
                  {
                  stringArray.get(6).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==8)
                  {
                  stringArray.get(7).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==9)
                  {
                  stringArray.get(8).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==10)
                  {
                  stringArray.get(9).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==11)
                  {
                  stringArray.get(10).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==12)
                  {
                  stringArray.get(11).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==13)
                  {
                  stringArray.get(12).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==14)
                  {
                  stringArray.get(13).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==15)
                  {
                  stringArray.get(14).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==16)
                  {
                  stringArray.get(15).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==17)
                  {
                  stringArray.get(16).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==18)
                  {
                  stringArray.get(17).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==19)
                  {
                  stringArray.get(18).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==20)
                  {
                  stringArray.get(19).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==21)
                  {
                  stringArray.get(20).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==22)
                  {
                  stringArray.get(21).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==23)
                  {
                  stringArray.get(22).add(part3);
                  
                  return stringArray;            
                  }
                  if(Integer.valueOf(part2)==24)
                  {
                  stringArray.get(23).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==25)
                  {
                  stringArray.get(24).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==26)
                  {
                  stringArray.get(25).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==27)
                  {
                  stringArray.get(26).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==28)
                  {
                  stringArray.get(27).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==29)
                  {
                  stringArray.get(28).add(part3);
                  
                  return stringArray;
                  }
                  if(Integer.valueOf(part2)==30)
                  {
                  stringArray.get(29).add(part3);
                  
                  return stringArray;
                  }
                    
////                else if (part1.equals("Tipovalorretorno,")||part1.equals("Identificador,")||
////                    part1.equals("Caracterespecial,")||part1.equals("Tipodedato,")||
////                        part1.equals("Tipodedato,")|| part1.equals("Numero,"))
        return null;
        }

public int lineastxt(String part2)
{
//    System.out.println(part2+"");
     int nrol=Integer.valueOf(part2);
     return nrol;
}

}
