package Semantics;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Extraer {
    String primero="";
    String last="";
    List<List<String>> estructuraSintactica;
    List<List<String>> estructuraSintactica2;
    
    public void ext(int lineas1) throws IOException {
        lineas1 = lineas1 - 1;
        estructuraSintactica = new ArrayList<>(lineas1);
        for (int i = 0; i < lineas1; i++) {
            estructuraSintactica.add(new ArrayList<>());
        }
    }

public Extraer(String esimbolostxt, BufferedWriter bw1, BufferedReader br, 
        String bufferIn, DataInputStream in, int lineas1) throws IOException {
   
    ext(lineas1);
    int NumeroLineas = 1, nrol = 0;
        try {
            while ((bufferIn = in.readLine()) != null && br.readLine() != null ) {
                int i = 0;
                String cad = bufferIn.trim();
                while (i < cad.length()) {
                        
                        primero=first(cad);
//                        System.out.println(primero+"");
                        last = cad.substring(cad.lastIndexOf(" ")+1);
//                        System.out.println(last+"");
                        
                        estructuraSintactica2=partir(estructuraSintactica, primero, last);
                        break;
                    } i++;
        }NumeroLineas++;
        } catch (IOException ex) { Logger.getLogger(Extraer.class.getName()).log(Level.SEVERE, null, ex);}
//         System.out.println(estructuraSintactica2.toString()+"*");
        archivo("D:\\salida.csv", estructuraSintactica2, bw1, lineas1);
    }

    public static String first(String input) {    return input.split(" ")[0]; }
        
    public List<List<String>> partir(List<List<String>> estructuraSintactica, String primero, String ultimo) throws IOException {

        if (Integer.valueOf(primero) == 1) { estructuraSintactica.get(0).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 2) { estructuraSintactica.get(1).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 3) { estructuraSintactica.get(2).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 4) { estructuraSintactica.get(3).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 5) { estructuraSintactica.get(4).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 6) { estructuraSintactica.get(5).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 7) { estructuraSintactica.get(6).add(last);return estructuraSintactica; }
        if (Integer.valueOf(primero) == 8) { estructuraSintactica.get(7).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 9) { estructuraSintactica.get(8).add(last); return estructuraSintactica;}
        if (Integer.valueOf(primero) == 10) {estructuraSintactica.get(9).add(last);return estructuraSintactica; }
        if (Integer.valueOf(primero) == 11) {estructuraSintactica.get(10).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 12) {estructuraSintactica.get(11).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 13) {estructuraSintactica.get(12).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 14) {estructuraSintactica.get(13).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 15) {estructuraSintactica.get(14).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 16) {estructuraSintactica.get(15).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 17) {estructuraSintactica.get(16).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 18) {estructuraSintactica.get(17).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 19) {estructuraSintactica.get(18).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 20) {estructuraSintactica.get(19).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 21) {estructuraSintactica.get(20).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 22) {estructuraSintactica.get(21).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 23) {estructuraSintactica.get(22).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 24) {estructuraSintactica.get(23).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 25) {estructuraSintactica.get(24).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 26) {estructuraSintactica.get(25).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 27) {estructuraSintactica.get(26).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 28) {estructuraSintactica.get(27).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 29) {estructuraSintactica.get(28).add(last);return estructuraSintactica;}
        if (Integer.valueOf(primero) == 30) {estructuraSintactica.get(29).add(last);return estructuraSintactica;}
        return null;
    }
        
    public static void archivo(String rutaArchivo, List<List<String>> estructuraSintactica2, BufferedWriter bw1, int lineas1)
    {
        String bufferIn = "";
        try
        {
            DataInputStream in=new DataInputStream(new FileInputStream(rutaArchivo));

            FileReader fr1 = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr1);
            
            escribirTipos csv=new escribirTipos(estructuraSintactica2, lineas1, bufferIn, in, bw1, br);
            
        } catch (IOException ex) {Logger.getLogger(Semantico.class.getName()).log(Level.SEVERE, null, ex);} 
   }
}
