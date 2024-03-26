package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        /*
         * 문제1. 이름, 나이를 입력받고 출력하기
         * 출력 : 당신의 이름은 'ㅇㅇ'이고, 나이는 'ㅇㅇ'살 입니다.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"살 입니다.");
    }
}
