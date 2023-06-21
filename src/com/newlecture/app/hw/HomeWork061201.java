package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork061201 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		Scanner fscan = new Scanner(fis);

		// Image Width, Height 전 18바이트 제외 (Signature 2byte + 각 4byte씩)
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();

		// 파일 사이즈 1byte씩 읽어오기
		//width = 19~22
		int w1 = fis.read();
		int w2 = fis.read();
		int w3 = fis.read();
		int w4 = fis.read();

		//height = 23~26
		int h1 = fis.read();
		int h2 = fis.read();
		int h3 = fis.read();
		int h4 = fis.read();

		// 컴퓨터에 입력된 뒤집어진 값 확인하기
		System.out.printf("%d,%d,%d,%d", w1, w2, w3, w4);
		System.out.println();
		System.out.printf("%d,%d,%d,%d", h1, h2, h3, h4);
		System.out.println();

		// 원래대로 파일명 출력하기
		int width = w1 << 0 | w2 << 8 | w3 << 16 | w4 << 24;
		System.out.println(width);

		int height = h1 << 0 | h2 << 8 | h3 << 16 | h4 << 24;
		System.out.println(height);

		// 파일명 출력
		System.out.println(width + " * " + height);
		
		fscan.close();
		fis.close();
		
	}

}
