package com.newlecture.app.ex1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

   public static void main(String[] args) throws IOException {
	   
      FileOutputStream fout = new FileOutputStream("res/data.txt");
//    FileOutputStream fout = new FileOutputStream("C:\Data\Work\JavaWork\JavaPrj\resdata.txt");  => 절대 경로
      
      fout.write(30);
      fout.write(65);
      fout.write(100);
      fout.write('9');
      // write는 운영체제에 독립적인 함수
      
      fout.flush();
      
    
      fout.close();

      char st = 'A';
      System.out.println(st+1);
      System.out.println(st+2);
      System.out.println(st+3);
      System.out.println(st+4);
      
   }

}