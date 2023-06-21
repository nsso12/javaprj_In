package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) throws IOException {

		// 0616 "2번째 100 이후부터 출력하기" _ 강사님, 나----------------------------
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

//		for (int count = 0; fscan.hasNext();) {
//			int score = fscan.nextInt();
//
//			if (score == 100)
//				count++;
//
//			if (count < 2 || score == 100)
//				continue;
//			System.out.printf("%d ", score);
//		}

		// 승현오빠 코드---------------------
//		int count=0;
//
// 		for (boolean found = false; fscan.hasNext();) {
//
// 			String word = fscan.next();
// 			int kor = Integer.valueOf(word);
//
// 			if (kor == 100)
// 				count++;
//
// 			if (found)
// 				System.out.printf("%d, ", kor);// 콘솔에 출력하기.
//
// 			if(count==2) {
// 				found = true;

		// 파일에서 성적을 5번부터 8번째까지만 읽어서 다음처럼 화면에 출력하시오 ----------
		// 50, 80, 90, 100

//		for (int i = 0; fscan.hasNext(); i++) {
//			int score = fscan.nextInt();
//
//			if (i < 4)
//				continue;
//
//			if (i == 8)
//				break;
//			System.out.printf("%d ", score);
//
//		}

		// 1,2,3,4,5,6,7,8,9 반복하기---------------------------
//		for(int j=0; j<10; j++) {
//			for(int i=0; i<10; i++) {
//				System.out.printf("%d ", i+1);
//			}
//			System.out.println();
//		}

		// 1 -----------------------------------------------
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 5 6 
//		1 2 3 4 5 6 7 
//		1 2 3 4 5 6 7 8 
//		1 2 3 4 5 6 7 8 9 
//		1 2 3 4 5 6 7 8 9 10 

//		for (int j = 0; j <= 10; j++) {
//			for (int i = 0; i < j; i++) {
//				System.out.printf("%d ", i + 1);
//			}
//			System.out.println();
//		}

		// 1 2 3 ------------------------------------
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4 5 6

//		for (int j = 0; j < 4; j++) {
//			for (int i = 0; i < j + 3; i++) {
//				System.out.printf("%d ", i + 1);
//			}
//			System.out.println();
//		}

//		1 2 3 4 5 6 7 8 9 10 ------------------------
//		1 2 3 4 5 6 7 8 9 
//		1 2 3 4 5 6 7 8 
//		1 2 3 4 5 6 7 
//		1 2 3 4 5 6 
//		1 2 3 4 5 

//		for (int j = 0; j < 6; j++) {
//			for (int i = 0; i < 10 - j; i++) {
//				System.out.printf("%d ", i + 1);
//			}
//			System.out.println();
//		}

		// if - else문 -----------------------------------

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {

				if (i == 2)
					System.out.print("a ");

				else if (i == 5)
					System.out.print("b ");

				else if (i == 9)
					System.out.print("c ");

				else
					System.out.printf("%d ", i + 1);
			}
			System.out.println();
		}
		


//		fscan.close();
//		fis.close();
	}
}
