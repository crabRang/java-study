package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        /*
         * 문제4. 구구단 사용자로부터 하나의 정수 n을 입력받고, n단출력하는 프로그램
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int dan = sc.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(dan+" * "+i+" = "+(dan*i));
        }
    }
}
