package GenCod;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Reg {
    String part2 = "", part3, part4 = "";
    String r="r",c2="c2",c3="c3";

public Reg(int lineas1, String bufferIn, DataInputStream in, BufferedWriter bw1, BufferedReader br) {
    lineas1 = lineas1 - 1;
        List<List<String>> stringArray = new ArrayList<>(lineas1);
        for (int i = 0; i < lineas1; i++) {
            stringArray.add(new ArrayList<>());
        }
        R(stringArray, lineas1, bufferIn, in, bw1, br);
}

public void R( List<List<String>> stringArray, int lineas1, String bufferIn, DataInputStream in, BufferedWriter bw1, BufferedReader br)
{
        int NumeroLineas = 1;
        int nrol = 0;
        try {
            while ((bufferIn = in.readLine()) != null && br.readLine() != null) {
                int i = 0;
                String cad = bufferIn.trim();
                while (i < cad.length()) {
                    if (Character.isDigit(cad.charAt(0))) {
                        part2=first(cad);
                        nrol=Integer.valueOf(part2);

                        String last = cad.substring(cad.lastIndexOf(" ")+1);
                        System.out.println(nrol+last+"");
                        
                        if(cad.contains("AND"))
                        { 
                            part2=first(cad);
                            nrol=Integer.valueOf(part2);
                            logicos(nrol);
                        }
                        break;
                    } 
                }
                i++;
                NumeroLineas++;
            }} catch (IOException ex) { Logger.getLogger(Reg.class.getName()).log(Level.SEVERE, null, ex);}
    }

public static String first(String input) {return input.split(" ")[0]; }

public Reg(String[] st) {

//    System.out.println(st.toString()+"");
     String []reg= new String[st.length];
     System.arraycopy(st, 0, reg, 0, st.length);
     
    //Remover nulos
    List<String> list = new ArrayList<String>();

    for(String s : reg) {
       if(s != null && s.length() > 0) {
          list.add(s);
       }
    }

    reg = list.toArray(new String[list.size()]);

//    System.out.println(reg.length+"");
    for (int i = 0; i < reg.length; i++) {
        String tempregister="r"+String.valueOf(i);
        System.out.println(" store ->"+tempregister);
    }
    System.out.println(Arrays.toString(reg));
}    

public void Reg1(ArrayList st)
{
//    for (int i = 0; i < st.size(); i++) {
//           if(st.get(i).contains("DeclaracionGlobal")||st.get(i).contains("Declaracionlocal")||st.get(i).contains("Atribucion")
//                   ||st.get(i).contains("ifconComandosimple")||st.get(i).contains("Atribucion(comandosimple)")
//                   ||st.get(i).contains("Atribucion")||st.get(i).contains("EncabezadoFuncionPrincipal"))
//           {
////               System.out.println(st.get(i).get(0)+"");
//               
//               if(!st.get(0).get(0).contains("int")||!st.get(0).get(2).contains(";")
//                  ||!st.get(0).get(0).contains("void")||!st.get(0).get(2).contains("main")
//                       ||!st.get(0).get(0).contains("==")||!st.get(0).get(2).contains("+")
//                    ||!st.get(0).get(0).contains("=")||!st.get(0).get(2).contains("1")    )
//               {
////                       ||st.get(i).contains("float")||st.get(i).contains("char")||st.get(i).contains("string"))
//                  System.out.println(i+"jh");
//               }
//               else
//               {
//                    
//               }
//               else if(st.get(i).contains("Aritmetica"))
//               {
//                   f=i+2;
//                   System.out.println(i+" add "+r+i+", "+r+e+"->"+r+f);
//
//               }
//               else
//               {
//                   
//               }
           
        
}

public void operacionesA(String h,int lineas1)
{ 
    int e=1, f=2;

      if(h.contains("Aritmetica-"))
     {
         e=lineas1+1;
         f=lineas1+2;
        System.out.println(lineas1+" sub "+r+lineas1+", "+r+e+"->"+r+f);
     }
      if (h.contains("Aritmetica*")) {
          e=lineas1+1;
         f=lineas1+2;
        System.out.println(lineas1+" mult "+r+lineas1+", "+r+e+"->"+r+f);
    }
       if(h.contains("Aritmetica/"))
     {
         e=lineas1+1;
         f=lineas1+2;
        System.out.println(lineas1+" div "+r+lineas1+", "+r+e+"->"+r+f);
     }

}

public void guardar(String h, int lineas)
{
  
//    System.out.println("addI "+r1+", "+c2+"->"+r3);
//    System.out.println("subI "+r1+", "+c2+"->"+r3);
//    System.out.println("rsubI "+r1+", "+c2+"->"+r3);
//    System.out.println("multI "+r1+", "+c2+"->"+r3);
//    System.out.println("divI "+r1+", "+c2+"->"+r3);
//    System.out.println("rdivI "+r1+", "+c2+"->"+r3);
//    
//    System.out.println("lshift "+r1+", "+r2+"->"+r3);
//    System.out.println("lshiftI "+r1+", "+c2+"->"+r3);
//    System.out.println("rshift "+r1+", "+r2+"->"+r3);
//    System.out.println("rshiftI "+r1+", "+c2+"->"+r3);
    
//    System.out.println("load "+r1+", "+r2+"->"+r3);
//    System.out.println("loadrI "+r1+", "+c2+"->"+r3);
//    System.out.println("loadAI "+r1+", "+r2+"->"+r3);
//    System.out.println("loadA0 "+r1+", "+c2+"->"+r3);
        operacionesA(h, lineas);
//    System.out.println("storeAI "+r1+"->"+r2+", "+c3);
//    System.out.println("storeA0 "+r1+"->"+r2+", "+r3);

}

private void logicos(int nrol) {
    
        int e=1, f=2, g=3;
        e=nrol+1;
        f=nrol+2;
        g=nrol+3;
        
        System.out.println(nrol+" and "+r+e+", "+r+f+"->"+r+g);
        
//        System.out.println("andI "+r+", "+c2+"->"+r3);
//        System.out.println("or "+r+", "+r+"->"+r3);
//    System.out.println("orI "+r+", "+c2+"->"+r3);
//    System.out.println("xor "+r+", "+r+"->"+r3);
//    System.out.println("xorI "+r+", "+c2+"->"+r3);
    }

}

