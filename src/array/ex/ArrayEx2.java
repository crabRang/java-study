package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
         * 문제2. 사용자에게 5개의 정수를 입력받아 배열에 저장하고, 입력 순서대로 출력
         * 출력 시 출력 포멧은 쉼표(,)를 사용해서 구분하고, 마지막에는 쉼표를 넣지않는다.
         */
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요.");
        for(int i=0; i<numbers.length; i++){
            numbers[i] += sc.nextInt();
        }

        System.out.println("출력");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i != numbers.length-1){
                System.out.print(", ");
            }
        }
    }
}
