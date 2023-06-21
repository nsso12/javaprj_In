package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {

		while (true) {
			System.out.println("┌──────────┐");
			System.out.println("│       Omok Game       │");
			System.out.println("└──────────┘");
			System.out.println();
			System.out.println("1. 게임시작");
			System.out.println("2. 도움말");
			System.out.println("3. 종료");
			System.out.println("> ");

			Scanner scan = new Scanner(System.in);
			int menu = scan.nextInt();

			switch (menu) {
			// 게임 시작 (빈 오목판)
			case 1: {
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
				// 라벨 (break)
				GAMEOVER: while (true) {

					// 바둑판
					int ox = -1;
					int oy = -1;

					do {
						System.out.println("그만두기 -1 0");
						System.out.print("(x sp y): ");

						ox = scan.nextInt();
						oy = scan.nextInt();

						if (ox == -1) {
							System.out.println("GAME OVER");
							break GAMEOVER;
//							return;
						}

						if ((!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10)))
							System.out.println("오목 좌표의 범위 ( 1~10 )를 벗어났습니다");

						// 위에 강사님 while 조건 아래 내 while 조건
//					while(!((1<=ox && ox<=10) && (1<=oy&&oy<=10))) { 
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
								System.out.print("●");

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
				break;

			// 2. 도움말
			case 2: {
				System.out.println("도움말");
			}
				break;

			// 3. 종료
			case 3: {
				System.out.println("안녕!");
				return;
			}

			// 4. 그 외
			default:
				System.out.println("메뉴는 1부터 3까지 존재합니다");

			}

		}
	}

}