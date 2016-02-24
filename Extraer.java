package Semantics;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Extraer {
    String primero="";
    String last="";
    public  BufferedWriter bw1=null;
    List<List<String>> stringArray;
    List<List<String>> stringArray2;
    
    public void ext(int lineas1) throws IOException {
        lineas1 = lineas1 - 1;
        stringArray = new ArrayList<>(lineas1);
        for (int i = 0; i < lineas1; i++) {
            stringArray.add(new ArrayList<>());
        }
//        System.out.println(stringArray.size()+"");
    }

public Extraer(String esimbolostxt, BufferedReader br, String bufferIn, DataInputStream in, int lineas1) throws IOException {
   ext(lineas1);
    int NumeroLineas = 1;
        int nrol = 0;
        try {
            while ((bufferIn = in.readLine()) != null && br.readLine() != null ) {
                int i = 0;
                String cad = bufferIn.trim();
                while (i < cad.length()) {
                        
                        primero=first(cad);
//                        System.out.println(primero+"");
                        last = cad.substring(cad.lastIndexOf(" ")+1);
//                        System.out.println(last+"");
                        
                        stringArray2=partir(stringArray, primero, last);
                       
                        break;
                    } i++;
        }NumeroLineas++;
        } catch (IOException ex) {
            Logger.getLogger(Extraer.class.getName()).log(Level.SEVERE, null, ex);
        }
//         System.out.println(stringArray2.toString()+"*");
        archivo("D:\\salida.csv", stringArray2, bw1, lineas1);
    }

    public static String first(String input) {    return input.split(" ")[0]; }
        
    public List<List<String>> partir(List<List<String>> stringArray, String primero, String ultimo) throws IOException {

        if (Integer.valueOf(primero) == 1) { stringArray.get(0).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 2) { stringArray.get(1).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 3) { stringArray.get(2).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 4) { stringArray.get(3).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 5) { stringArray.get(4).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 6) { stringArray.get(5).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 7) { stringArray.get(6).add(last);return stringArray; }
        if (Integer.valueOf(primero) == 8) { stringArray.get(7).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 9) { stringArray.get(8).add(last); return stringArray;}
        if (Integer.valueOf(primero) == 10) {stringArray.get(9).add(last);return stringArray; }
        if (Integer.valueOf(primero) == 11) {stringArray.get(10).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 12) {stringArray.get(11).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 13) {stringArray.get(12).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 14) {stringArray.get(13).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 15) {stringArray.get(14).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 16) {stringArray.get(15).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 17) {stringArray.get(16).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 18) {stringArray.get(17).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 19) {stringArray.get(18).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 20) {stringArray.get(19).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 21) {stringArray.get(20).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 22) {stringArray.get(21).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 23) {stringArray.get(22).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 24) {stringArray.get(23).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 25) {stringArray.get(24).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 26) {stringArray.get(25).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 27) {stringArray.get(26).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 28) {stringArray.get(27).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 29) {stringArray.get(28).add(last);return stringArray;}
        if (Integer.valueOf(primero) == 30) {stringArray.get(29).add(last);return stringArray;}
        return null;
    }
        
    public static void archivo(String rutaArchivo, List<List<String>> stringArray2, BufferedWriter bw1, int lineas1)
    {
        String bufferIn = "";
        try
        {
            DataInputStream in=new DataInputStream(new FileInputStream(rutaArchivo));

            FileReader fr1 = new FileReader("D:\\salida.csv");
            BufferedReader br = new BufferedReader(fr1);
            
            escribirTipos csv=new escribirTipos(stringArray2, lineas1, bufferIn, in, bw1, br);
        } catch (IOException ex) {
        Logger.getLogger(Semantico.class.getName()).log(Level.SEVERE, null, ex);
        } 
   }
}
