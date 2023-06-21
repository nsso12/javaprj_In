package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {

		int n1, n2, n3, n4 = 0;

		{// FileInputStream 객체 fis 생성
			FileInputStream fis = new FileInputStream("res/pic1.bmp");

			// while문으로 18byte 버리기
//			int i = 0;
//			while (i < 18) {
//				fis.read();
//				i++;
//			}

			// for문으로 18byte 버리기
			for (int i = 0; i < 18; i++) {
				fis.read();
			}

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

			int width = n1 << 0 | n2 << 8 | n3 << 16 | n4 << 24;

			System.out.println("width : " + width);

		}
	}
}