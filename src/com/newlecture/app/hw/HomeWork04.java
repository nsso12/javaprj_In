package com.newlecture.app.hw;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("<뉴렉 카페 신메뉴 개발>");
		System.out.println("어떤 원두를 사용할까?");
		System.out.println("1. 가성비 원두  2. 제주도 원두  3. 프리미엄 뉴렉 원두");
		System.out.print("> ");
		int num = sc.nextInt();
		
		System.out.println("그 원두의 가격은 얼마야?");
		System.out.print("> ");
		int price = sc.nextInt();
		
		System.out.println("대략");
		System.out.println(num*price);
		System.out.println("원 이군!");
		
	}
}
