package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class HomeWork0622_1 {
    public static void main(String[] args) throws IOException {

        // res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
        // 90 87 20 30 29 39 49 38 10 19 87 29 38 27 8
        // 문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.

        {
            FileInputStream fis = new FileInputStream("res/data.txt");
            Scanner fscan = new Scanner(fis);
            FileOutputStream fos = new FileOutputStream("res/dataout.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            int count = 0;
//            //1-1.
//        for(int i=0; i<fscan.nextInt(); i++) {
//            count = i++;
//            count++;
//        }
//
            //1-2.
//            int[] arr = new int[100];
//            for (int i = 0; fscan.hasNext(); i++) {
//                arr[i] = fscan.nextInt();
//                count++;
//            }
//            System.out.println(count);


//            // 이 값들 중에서 가장 큰 값이 무엇인지 출력하는 코드를 작성하시오.
//            // 2-1.
//            int max = -1;
//            for (int i = 0; i < count - 1; i++)
//                if (max < arr[i])
//                    max = arr[i];
//            System.out.printf("max is %d\n", max);

//            //2-2.
//            int temp;
//            for (int i = 0; i < count - 1; i++)
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//
//
//            // 이 값들 중에 10 을 찾아서 그 위치(인덱스 값)을 출력하시오.
//            int index = -1;
//            for (int i = 0; i < count - 1; i++)
//                if (arr[i] == 10)
//                    index = i + 1;`
//            System.out.printf("index is %d\n", index);


            //문제 4 : 다음 각 절차를 따라 작성하시오
            // 4-1. nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
            int[] nums = new int[15];

            // 4-2. res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다. ************************
            for (int i = 0; fscan.hasNext(); i++) {
                nums[i] = fscan.nextInt();
                System.out.println(nums[i]);
                System.out.println("로드 완료");
            }

            // 4-3. 0~14 범위의 랜덤값 2개를 얻어서  그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.(패스)

            // 4-4. res/data-out.txt 파일로 배열의 값들을 저장
            for (int i = 0; i < count; i++)
                fout.printf("%d ", nums[i]);
            System.out.println("저장 완료");
        }
    }
}

