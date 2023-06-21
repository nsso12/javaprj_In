package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		while (fscan.hasNextLine()) // hasNextLine => 다음줄에 입력이 있으면 참. 없으면 거짓
		{
			String line = fscan.nextLine();
//			String name = line.substring(1, 3);
			fout.print(line);

			// 마지막에 빈 한줄을 지우기 위해 사용
			if (fscan.hasNextLine())
				fout.println();
		}

		fscan.close();
		fis.close();
		fout.close();
		fos.close();

		System.out.println("작업완료");

	}

}
