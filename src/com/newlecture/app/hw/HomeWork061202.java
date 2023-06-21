package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork061202 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/students2.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students2-out.data");
		PrintWriter fout = new PrintWriter(fos);

		// students2 파일에서 스트림으로 이름 값 받아오기
		String name1 = fscan.nextLine();
		String name2 = fscan.nextLine();
		String name3 = fscan.nextLine();
		String name4 = fscan.nextLine();
		String name5 = fscan.nextLine();

		// 삼항 연산자를 사용해 하나씩 조건대로 출력하기
		name1 = (2 <= name1.length() && name1.length() <= 3) ? name1 : "오류";
		fout.println(name1);
		System.out.println(name1);

		name2 = (2 <= name2.length() && name2.length() <= 3) ? name2 : "오류";
		fout.println(name2);
		System.out.println(name2);

		name3 = (2 <= name3.length() && name3.length() <= 3) ? name3 : "오류";
		fout.println(name3);
		System.out.println(name3);

		name4 = (2 <= name4.length() && name4.length() <= 3) ? name4 : "오류";
		fout.println(name4);
		System.out.println(name4);

		name5 = (2 <= name5.length() && name5.length() <= 3) ? name5 : "오류";
		fout.print(name5);
		System.out.println(name5);

		// for문
//		for (int i = 0; i < 5; i++) {
//			String name = fscan.next();
//			if (2 <= name.length() && name.length() <= 3) {
//				System.out.println(name);
//			} else {
//				System.out.println("오류");
//			}
//		}

		fout.close();
		fos.close();

		fscan.close();
		fis.close();

		System.out.println("작업완료");

	}

}
