package com.newlecture.app.hw;

import java.util.Scanner;

public class HomeWork0621 {

	public static void main(String[] args) {

		// 각 기본형 타입별 배열을 모두 선언해보세요.
		// int, byte, boolean 등

		int[] arr = new int[3];
		byte[] arr2 = new byte[3];
		boolean[] arr3 = new boolean[3];

		// int형 배열 numbers를 선언하세요
		// int형 배열 numbers는 기본타입인가요?
		// o
		// int형 배열 numbers에 크기 10인 배열을 만든 후, 할당하세요

//		int[] numbers = new int[10];

		// int형 배열 numbers의 2번째에 숫자 3을 할당하세요
//		numbers[1] = 3;

		// long형 배열 longNumbers에 크기 3인 배열을 만든 후, 할당하세요
		long[] longNumbers = new long[3];
		System.out.println(longNumbers[1]);

		// boolean형 배열 isChecked를 선언하세요.
		// isChecked에 true, false, true를 new연산자없이 할당하세요.
		boolean[] isChecked = { true, false, true };

		// 크기가 20인 int형 배열 numbers를 선언하세요. numbers의 index 0부터 19까지,
		// for문을 이용해서 0, 1, 2… 19를 할당해주세요
		int[] numbers = new int[20];
		for (int i = 0; i < 20; i++) {
			numbers[i] += i;
		}

		// 크기가 10인 문자형 배열 chars를 선언하세요.
		// 반복문을 이용하여 chars의 index가 3의 배수일 땐 ‘a’를, 5의 배수일때 ‘b’를 할당하여 출력해보세요.
		char[] chars = new char[10];

		for (int i = 0; i < 10; i++) {

			if (i % 3 == 0)
				chars[i] = 'a';

			else if (i % 5 == 0)
				chars[i] = 'b';

			System.out.print(chars[i]);
		}

		// 선언부와 출력부를 수정하지 말고 코드를 작성해
		// 3
		// 5
		// 7
		// 과 같이 출력해보세요.
		int a = 5;
		int b = 7;
		int c = 3;

		int temp;

		temp = a;
		a = c;
		c = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// 1을 입력하면 계속 메뉴를 선택하고 9를 누르면
		// 종료가 되는 프로그램을 만들어보세요.

		GAMEOVER: while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 선택하시오");
			System.out.println("1. 계속 	9. 종료");
			System.out.println("> ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("계속");
				break;

			case 9:
				System.out.println("종료되었습니다");
				break GAMEOVER;
			}

		}

		// 54321초가 몇시간 몇분 몇초인지 구하시오
		// 결과 : 15시간 5분 21초
		// ( 1분 = 60초, 1시간 = 60분, 1시간 = 60초 * 60초 = 3600초 )

		int num = 54321;

		int hour=0;
		int min;
		int sec;

		hour = num / 3600;

		a = num % 3600;
		min = a / 60;

		sec = num % 60;
		
		System.out.printf("%d시간 " ,hour );
		System.out.printf("%d분 " ,min );
		System.out.printf("%d초 " ,sec );

	}

}
