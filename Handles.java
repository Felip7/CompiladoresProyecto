
package Syntax;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
 
public class Handles {
   
 
        public static void main(String[] args) {
               
                try
                {
                       
                        //csv file containing data
                        String strFile = "D:\\gramatica.txt";
                       
                        //create BufferedReader to read csv file
                        BufferedReader br = new BufferedReader( new FileReader(strFile));
                        String strLine ;
                        StringTokenizer st ;
                        int lineNumber = 0, tokenNumber = 0;
                       
                        //read comma separated file line by line
                        while( (strLine = br.readLine()) != null)
                        {
                                lineNumber++;
                               
                                //break comma separated line using ","
                                st = new StringTokenizer(strLine, ",");
                               
                                while(st.hasMoreTokens())
                                {
                                         if (strLine.contains(" "))
                                         {  
                                             String [] palabras = strLine.split(" ");
                                             tokenNumber++;
                                             
                                             for(int z=0; z<=tokenNumber; z++)           
                                             {
                                                 String part1 = palabras[z];
                                                 String part2 = palabras[z+1];
//                                                 String part3 = palabras[z+2];
//                                                 String part4 = palabras[z+3];
//                                                 System.out.println(part1+"__"+part2+"__"+part3+"__"+part4);
                                                 Sintactico sx = new Sintactico(part1, part2);
                                                 break; 
                                             }
                                         }
                                             else
                                             {
//                                             System.out.println("Line # " + lineNumber +
//                                                     ", Token # " + tokenNumber
//                                                     + ", Token : "+ st.nextToken());
//                                             break;
                                              }
                                         break;
                                        }
                        } tokenNumber = 0;
                }
                catch(Exception e)
                {
                        System.out.println("Exception while reading csv file: " + e);                  
                }
        }
}

