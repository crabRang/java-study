package array.ex;

import java.util.Scanner;

public class ArrayEx3_1 {
    public static void main(String[] args) {
        /*
         * 문제3. 배열과 역순 출력(강사님)
         * 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력.
         * 출력 시 출력 포멧은 쉼표(,)를 사용해서 구분하고, 마지막에는 쉼표X
         */
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("정수를 입력하세요.");
        for(int i=0; i<numbers.length; i++){
            int num = sc.nextInt();
            numbers[i] += num;
        }

        System.out.println("출력");
        //i : 0 1 2 3 4 - 5 4 3 2 1
        for(int i=4; i>=0; i--){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }

    }
}
