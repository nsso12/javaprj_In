package com.newlecture.app.ex4.test.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos);
		
		// 한번 선언하는 방법
//		String line = null;
//		String name = null;
//		
//		line = fscan.nextLine();
//		name = fscan.nextLine();
		

		// 지역화 하는 방법
		{
			String line = fscan.nextLine();
			String name = line.substring(1, 3);
			fout.println(name);
		}
		
		{
			String line = fscan.nextLine();
			String name = line.substring(1, 7);
			fout.println(name);
		}
		
		{
			String line = fscan.nextLine();
			String name = line.substring(1, 3);
			fout.println(name);
		}
		
		{
			String line = fscan.nextLine();
			String name = line.substring(1, 2);
			fout.println(name);
		}
		
		{
			String line = fscan.nextLine();
			String name = line.substring(1, 3);
			fout.println(name);
		}
		
		
		
		fscan.close();
		fis.close();

		fout.close();
		fos.close();

	}

}
