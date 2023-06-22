package ex06.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        /*
         * 문제: 파일에서 값 90을 찾아서 그 값을 1번째 위치 값과 바꾸어 저장하시오.
         *
         *
         *
         *
         *
         * 문제푼날: 230621
         * 풀이: 나
         * 핵심: 줄어드는 값과 고정된 값이 무엇인지 구분한다.
         * */

        int[] nums = new int[100];// 숫자 저장 공간

        int size = 0;//데이터 Size측정

        // 값 로드하기
        {
            FileInputStream fis = new FileInputStream("res/array/data.txt");
            Scanner sc = new Scanner(fis);

            for (int i = 0; sc.hasNext(); i++) {
                nums[i] = sc.nextInt();
                size++;
            }
            sc.close();
            fis.close();
        }

        //nums 출력하기
        //100, 23, ...70
        {
            for (int i = 0; i < size; i++)
                System.out.printf("%3d ", nums[i]);
        }
        System.out.println();

        int index = -1;// index가 0부터 시작하면 배열에서 0값으로 인식할 수 있어서 범위 밖에있는 값 지정.
        // 위치 찾기
        {
            for (int i = 0; i < size; i++)
                if (nums[i] == 90) {
                    index = i;
                    break;//효율을 위해서!
                }
        }

        // 값 바꾸기
//		{
//			int temp;//temp라는 변수는 이 구역에서만 사용해서 여기에 변수를 선언했음
//			temp = nums[index];
//			nums[index] = nums[0];
//			nums[0] = temp;
//		}
        //제일 큰 값 찾기
//		{
//			int max = nums[0];
//
//			//2번째(=인덱스 1) 숫자부터 겨루기를 해서 왕좌를 탈환하라.
//			//몇번의 반복? size-1
//
//			for (int i = 0; i < size - 1; i++)
//				if (max  < nums[i])
//					max = nums[i];
//
//			System.out.printf("max : %d\n", max);
//		}

        // 자리 바꾸기 방식으로 큰 값을 찾기
//		{
//			for(int i=0; i<size-1; i++)
////				if(nums[i]> nums[i+1]) {
//					int temp = nums[i];
//					nums[i] = nums[i+1];
//					nums[i+1] = temp;
//				}
//
//			//제일 큰 값 출력
//			System.out.printf("max: %d\n", nums[size-1]);
//		}

        // 최솟값의 인덱스 찾기
        {
            int minIndex = 0;
            for (int i = 0; i < size - 1; i++)
                if (nums[minIndex] > nums[i + 1]) {
                    minIndex = i + 1;
                }
            System.out.printf("min index: %d ", minIndex);
        }

        // 버블 정렬
        for (int i = 0; i < size-1; i++)  // 순서 바꾸는걸 몇번 할건지(1등을 몇번 뽑을건지)
            for (int j = 0; j < size-1-i; j++) //1등을 순서 바꾸는 코드 => 1등은 가장 우측에 감
                //size - 1 을 하는 이유는 마지막 값 0은 비교를 해줄 이유가 없기 때문에
                //size - i -1을 하는 이유는 실행될수록 비교하는 횟수가 줄기 때문에
                if (nums[j] > nums[j + 1]) {  // 처음꺼 > 다음꺼  // 오름차순 정렬이기에 오른쪽 값이 더 크면 교환
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }


        // 값 저장하기
        {
            FileOutputStream fos = new FileOutputStream("res/array/data1.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            //파일 출력
            for (int i = 0; i < size; i++)
                fout.printf("%d ", nums[i]);

            //콘솔 출력
//			for (int i = 0; i < size; i++)
//				System.out.printf("%3d ", nums[i]);

            fout.close();
            fos.close();


        }
    }
}

