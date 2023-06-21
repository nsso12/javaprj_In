package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		FileOutputStream fos = new FileOutputStream("res/pic1-copy.bmp");

		int n = -1;

//		while(n=fis.read()) != -1 {  }
		while ((n = fis.read()) != -1)
			fos.write(n);

		fis.close();
		fos.close();

		System.out.println("작업 완료");

	}

}





// if, while 둘 다 한줄만 있으면 중괄호 생략해도 됨


// break 걸어야 함
//while (n != -1) {
//fos.write(n);
//n = fis.read();