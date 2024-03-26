package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        /*
         * 문제6. 사용자로부터 두개의 정수를 입력받고, 이 두 정수 사이의 모든 정수 출력
         * 첫번째 정수 : num1, 두번째 정수 : num2
         * 만약 num1 > num2일 경우, 두 숫자 교환(임시변수사용)
         * 출력: ,로 구분(0, 0, 0, 0)
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수 입력 : ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for(int i=num1; i<=num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(", ");
            }
        }
    }
}
