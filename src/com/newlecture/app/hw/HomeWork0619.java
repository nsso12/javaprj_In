package com.newlecture.app.hw;

public class HomeWork0619 {

	public static void main(String[] args) {

		// 1.
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();

		// 2.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();

		// 3. j-- 하는 방법
		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j > i; j--) { // 왜 j가 i보다 커야할까?
				System.out.print(" ");
			}

			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("------------------------");
		System.out.println();

		// 3-2. j++ 하는 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();

		// 4.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();

		// 5.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();

		// 6.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 8; k >= i * 2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();

		
		// 7. 구냥 해보고싶은 다이아...
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 8; k >= i * 2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
