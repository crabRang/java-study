package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        /*
         * 문제 7. 2차원 배열1
         * 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아
         * 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자
         * arr[4][3]
         */
        Scanner sc = new Scanner(System.in);
        String[] subjects = { "국어", "영어", "수학" };
        int[][] arr = new int[4][3];

        for(int i=0; i < arr.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요. ");
            for(int j=0; j < arr[i].length; j++){
                System.out.print(subjects[j]+" 점수 : ");
                arr[i][j] = sc.nextInt();
            }
        }

        //출력
        for(int i=0; i < arr.length; i++){
            int total = 0;
            for(int j=0; j < arr[i].length; j++){
                total += arr[i][j];
            }
            double average = (double)total/arr[i].length;
            System.out.println((i+1)+"번 학생의 총점 : "+total+", 평균 : "+average);

        }
    }
}
