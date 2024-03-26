package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        /*
         * 사용자 입력을을 받아 그 합계를 계산하는 프로그램
         * 사용자가 0을 입력하면 프로그램은 종료, 프로그램이 종료될 때 까지 사용자가 입력한 모든 정수의 합 출력
         */
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("정수를 입력하세요(0입력 시 종료) : ");
            int num = input.nextInt();
            if(num == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("총 합계 : "+sum);
    }
}
