package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {

		// j가 줄
		// i가 칸
		
		//빈 오목판 
		for (int j = 0; j < 12; j++) {
			for (int i = 0; i < 12; i++)

				if (i == 0 && j == 0)
					System.out.print("┌");
				else if (i == 0 && j == 11)
					System.out.print("└");
				else if (i == 11 && j == 0)
					System.out.print("┐");
				else if (i == 11 && j == 11)
					System.out.print("┘");

				else if (j == 11)
					System.out.print("┴");
				else if (i == 0)
					System.out.print("├");
				else if (i == 11)
					System.out.print("┤");
				else if (j == 0)
					System.out.print("┬");

				else
					System.out.print("┼");

			System.out.println();
		}

		// 사용자 입력 오목판
		while (true) {
			Scanner scan = new Scanner(System.in);
			int ox = -1;
			int oy = -1;

			do {
				System.out.println("그만두기 -1 0");
				System.out.print("(x sp y): ");

				ox = scan.nextInt();
				oy = scan.nextInt();

				if (ox == -1) {
					System.out.println("종료");
					return;
				}

				if ((!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10)))
					System.out.println("오목 좌표의 범위 ( 1~10 )를 벗어났습니다");

				// 위에 강사님 while 조건 아래 내 while 조건
//			while(!((1<=ox && ox<=10) && (1<=oy&&oy<=10))) { 
			} while (!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10));

			for (int j = 0; j < 12; j++) {
				for (int i = 0; i < 12; i++)

					if (i == 0 && j == 0)
						System.out.print("┌");
					else if (i == 0 && j == 11)
						System.out.print("└");
					else if (i == 11 && j == 0)
						System.out.print("┐");
					else if (i == 11 && j == 11)
						System.out.print("┘");

					else if (i == ox && j == oy)
						System.out.print("○");

					else if (j == 11)
						System.out.print("┴");
					else if (i == 0)
						System.out.print("├");
					else if (i == 11)
						System.out.print("┤");
					else if (j == 0)
						System.out.print("┬");

					else
						System.out.print("┼");

				System.out.println();

			}

		}

	}
}