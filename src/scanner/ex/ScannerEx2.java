package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        /*
         * 문제2. 입력받은 정수의 홀짝을 판별하는 프로그램
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("입력한 숫자 : "+num+", 짝수입니다.");
        }else{
            System.out.println("입력한 숫자 : "+num+", 홀수입니다.");
        }
    }
}
