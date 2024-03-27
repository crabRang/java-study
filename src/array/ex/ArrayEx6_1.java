package array.ex;

import java.util.Scanner;

public class ArrayEx6_1 {
    public static void main(String[] args) {
        /*
         * (강사님)
         * 문제6. 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
         * 배열내에서 가장 작은 수와 큰수를 찾아 출력하는 프로그램
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = sc.nextInt();

        int[] numbers = new int[num];
        int minNumber, maxNumber;

        System.out.println(num+"개의 정수를 입력하세요.");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        minNumber = maxNumber = numbers[0]; //초기화
        /*
        minNumber = numbers[0]
        maxNumber = numbers[0]
         */
        for(int i=0; i<num; i++){
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : "+minNumber);
        System.out.println("가장 큰 정수 : "+maxNumber);

    }
}
