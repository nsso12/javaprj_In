package com.newlecture.app.hw;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class HomeWork0622_2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("res/alphabet.txt");
        Scanner fscan = new Scanner(fis);
        FileOutputStream fos = new FileOutputStream("res/alphabet-out.txt");
        PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

        int count = 15;

        // 1. res/alphabet.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오. abcdefghijklmn


        // 2. alphabet이라는 이름으로 문자 15개를 저장할 수 있는 배열 객체를 생성한다.
        String[] alphabet = new String[15];
        String a = fscan.next();

        // 3. res/alphabet.txt 파일에 저장된 구분자가 없는 영문자 값들을 alphabet 배열에 로드한다

        for (int i = 0; i < a.length(); i++) {
            alphabet[i] = a.substring(i, i + 1);  //얼이가 말한 마지막부터... 그게 뭐지? *****************
            System.out.printf("%s",alphabet[i]);
        }
        System.out.println(" 로드 완료");

        // 4. 배열의 값이 다음과 같은 상태가 되도록 자리를 바꾼다.  nmlkjihgfedcba
        String temp;
        for (int i = 0; i < (count - 1) / 2; i++) {
            temp = alphabet[i];
            alphabet[i] = alphabet[14 - i];
            alphabet[14 - i] = temp;
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.printf("%s", alphabet[i]);
        }
        System.out.println(" 자리변경 완료");

        // 5. res/alphabet-out.txt 파일로 배열의 값들을 저장
        for (int i = 0; i < count; i++) {
            fout.printf("%s", alphabet[i]);
        }
        System.out.println("저장 완료");
    }
}
