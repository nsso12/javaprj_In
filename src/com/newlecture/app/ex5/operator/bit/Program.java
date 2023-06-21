package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		int n1, n2, n3, n4 = 0;
		

		{// FileInputStream 객체 fis 생성
			FileInputStream fis = new FileInputStream("res/pic1.bmp");

			
			// 2바이트를 읽어서 버리세요 (signature 부분(상호명)을 지워주는 것)
			fis.read();
			fis.read();

			
			// 추가로 4바이트는 정수형 변수 n1, n2, n3, n4에 각각 저장해주세요.
			// 파일 사이즈를 메모하고 있는 값 

			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();

			
			// 각 변수들을 "10, 20, 30, 40" 과 같은 포맷으로 콘솔에 출력해주세요
			System.out.printf("%x,%x,%x,%x\n", n1, n2, n3, n4);

			fis.close();

		}

		{
			// 파일 크기 출력
			// 1a, cd, 12, 0 
			// => 0, 12, cd, 1a // 이게 컴퓨터가 읽을수 있는 값 
			
			
//			int size = n1 << 0 |       
//			[   ] [   ] [   ] [ 5e ]   (n1<<0)&0x000000ff |
//			[   ] [   ] [ 65 ] [   ]   (n2<<8)&0x0000ff00 |
//			[   ] [ 24 ] [   ] [   ]   (n3<<16)&0x00ff000 |
//			[ 00 ] [   ] [   ] [   ]   (n4<<24&0xff000000
			
			int size = n1 << 0 |  
						 n2 << 8 | 
						 n3 << 16 |
						 n4 << 24;
		
			System.out.println("size : " + size);
			
			//삼항 연산자
			String result = (size>1000000) ? "우와 크다" : "적당하다";
			System.out.println(result);
			
			size = (size>10000) ?0:size;
			System.out.printf("size : %d\n", size);
			
			
			int price = 10000;
			String count = (price>20000) ? "남음" : "부족함";
			System.out.println(count);
		 	
		}

	}

}
