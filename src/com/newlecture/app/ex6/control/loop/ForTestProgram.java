package com.newlecture.app.ex6.control.loop;

public class ForTestProgram {

	public static void main(String[] args) {

//		// 1. for문 이용해서 1 10개 출력하기
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%d ", 1);
//
//		System.out.println();
//
//		// ---------------------------------------------
//		// 2. for문을 이용해서 1부터 10까지 출력하는 코드 작성
//		// index란 0부터 시작하는 일련번호
//
//		// 2. 인덱스 건드리지 말기
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%d ", i + 1);
//		}
//
//		System.out.println();
//		// -----------------------------------------------
//		// 3. for문을 이용해서 다음처럼 10부터 1까지 출력하는 코드 작성
//
//		// 3-1.
//		for (int i = 10; i > 0; i--) {
//			System.out.printf("%d ", i);
//		}
//
//		System.out.println();
//
//		// 3-2. 인덱스 건드리지 말기
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%d ", 10 - i);
//		}
//
//		System.out.println();
//
//		// ------------------------------------------------
//		// 4. for문을 이용해서 다음처럼 3부터 7까지 5개의 숫자를 출력하는 코드 작성
//
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d ", i + 3);
//		}
//
//		System.out.println();

		// -------------------------------------------------
		// 5. for문을 이용해서 다음처럼 1부터 9까지 5개의 숫자를 출력하는 코드 작성

		// 5-1 . + 조건문
//		for (int i = 0; i <= 9; i++) {
//			if (i % 2 == 1) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println();

		// 5-2. 대입연산자 (원석)
//			int x = 1;
//			for(int i=0; i<5; i++) {
//				System.out.printf("%d ", x);
//				x+=2;
//			}
//			System.out.println();

		// 5-3. for문만 사용 (재호오빠)
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d ", 2 * i + 1);
//		}

		// 5-4. 강사님 코드
//		for (int i = 0, n = 1; i < 5; i++, n += 2) {
//			System.out.printf("%d ", n);
//		}

		// 5-5. (한얼)
//		for (int i = 0; i < 10; i++) {
//			i = i + 1;
//			System.out.println(i);
//		}

		// ----------------------------------------------------
		// 6. for문을 이용해서 다음처럼 10개의 숫자를 출력하는 코드를 작성
		// 우리조 코드
		for (int i = 0, n = 6; i < 10; i++, n += 4) {
			System.out.printf("%d ", n);
		}

		System.out.println();

//		// 1조 코드
//		for (int i = 0, n = 1; i < 10; i++, n += 4) {
//			System.out.printf("%d ", n + 5);
//		}
//
//		System.out.println();
//
//		// for(int i =0, n=1, an=6; i < 10; i++, n++, an=6+(n-1)*4)
//		for (int i = 0, n = 1, an = 6; i < 10; i++, n++, an = 4 * n + 2) {
//			System.out.println(an);
//		} // => 한얼
//
//		// 6-1. 등차수열의 원칙... 으로 ... an = al + (n-1)d;
//		for (int i = 0, n = 1, an = 6; i < 10; i++, n++, an = 6 + (n - 1) * 4) {
//			System.out.printf("%d ", an);
//		}

	}
}
