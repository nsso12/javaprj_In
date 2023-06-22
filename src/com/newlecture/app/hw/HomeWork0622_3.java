package com.newlecture.app.hw;

public class HomeWork0622_3 {
    public static void main(String[] args) {

        // 1. 다음 한문장을 반복해서 다음과 같은 출력이 가능하도록 하는 코드를 작성하시오.
        //System.out.printf(“%c”, ‘┼’); 또는 System.out.printf(“%c”, ‘○’);
        //○┼┼┼┼┼┼┼┼┼
        //┼○┼┼┼┼┼┼┼┼
        //┼┼○┼┼┼┼┼┼┼
        //┼┼┼○┼┼┼┼┼┼
        //┼┼┼┼○┼┼┼┼┼
        //┼┼┼┼┼○┼┼┼┼
        //┼┼┼┼┼┼○┼┼┼
        //┼┼┼┼┼┼┼○┼┼
        //┼┼┼┼┼┼┼┼○┼
        //┼┼┼┼┼┼┼┼┼○

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j)
                    System.out.printf("●");
                else
                    System.out.printf("%s", "┼");
            }
            System.out.println();
        }
        System.out.println("1번 과제 출력 완료");


        // 2. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
        //○┼┼┼┼┼┼┼┼┼○
        //┼○┼┼┼┼┼┼┼○┼
        //┼┼○┼┼┼┼┼○┼┼
        //┼┼┼○┼┼┼○┼┼┼
        //┼┼┼┼○┼○┼┼┼┼
        //┼┼┼┼┼○┼┼┼┼┼
        //┼┼┼┼○┼○┼┼┼┼
        //┼┼┼○┼┼┼○┼┼┼
        //┼┼○┼┼┼┼┼○┼┼
        //┼○┼┼┼┼┼┼┼○┼
        //○┼┼┼┼┼┼┼┼┼○

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j)
                    System.out.printf("●");
                else if (i + j == 10)
                    System.out.printf("●");
                else
                    System.out.printf("%s", "┼");
            }
            System.out.println();
        }
        System.out.println("2번 과제 출력 완료");


        // 3. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
        //○┼┼┼┼┼┼┼┼┼○
        //┼○┼┼┼┼┼┼┼○┼
        //┼┼○┼┼┼┼┼○┼┼
        //┼┼┼○┼┼┼○┼┼┼
        //┼┼┼┼○┼○┼┼┼┼
        //┼┼┼┼┼○┼┼┼┼┼
        //┼┼┼┼○○○┼┼┼┼
        //┼┼┼○○○○○┼┼┼
        //┼┼○○○○○○○┼┼
        //┼○○○○○○○○○┼
        //○○○○○○○○○○○

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j || i == 10 - j)
                    System.out.printf("●");
                else if (i >= j && i >= 10 - j)
                System.out.printf("●");
                else
                System.out.printf("%s", "┼");
            }
            System.out.println();
        }
        System.out.println("3번 과제 출력 완료");
    }
}
