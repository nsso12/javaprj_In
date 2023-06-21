package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) throws IOException {

		// 파일에서 성적을 5번부터 읽어서 다음처럼 화면에 출력하세요.
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		// 파일에서 성적을 읽다가 100점을 만나면 그 이후의 성적을 모두 출력하시오

	
		// 3-2. 완
//		boolean type = false;
//		for (int i = 0; fscan.hasNext(); i++) {
//			int kor = fscan.nextInt();   
//
//			if (kor == 100) {
//				type = true;
//			}
//
//			if (type == true) {
//				System.out.println(kor);
//			}
//
//		}	
		

//		// 3-3.
//		for (boolean found = false; fscan.hasNext();) {
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//
//			if (kor == 100) {
//				found = true;
//			}
//
//			if (!found)
//				continue;
//
//			System.out.printf("%d, ", kor);
//		}

//		// 대진오빠가 보내준거 완
//		// 문제3)파일에서 성적을 읽다가 100점을 만나면 100을 포함한 그 이후의 성적을 모두 출력하시오. 
//		// 30 49 38 49 50 80 90 100 70 50 60 74 50 33 50 65 76 69
//
		for (boolean found = false; fscan.hasNext();) {

			String word = fscan.next();
			int kor = Integer.parseInt(word);

			if (kor == 100)
				found = true;

			if (!found)
				continue;

			System.out.printf("%d ", kor);

		}

		
		//100 미포함 완
//		for (boolean found = false; fscan.hasNext();) {
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//
//			if (kor == 100)
//				found = true;
//
//			if (!found || kor == 100)
//				continue;
//
//			System.out.printf("%d, ", kor);
//		}
//
//		fscan.close();
//		fis.close();

	}

}