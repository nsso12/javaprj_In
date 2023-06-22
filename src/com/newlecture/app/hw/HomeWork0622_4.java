package com.newlecture.app.hw;

import java.io.*;
import java.util.Scanner;

public class HomeWork0622_4 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int kor = 0;
        int mat = 0;
        int eng = 0;

        // 시작 및 입력 페이지
        OVER:
        while (true) {
            System.out.print("┌────────────────────────────┐");
            System.out.println();
            System.out.print("           메인 메뉴            ");
            System.out.println();
            System.out.print("└────────────────────────────┘");
            System.out.println();
            System.out.println("1. 성적 입력    2. 성적 출력    3. 성적 불러오기  4. 성적 저장하기  9. 프로그램 종료");

            System.out.println("선택 > ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("┌────────────────────────────┐");
                    System.out.println();
                    System.out.print("           성적 입력            ");
                    System.out.println();
                    System.out.print("└────────────────────────────┘");
                    System.out.println();

                    System.out.println("국어 성적을 입력하세요: ");
                    kor = sc.nextInt();
                    if (kor < 0 || kor > 100) {
                        System.out.println("성적의 범위(0~100)을 벗어났습니다");
                        break;
                    }
                    arr[0] = kor;

                    System.out.println("수학 성적을 입력하세요: ");
                    mat = sc.nextInt();
                    if (mat < 0 || mat > 100) {
                        System.out.println("성적의 범위(0~100)을 벗어났습니다");
                        break;
                    }

                    System.out.println("영어 성적을 입력하세요: ");
                    eng = sc.nextInt();
                    if (eng < 0 || eng > 100) {
                        System.out.println("성적의 범위(0~100)을 벗어났습니다");
                        break;
                    }
                    arr[2] = eng;
                    break;

                case 2:
                    System.out.print("┌────────────────────────────┐");
                    System.out.println();
                    System.out.print("           성적 출력           ");
                    System.out.println();
                    System.out.print("└────────────────────────────┘");
                    System.out.println();


                    for (int i = 0; i < arr.length; i++)
                        System.out.println(arr[i] + "점");
                    break;

                case 3: {
                    FileInputStream fis = new FileInputStream("res/test.txt");
                    Scanner fscan = new Scanner(fis);

                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = fscan.nextInt();
                        System.out.println(arr[i] + "점");
                    }
                    fscan.close();
                    fis.close();
                    break;
                }

                case 4:
                    FileOutputStream fos = new FileOutputStream("res/test.txt");
                    PrintWriter fout = new PrintWriter(fos);

                    for (int i = 0; i < arr.length; i++)
                        fout.printf("%d ", arr[i]);
                    fout.close();
                    fos.close();
                    break;

                case 9:
                    break OVER;

                default:
                    System.out.println("잘못된 메뉴 입력입니다");
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
