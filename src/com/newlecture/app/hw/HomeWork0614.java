package com.newlecture.app.hw;

import java.util.Scanner;

public class HomeWork0614 {

	public static void main(String[] args) {

		// 66을 소인수분해 (2*3*11)
		// 66 2 3 11
//		 i는 횟수이면서 출력해야하는 변수
//		 n i로 나누기 / 나머지가 남으면 안돼

//		int num = 88;
//		for (int i = 0; i < num; i++) {
//			if (num % (i + 1) == 0 && i + 1 != 1) {
//				num = num / (i + 1);
//				System.out.println(i + 1);
//				i=0;
//			}
//		}

		// 사용자로부터 정수를 입력받아 총합이 100이 넘을때가지 반복하는 코드를 작성

//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		boolean tp = true;
//
//		while (tp) {
//			num = sc.nextInt();
//			sum += num;
//
//			if (100 < sum) {
//				break;
//			}
//			System.out.println("합 : " + sum);
//
//		}

		// 입력받는 값이 짝수일 때만 합하여 100이 넘을 때 까지 반복하는 코드를 작성하세요.
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		boolean tp = true;
//
//		while (tp) {
//			num = sc.nextInt();
//			if (num % 2 == 0)
//				sum += num;
//
//			if (100 < sum) {
//				break;
//			}
//			System.out.println("합 : " + sum);
//
//		}

		// 주어진 3개의 변수를 이용하여 다음과 같은 결과를 출력하세요 (출력 10개)
		// 규칙 : 위아래 더한수가 아래에 옴
		// i는 횟수이자 ?

//		int sum = 0;
//		for (int i = 0, n = 1; i < 5; i++, n *= i + 1) 
//			sum += n;
//			System.out.println(sum);

//		int x = 1;
//		int y = 0;
//		int z = 0;
//
//		int fact = 1;
//		int sum = 0;
//
//		for (int i = 0; i < 5; i++) {
//			fact = fact * (i + 1);
//			sum += fact;
//
//		}
//		System.out.println(sum);

		// 별찍기
//		for(int i=0; i<=5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 별찍기2

		// *
		// **
		// ***
		// ****
		// *****

		// 바깥 for문 가로줄 (횟수)
		// 안쪽 for문 세로줄

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
