package ex06.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		int[] nums = new int[100];

		// 값 로드하기
		int size = 0; // 배열의 크기

		{
			FileInputStream fis = new FileInputStream("res/array/data.txt");
			Scanner fscan = new Scanner(fis);

			// 배열에 입력하기
			for (int i = 0; fscan.hasNext(); i++) {
				int num = fscan.nextInt();
				nums[i] = num;
				size++;
			}
			fscan.close();
			fis.close();
		}

		// nums 출력하기
		for (int i = 0; i < size; i++)
			System.out.printf("%d, ", nums[i]);

		// 위치 찾기
		int index = -1;

		{
			for (int i = 0; i < size; i++) {
				if (nums[i] == 90) {
					index = i;
					break;
//					System.out.printf("%d ", i);
				}
			}
		}

		// 값 바꾸기
		{
			int temp;
			temp = nums[5];
			nums[5] = nums[0];
			nums[0] = temp;
		}

		System.out.println();
		// num 출력하기
		for (int i = 0; i < size; i++)
			System.out.printf("%d, ", nums[i]);

		// 값 저장하기
		{

			FileOutputStream fos = new FileOutputStream("res/array/data.txt");
			PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

			for (int i = 0; i < size; i++)
				fout.printf("%d, ", nums[i]);

			fout.close();
			fos.close();
		}

	}

}
