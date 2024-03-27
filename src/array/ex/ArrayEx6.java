package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        /*
         * 문제6. 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
         * 배열내에서 가장 작은 수와 큰수를 찾아 출력하는 프로그램
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = sc.nextInt();
        int[] numbers = new int[num];

        System.out.println(num+"개의 정수를 입력하세요.");
        for(int i=0; i<numbers.length; i++){
            numbers[i] += sc.nextInt();
        }
        int temp = 0;

        // 0 1 2 3 4
        // 3 5 4 2 1
        // 3 4 2 1 5
        // 3 2 1 4 5
        // 2 1 3 4 5
        // 1 2 3 4 5

        for(int i=0; i<numbers.length-1; i++){
            for(int j=0; j<numbers.length-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("가장 작은 정수 : "+numbers[0]);
        System.out.println("가장 큰 정수 : "+numbers[numbers.length-1]);
    }
}
