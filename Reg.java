package GenCod;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Reg {
    String part2 = "", part3, part4 = "";
    String r="r",c2="c2",c3="c3";
    List<List<String>> estructura = new ArrayList<>();

public Reg(int lineas1, String bufferIn, DataInputStream in, BufferedWriter bw1, BufferedReader br) {
    lineas1 = lineas1 - 1;
        List<List<String>> stringArray = new ArrayList<>(lineas1);
        for (int i = 0; i < lineas1; i++) {stringArray.add(new ArrayList<>());}
        R(stringArray, lineas1, bufferIn, in, bw1, br);
}

public void R( List<List<String>> stringArray, int lineas1, String bufferIn, 
        DataInputStream in, BufferedWriter bw1, BufferedReader br)
{
        int NumeroLineas = 1,nrol = 0;
        try {
            while ((bufferIn = in.readLine()) != null && br.readLine() != null) {
                int i = 0;
                String cad = bufferIn.trim();
                while (i < cad.length()) {
                    if (Character.isDigit(cad.charAt(0))) {
                        part2=first(cad);
                        nrol=Integer.valueOf(part2);

                        String last = cad.substring(cad.lastIndexOf(" ")+1);
                       
                        estructura=partir(stringArray, part2, last);
                        
                        break;
                    } 
                }
                i++;
                NumeroLineas++;
            }
//             System.out.println(estructura.toString());
             Reg(estructura);
        } catch (IOException ex) { Logger.getLogger(Reg.class.getName()).log(Level.SEVERE, null, ex);}
    }

public static String first(String input) {return input.split(" ")[0]; }

public List<List<String>> partir(List<List<String>> stringArray, String nrol, String part4) throws IOException {

        if (Integer.valueOf(part2) == 1) { stringArray.get(0).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 2) { stringArray.get(1).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 3) { stringArray.get(2).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 4) { stringArray.get(3).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 5) { stringArray.get(4).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 6) { stringArray.get(5).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 7) { stringArray.get(6).add(part4);return stringArray; }
        if (Integer.valueOf(part2) == 8) { stringArray.get(7).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 9) { stringArray.get(8).add(part4); return stringArray;}
        if (Integer.valueOf(part2) == 10) {stringArray.get(9).add(part4);return stringArray; }
        if (Integer.valueOf(part2) == 11) {stringArray.get(10).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 12) {stringArray.get(11).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 13) {stringArray.get(12).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 14) {stringArray.get(13).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 15) {stringArray.get(14).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 16) {stringArray.get(15).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 17) {stringArray.get(16).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 18) {stringArray.get(17).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 19) {stringArray.get(18).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 20) {stringArray.get(19).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 21) {stringArray.get(20).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 22) {stringArray.get(21).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 23) {stringArray.get(22).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 24) {stringArray.get(23).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 25) {stringArray.get(24).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 26) {stringArray.get(25).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 27) {stringArray.get(26).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 28) {stringArray.get(27).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 29) {stringArray.get(28).add(part4);return stringArray;}
        if (Integer.valueOf(part2) == 30) {stringArray.get(29).add(part4);return stringArray;}
        return null;
    }

public Reg(String[] var, String[] vect) {
    
//    System.out.println(Arrays.toString(var)+"\n"+Arrays.toString(vect));
    String []reg= new String[var.length];
    System.arraycopy(var, 0, reg, 0, var.length);
     
    //Remover nulos
    List<String> list = new ArrayList<>();

    for(String s : reg) {
       if(s != null && s.length() > 0) {
          list.add(s);
       }
    }

    reg = list.toArray(new String[list.size()]);

    for (int i = 0; i < reg.length; i++) {
        String tempregister="r"+String.valueOf(i);
        int e=i+1;
        System.out.println("store "+tempregister+ "-> r"+e);
    }
//    System.out.println(Arrays.toString(reg)+"");
}    

public void Reg(List<List<String>> st)
{
    for (int i = 0; i < st.size(); i++) {
           if(st.get(i).contains("Atribucion")||st.get(i).contains("ifconComandosimple")
              
              ||st.get(i).contains("Atribucion(comandosimple)Operador")
              ||st.get(i).contains("AtribucionconOperador")
              ||st.get(i).contains("DeclaracionlocalconOperador"))
           {
               int e=i+1;
               System.out.println(e+" load r"+1+"->r"+4);
           }
           else if(st.get(i).contains("Atribucion(comandosimple)"))
           {
               int e=i+1;
               System.out.println(e+" load r"+5);
           }
           else if(st.get(i).contains("Aritmetica"))
           {
               operacionesA(st.get(i).get(0), i);
           }
           else if(st.get(i).contains("EncabezadoFuncionPrincipal")||st.get(i).contains("EncabezadoFuncion") )
           {
                int e=i+10;
                int w=i+1;
                System.out.println(w+" store r"+i+ "-> r"+e);
           }
           else if(st.get(i).contains("Atribucion(comandosimple)AND"))
           {
               AND(i);
           }
           else if(st.get(i).contains("Atribucion(comandosimple)OR"))
           {
               OR(i);
           }
           else if(st.get(i).contains("Atribucion(comandosimple)XOR"))
           {
               XOR(i);
           }
               
    }
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
       else
       {
           e=lineas1+1;
           f=lineas1+2;
           System.out.println(e+" add "+r+lineas1+", "+r+e+"->"+r+f);
       }

}

private void AND(int nrol) {
    
        int e=1, f=2, g=3;
        e=nrol+1;
        f=nrol+2;
        g=nrol+3;
        
        System.out.println(nrol+" and "+r+e+", "+r+f+"->"+r+g);
        
    }

private void OR(int nrol) {
    
        int e=1, f=2, g=3;
        e=nrol+1;
        f=nrol+2;
        g=nrol+3;
        
        System.out.println(nrol+" or "+r+e+", "+r+f+"->"+r+g);
    }

private void XOR(int nrol) {
    
        int e=1, f=2, g=3;
        e=nrol+1;
        f=nrol+2;
        g=nrol+3;
        
        System.out.println(nrol+" xor "+r+e+", "+r+f+"->"+r+g);
    }

}

