package com.newlecture.app.hw;

public class Td {

	public static void main(String[] args) {

		// 코니쌤 66 소인수분해
		int num = 66;
		for (int i = 2; i <= num; i++) {
			// 계속 나눠보자
			if (num % i == 0) {
				num = num / i; // 몫을 구하기

				System.out.printf("num: %d, i: %d\n", num, i);
				i = i - 1; // 나눠진 값으로 계속 나눈다
			}
		}

		
		
		// 코니쌤 팩토리얼

//				int num = 1; // 한 반복당 필요한 변수
//				int total = 0; // 반복을 더한 총합
//				String str = "";
//
//				// 반복을 정해진 숫자만큼 하기 때문에 for
//				for (int i = 0; i < 5; i++) {
//					num *= i+1;
//					total = total + num;
//
//					str = str + "* " + (i + 1);
//				}
//				System.out.printf("sum: %d", (total));
//			}

		// 코니쌤 심화문제 (피보나치 수열)
//		int x = 1;
//		int y = 0;
//		int z = 0;
//		
//		
//		for(int i=0; i<10; i++) {
//			z = x + y;
//			
//		}
//		

	}
}
