package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        /*
         * 문제9. 입력한 숫자의 합계와 평균
         * 사용자로부터 여러 개의 숫자를 입력받고, 그 숫자들의 합계와 평균을 계산하는 프로그램
         * 사용자가 마지막에 -1을 입력하여 숫자 입력을 종료한다고 가정
         * 모든 입력이 끝난 후 합계(sum)와 평균(average) 출력(평균은 소수점 아래까지 계산)
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num = 0; //입력받은 숫자를 넣을 변수, 여기에 선언한 이유는 while문 조건으로 사용하기 위해.

        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while((num = sc.nextInt()) != -1){
            sum += num;
            count++;
        }

        double average = (double)sum/count;
        // int/int 계산은 int가 나오기때문에 1/2 = 1이 나오게됨, double형이기 때문에 1.0
        // -> 그러므로 형변환을 해주어 (double)int/int형으로 바꿔줘야한다.
        System.out.println("입력한 숫자들의 합계 : "+sum);
        System.out.println("입력한 숫자들의 평균 : "+average);
    }
}
