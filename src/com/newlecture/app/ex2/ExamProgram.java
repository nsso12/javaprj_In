package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) throws IOException {

		// 변수 선언
		int kor1, kor2, kor3;
		int total;
		float avg;

		// 변수 초기화
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		// 해당 파일에서 입력해둔 값 불러오기
		FileInputStream fis = new FileInputStream("res/exam.txt");
		Scanner fscan = new Scanner(fis);

//		kor1 = fis.read();
//		kor2 = fis.read();
//		kor3 = fis.read();

		String kor1_ = fscan.next(); // "30"
		kor1 = Integer.parseInt(kor1_); // "30" -> 30 (문자형을 int형으로 바꿈)
//		System.out.println(kor1);
		
		String kor2_ = fscan.next(); 
		kor2 = Integer.parseInt(kor2_);
//		System.out.println(kor2);
		
		String kor3_ = fscan.next(); 
		kor3 = Integer.parseInt(kor3_); 
//		System.out.println(kor3);


		fscan.close();
		fis.close();

		
		// 성적 출력
		total = kor1 + kor2 + kor3;
		avg = total / 3;

		FileOutputStream fos = new FileOutputStream("res/exam-out.txt");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		fout.printf("total is %d\n", total);
		fout.printf("avg is %f\n", avg);

		fout.close();
		fos.close();

		System.out.println("작업완료");

	}

}
