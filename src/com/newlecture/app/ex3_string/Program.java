package com.newlecture.app.ex3_string;

public class Program {

	public static void main(String[] args) {

		// 형변환 + 오브젝트화 -------------------------------
//		int x = 3;
//		Integer 정수갑옷 = Integer.valueOf(x); // new Integer(x);
//		int x1 = 정수갑옷.intValue();  // Unboxing
//		
//		String y = "hello";
//
//		double d1 = 3.9;
//		Double 더블갑옷 = Double.valueOf(d1); // new Double(d1);
//		double d2 = 더블갑옷.doubleValue();   // Unboxing
//		
//		
//		// 정수형을 문자열로 변환
//		int n1 = 10;
//		String s1 = Integer.toString(n1) ;
//		String s2 = String.valueOf(n1);
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		
//		// 문자열을 더블형으로 변환 
//		String s3 = "30.2";
//		double n2 = Double.parseDouble(s3);
//		System.out.println(s3);
	
		
		// 값과 참조변수 -------------------------------------
		// 변수 선언 = 요리에서의 준비물
		// "아이유" = 값으로서의 준비물
		
		// 값이냐 박스냐 (값과 참조) 
		String name1 = "아이유";
		String name2 = "아이유";
		
		// 같은 객체를 참조하고 있는지를 비교 (같은 주소값인지 = 아이유라는 박스)
		System.out.println(name1 == name2);  // true
		// 객체의 값이 같은지를 비교
		System.out.println(name1.equals(name2));  // true
		
		
		String name3 = "아이유";
		String name4 = new String("아이유");  // => 객체가 아니다? 근데 객체화 해줘 한거다?
		System.out.println(name3 == name4);  // false 
		System.out.println(name1 == "아이유");  // true
		
		
		
		// 문자열 조작을 위해 자주 쓰이는 함수들 --------------------
		String fileName = "Photo.jpg";
		System.out.println(fileName.length());   //9
		System.out.println(fileName.indexOf("."));   //5
		System.out.println(fileName.substring(0, 6));   //Photo.
		
		
		// 위의 파일명에서 확장자를 제외한 파일명만 출력
		String str1 =  fileName.substring(0,5);
		System.out.println(str1);

		//위의 파일명에서 .이 있는 곳까지의 문자열을 출력하시오. (단 . 제외)
		
		
	}

}
