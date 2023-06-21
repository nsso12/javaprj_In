package com.newlecture.app.ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Program {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("res/datal.txt");
//		PrintStream fout = new PrintStream(fos, true, "UTF-8");
		PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));

//		fout2.write("문자열 전문 write");

		// File
		fout2.print("Hello");
		fout2.print(1982702342L);
		fout2.print("안녕하세요");

		// Console
		System.out.print("Hello");
		System.out.print("1982702342L");
		System.out.print("안녕하세요");

		fout2.close();
		fos.close();

		System.out.print("안뇽");
		// 여기서 out 은 PrintStream의 객체

	}

}