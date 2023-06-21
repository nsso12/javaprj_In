package com.newlecture.app.hw;

public class HomeWork0616 {

	public static void main(String[] args) {

		// while문을 이용하여, number가 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 코드를 작성해보세요.
		// number의 값이 100이 되면 while문을 빠져나와주세요.

//		int number = 1;
//
//		while (number <= 100) {
//			
//			if (number % 2 == 0)
//				System.out.print("+");
//			
//			else if (number % 2 == 1)
//				System.out.print("-");
//			
//			number++;
//
//			if (number == 100)
//			break;
//
//		}

		// 2번
		//while문을 이용하여, number가 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 코드를 작성해보세요. 
		//이때, x축의 문자가 10개가 되면, 줄바꿈을 해보세요
//		int number = 1;
//
//		while (number <= 100) {
//
//			if (number % 10 == 0 ) {
//				System.out.print("+");
//				System.out.println();
//				
//			}
//			
//			else if (number % 2 == 0)
//				System.out.print("+");
//
//			else if (number % 2 == 1)
//				System.out.print("-");
//			number++;
//
//		}
//	}

//for문을 이용하여  다음처럼 구구단 표를 출력해보세요.

//		for (int i = 0; i <8; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + 2 + " * " + j + " = " + (i + 2) * j);
//			}
//			System.out.println();
//		}

		
		//for문을 이용하여  구구단 표를 출력해보세요.
		for (int i = 0; i < 8; i++) {
			for (int j = 1; j <= 9; j++) {
				
				if (((i+2)*j) % 2 == 1) {
					System.out.printf("%d * %d = %d\n" , i+2, j, (i+2)*j);
			
				}

			}
//			System.out.println();
		}

	}
}
