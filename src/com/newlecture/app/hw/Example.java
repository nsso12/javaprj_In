package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		while (fscan.hasNext()) {
			String word1 = fscan.next();
			int kor1 = Integer.parseInt(word1);

			System.out.printf("%d,", kor1);

			
			// 문제1. 파일에서 성적을 5번째 까지만 읽어서 출력
			for (int i = 0; fscan.hasNext(); i++) {
				String word = fscan.next();
				int kor = Integer.parseInt(word);
				
				
				
				
				System.out.printf("%d, ", kor);
			}

		}

		fscan.close();
		fis.close();
	}

}
