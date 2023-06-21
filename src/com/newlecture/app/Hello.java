package com.newlecture.app;

public class Hello {
	public static void main(String[] args) {

		// 변수 선언
		int kor1, kor2, kor3;
		int total;
		float avg, avg2;

		// 변수 초기화
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		// 성적 계산
		total = kor1 + kor2 + kor3;
		avg = total / 3;  // 63.00000 
		avg2 = total / 3.0f; //63.333332
		
		
		// 성적 출력
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n", avg);
		System.out.printf("avg is %f\n", avg2);
	
		
	}
}
