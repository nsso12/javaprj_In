package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {

		// 오목판 바탕 만들기 for문 사용 ------------------------------

//		1-1
//		for (int i = 0; i < 10; i++) {
//			System.out.print("┬");
//		}
//		System.out.println();
//
//		for (int j = 0; j < 12; j++) {
//			for (int i = 0; i < 10; i++)
//				System.out.printf("%s", "┼");
//
//			System.out.println();
//		}
//
//		for (int i = 0; i < 10; i++) {
//			System.out.print("┴");
//		}
//		System.out.println();

		// 1-2 else if 사용 + 테두리 -------------- + 대각선 돌찍기

		// j가 줄
		// i가 칸

		while (true) {
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

			int ox = -1;
			int oy = -1;

			System.out.println("그만두기 -1");
			System.out.print("(x sp y): ");

			Scanner scan = new Scanner(System.in);
			ox = scan.nextInt();
			oy = scan.nextInt();

			for (int j = 0; j < 12; j++) {

				for (int i = 0; i < 12; i++)

					if (ox == -1)
						break;

					else if (i == 0 && j == 0)
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
		

		
		// 얼코
//				int x;
//				int y;
//				int count = 0;
//				System.out.println("그만두기 : -1");
//				System.out.println("x sp y");
//				Scanner sc = new Scanner(System.in);
//				if(sc.nextInt() == -1)
//				{
//					System.out.println("종료합니다...");
//					return;
//				}
//				for(int repeat = 0; ;repeat++)
//				{
//				//while(true)
//				//{
//				x=sc.nextInt();
//				y=sc.nextInt();		
//				
//				for (int i =0; i < 12; i++)
//				{	
//
//					for(int j = 0 ; j < 10; j++ )
//					{
//
//						
//						
//						if(i==0 && j==0)
//						{
//							System.out.print('┌');
//						}
//						else if(i==11  && j==0)
//						{
//							System.out.print('└');
//						}
//						else if(i==11 && j==9)
//						{
//							System.out.print("┘");
//						}
//						else if(j==9 && i==0)
//						{
//							System.out.print("┐");
//						}
//						else if(i==0 && (j!=9))
//						{
//							System.out.print('┬');
//						}
//						else if(i==11 && (j!=9))
//						{
//							System.out.print('┴');
//						}
//						else if (j==0 )
//						{
//							System.out.print('├');
//
//						}
//						else if (j==9)
//						{
//							System.out.print('┤');
//
//						}
//
//						else if(i==x && j==y && count%2==0)
//						{
//							System.out.print("●");
//							count++;
//						}
//						
//						else if(i==x && j==y && count%2==1)
//						{
//							System.out.print("○");
//							count++;
//						}				
//						
//						else
//						{
//							System.out.print('┼');
//						}
//
//
//						
//					}
//					System.out.println();
//				}
//
//			}
//			
//		
		// }

	}
}
