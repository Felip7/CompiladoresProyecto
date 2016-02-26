package Semantics;
import GenCod.Gencod;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class escribirTipos {
    Gencod gc=new Gencod();
    String part2 = "", part3 = "", part4;
    String [] p;
    String [] vec;
    String [] veccod;
    String vector;
    String []reg;
    
    public escribirTipos( List<List<String>> sintactica, int lineas1, String bufferIn, DataInputStream in, BufferedWriter bw1, BufferedReader br) throws IOException {
        lineas1 = lineas1 - 1;
        int doblereg=lineas1+lineas1;
        p=new String[doblereg];
        
        List<List<String>> variables = new ArrayList<>(lineas1);
        for (int i = 0; i < lineas1; i++) { variables.add(new ArrayList<>());}
        semantics(sintactica, variables, bufferIn, in, bw1, br, lineas1);
    }
    
    public void semantics(List<List<String>> sintactica, List<List<String>> variables, String bufferIn, 
            DataInputStream in, BufferedWriter fw1, BufferedReader br, int lineas1) throws IOException {
    
    int NumeroLineas = 1,nrol = 0;
        try {
            while ((bufferIn = in.readLine()) != null && br.readLine() != null) {
                int i = 0;
                String cad = bufferIn.trim();
                while (i < cad.length()) {
                    if (Character.isDigit(cad.charAt(0))) {
                        StringTokenizer st = new StringTokenizer(cad);
                        if (cad.contains(" ")) {
//                            System.out.println(cad+"");
                            part2 = st.nextToken();
                            part3 = st.nextToken();
                            part4 = st.nextToken();

                            partir(variables, part2, part3, part4);
                            nrol = lineastxt(part2);
                        }
                        break;
                    } else {
                        System.err.println("Error en línea " + NumeroLineas + " se esperaba un número en el archivo CSV.");
                    }
                }
                i++;
                NumeroLineas++;
            }
//            System.out.println(variables.toString()+"");
            repeticion(sintactica, variables, nrol, fw1, lineas1);

        } catch (IOException ex) {Logger.getLogger(escribirTipos.class.getName()).log(Level.SEVERE, null, ex);}
    }

    public List<List<String>> partir(List<List<String>> stringArray, String part2, String part3, String part4) throws IOException {

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

    public int lineastxt(String part2) {int nrol = Integer.valueOf(part2);return nrol;}

    public void repeticion(List<List<String>> sint ,List<List<String>> var, int nrol, BufferedWriter fw1, int lineas1) throws IOException {
        int l = var.size() - 1;
        for (int k = 0; k < l; k++) {
        for (int j = 1; j < var.size(); j++) {
            if (var.get(k).size() > 1 && var.get(j).size() > 1 && k != j) { 
                    if (var.get(k).get(1).equals(var.get(j).get(1))) {
                        nrol = j + 1;
                        System.out.println(var.get(k).get(1)+" --y-- "+var.get(j).get(1));
                        System.out.println("Error semántico en línea " + j+" y en línea "+nrol); 
//                        break;
                    }
                    else if (var.get(k).get(1).equals(var.get(j).get(2))) {
                        System.out.println(var.get(k).get(1)+" --y-- "+var.get(j).get(2));
                        nrol = j + 1;
                        System.out.println("Error semántico en línea " + j+" y en línea "+nrol); 
                        break;
                    }
                    else if (var.get(k).get(1).equals("=") || var.get(j).get(1).equals(";")
                        ||var.get(j).get(2).equals("(")||var.get(j).get(2).equals(")")
                        ||var.get(k).get(1).equals("(") || var.get(j).get(1).equals(")")
                        ||var.get(j).get(2).equals("=")||var.get(j).get(2).equals(";")){}                
                } 
              } break; 
            }
        System.out.println("Comprobación Finalizada\n");
        verificar(var, fw1, lineas1);
        asignar(sint, var, fw1, lineas1);
    }
    
    public void verificar(List<List<String>> var, BufferedWriter fw1, int lineas1)
    {
        int l = var.size() - 1;
        for (int k = 0; k < l; k++) {
        for (int i = 1; i < var.size(); i++) 
        {
             if (var.get(k).size() > 1 && var.get(i).size() > 1 && k != i) { 
                 if(Character.isLetter(var.get(i).get(0).charAt(0)))
                 {
                     if(var.get(k).get(0).equals(":void:")||var.get(k).get(0).equals("output")
                             ||var.get(k).get(0).equals("int")||var.get(k).get(0).equals("if")
                             ||var.get(k).get(0).equals("then")||var.get(k).get(0).equals("float"))
                     {
                        
                         break;
                     }
                     else
                     {
                         
                         break;
                     }
                 }
                 
             }
        }
        }
    }
    
    
    public void asignar(List<List<String>> sint, List<List<String>> var, BufferedWriter fw1, int lineas1) throws IOException
    {
        int i =0;
        int e = 0;
        String[] arr = new String[lineas1];
        List<String> h = new ArrayList<>();
        for (i = 0; i < var.size(); i++) {
            
        Set<String> quipu = new HashSet<>(var.get(i));
        h.addAll(var.get(i));
        for (String key : quipu) {
//      System.out.println("valor "+key + " frecuencia: " + Collections.frequency(h, key));
            if(Collections.frequency(h, key)>1)
                {
                    if (key.equals("int")||key.equals("=")||Character.isDigit(key.charAt(0))
                        ||key.equals(")")||key.equals("(") ||key.equals(";")||key.equals("{")   
                        ||key.equals("+")||key.equals("float")){}     
                }
            else
            {
                if(Character.isDigit(key.charAt(0))||key.equals(")")||key.equals("(") 
                    ||key.equals(";")||key.equals("{")||key.equals("+")
                    ||key.equals("+")||key.equals("++")||key.equals("void")
                    ||key.equals(":void:")||key.equals("main")||key.equals("int")||key.equals("^")
                    ||key.equals("}")||key.equals("if")||key.equals("then")||key.equals("float")||key.equals("output")
                    ||key.equals("=")){}
                else if(key.equals("[0]:")||key.equals("[1]:")||key.equals("[2]:")||key.equals("[3]:")||key.equals("[4]:")||key.equals("[5]:")
                    ||key.equals("[6]:")||key.equals("[7]:")||key.equals("[8]:")||key.equals("[9]:"))
                   {
                       veccod=asignarVectores(var, i, key, fw1);
                    }
                else
                { 
                    p[i]=key;
                    //Remover nulos
                    reg= new String[p.length];
                    System.arraycopy(p, 0, reg, 0, p.length);
                    e=i+1;
                    List<String> list = new ArrayList<>();
                    
                    for(String s : reg) {
                        if(s != null && s.length() > 0) {
                            list.add(s);
                        }
                    }
                    reg = list.toArray(new String[list.size()]);
                    
                    arr[i]=String.valueOf(e);
                    fw1.write(e+" Variables "+Arrays.toString(reg));
                    fw1.newLine();
                    fw1.flush();
//                    System.out.println(e+" Variables "+Arrays.toString(reg)+Arrays.toString(arr)); 
                } 
            }
        }   
    }
        Induccion ind=new Induccion(sint,var, i, e, reg, arr, fw1);
        Gencod gj=new Gencod(p,veccod);
    }


public String[] asignarVectores(List<List<String>> g, int i, String key, BufferedWriter fw1) throws IOException
{
            while(g.get(i).size()>2){
                vector=g.get(i).get(2);
                break;
            }
            String[] replace ;
            String register = "";
            if(key.contains("[")&&key.contains("]"))
            {
                replace=key.split("");
                
                for (int j = 0; j < replace.length; j++) {
                    if (Character.isDigit(replace[j].charAt(0))) {
                        register=replace[j];
                    }
                }
                
            }
            
            int espacioMem=Integer.valueOf(register);
            int m=4;
            int cambiar = 0;
//                    System.out.println(espacioMem+"___"+register+"___"+vector);
            vec=new String[espacioMem*m];
            
            for (int j = 0; j < vec.length; j++) {
                
                if(j>3)
                {
                    cambiar++;
                    vec[j]=vector+String.valueOf(cambiar);
                    
                    if(cambiar>4)
                    {
                        cambiar=0;
                        cambiar++;
                        vec[j]=vector+String.valueOf(cambiar);
                    }
                    
                }
                else
                {
                    String x=String.valueOf(j+1);
                    vec[j]=vector+String.valueOf(x);
                }
               
            }
//                    System.out.println(Arrays.toString(vec)+"")
            int e=i+1;
             fw1.write(e+" Variable "+vector+" genera Vector "+Arrays.toString(vec));
             fw1.newLine();
             fw1.flush();
      return vec;
}


}
