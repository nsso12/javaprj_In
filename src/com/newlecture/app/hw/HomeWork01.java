package com.newlecture.app.hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class HomeWork01 {

	public static void main(String[] args) throws IOException {


		//1번 문제
		System.out.write('A');
		System.out.flush();
		// print = flush+write
		// write = flush 따로 해줘야 함

		
		System.out.println();
		
		
		//3번 문제
		System.out.write(65);
		System.out.flush();
		// 아스키코드 값
		// print = flush+write
		// write = flush 따로 해줘야 함

		
		System.out.println();
		
		
		//4번 문제
		System.out.printf("%4d-%02d-%02d", 2023,6,8);
		

	
		
	}

}
