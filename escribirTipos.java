package Semantics;
import GenCod.Gencod;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class escribirTipos {
    String part2 = "", part3 = "", part4;
    String [] p;
    
    public escribirTipos( List<List<String>> stringArray2, int lineas1, String bufferIn, DataInputStream in, BufferedWriter bw1, BufferedReader br) throws IOException {
        lineas1 = lineas1 - 1;
        
        int doblereg=lineas1+lineas1;
        p=new String[doblereg];
        
        List<List<String>> stringArray3 = new ArrayList<>(lineas1);
        for (int i = 0; i < lineas1; i++) { stringArray3.add(new ArrayList<>());}
        semantics(stringArray2,stringArray3, bufferIn, in, bw1, br);
    }
    
    public void semantics(List<List<String>> sa, List<List<String>> stringArray, String bufferIn, 
            DataInputStream in, BufferedWriter fw1, BufferedReader br) throws IOException {
    int NumeroLineas = 1;
    int nrol = 0;
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

                            partir(stringArray, part2, part3, part4);
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
            
            repeticion(sa, stringArray, nrol, fw1);

        } catch (IOException ex) {
            Logger.getLogger(escribirTipos.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public void repeticion(List<List<String>> f,List<List<String>> g, int nrol, BufferedWriter fw1) throws IOException {
        int l = g.size() - 1;

//        System.out.println(g.toString());
        for (int k = 0; k < l; k++) {
        for (int j = 1; j < g.size(); j++) {
            
                if (g.get(k).size() > 1 && g.get(j).size() > 1 && k != j) {
                    if (g.get(k).get(1).equals("=") || g.get(j).get(1).equals(";")
                        ||g.get(j).get(2).equals("(")||g.get(j).get(2).equals(")")
                        ||g.get(k).get(1).equals("(") || g.get(j).get(1).equals(")")
                        ||g.get(j).get(2).equals("=")||g.get(j).get(2).equals(";"))
                    {}
                    else if (g.get(k).get(1).equals(g.get(j).get(1))) {
                        nrol = j + 1;
                        System.out.println("Error semántico en línea " + nrol);
//                        System.out.println(g.get(k).get(1)+(g.get(j).get(1)));
                        break;
                    }
                    else if (g.get(k).get(1).equals(g.get(j).get(2))) {
                        System.out.println(g.get(k).get(1)+"     "+g.get(j).get(2)+"");
                        nrol = j + 1;
                        System.out.println("Error semántico en línea: " + nrol);
                      break;
                    }
                }
              }
            }
        System.out.println("Comprobación Finalizada\n");
        asignar(f, g, fw1);
    }
    
    public void asignar(List<List<String>> f, List<List<String>> g, BufferedWriter fw1) throws IOException
    {
        List<String> h = new ArrayList<>();
        for (int i = 0; i < g.size(); i++) {
            
        Set<String> quipu = new HashSet<>(g.get(i));
        h.addAll(g.get(i));
        for (String key : quipu) {
//      System.out.println("valor "+key + " frecuencia: " + Collections.frequency(h, key));
            if(Collections.frequency(h, key)>1)
                {
                    if (key.equals("int")||key.equals("=")||Character.isDigit(key.charAt(0))
                        ||key.equals(")")||key.equals("(") ||key.equals(";")||key.equals("{")   
                        ||key.equals("+")){}     
                }
            else
            {
                if(Character.isDigit(key.charAt(0))||key.equals(")")||key.equals("(") 
                    ||key.equals(";")||key.equals("{")||key.equals("+")
                    ||key.equals("+")||key.equals("++")||key.equals("void")
                    ||key.equals(":void:")||key.equals("main")||key.equals("int")||key.equals("^")
                    ||key.equals("}")||key.equals("if")||key.equals("then")
                    ||key.equals("=")||key.equals("[0]:")||key.equals("[1]:")){}
                else
                {   p[i]=key; 
//                    System.out.println(Arrays.toString(p)+""+p.length);
                }  
            }
        }   
    }
//        Induccion ind=new Induccion(g, fw1);
        Gencod gc=new Gencod(p);
    }
}