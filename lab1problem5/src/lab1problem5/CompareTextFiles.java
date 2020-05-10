package lab1problem5;

import java.io.*;
 
public class CompareTextFiles {
 
    public static void main(String args[]) throws Exception {
 
      FileInputStream fstream1 = new FileInputStream("C:\\text1.txt");
      FileInputStream fstream2 = new FileInputStream("C:\\text2.txt");
       
      DataInputStream in1= new DataInputStream(fstream1);
      DataInputStream in2= new DataInputStream(fstream2);
       
      BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
      BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
       
      String strLine1, strLine2;
       
       
      while((strLine1 = br1.readLine()) != null && (strLine2 = br2.readLine()) != null){
          if(strLine1.equals(strLine2)){
              System.out.println(strLine1);
               
          }
           
      }
       
    }
}