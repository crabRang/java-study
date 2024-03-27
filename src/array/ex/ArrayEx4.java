package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        /*
         * 문제 4. 합계와 평균
         * 사용자에게 5개의 정수를 입력받아, 정수의 합계와 평균을 계산하는 프로그램
         */
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;

        System.out.println("5개의 정수를 입력하세요. ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        System.out.println("입력한 정수의 합계 : "+total);
        System.out.println("입력한 정수의 평균 : "+((double)total/numbers.length));
    }
}
