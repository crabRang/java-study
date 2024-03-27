package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        /*
         * 문제8. 2차원배열2
         * 이전 문제에서 학생수를 입력받도록 개선하자
         */
        Scanner sc = new Scanner(System.in);
        String[] subjects = { "국어", "영어", "수학" };

        System.out.print("학생 수를 입력하세요 : ");
        int studentCount = sc.nextInt();

        int[][] arr = new int[studentCount][3];
        for(int i=0; i<arr.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요. ");
            for(int j=0; j<arr[i].length; j++){
                System.out.print(subjects[j]+" 점수 : ");
                arr[i][j] = sc.nextInt();
            }
        }

        //출력
        for(int i=0; i<arr.length; i++){
            int total = 0;
            for(int j=0; j<arr[i].length; j++){
                total += arr[i][j];
            }
            double average = (double)total/arr[i].length;
            System.out.println((i+1)+"번 학생의 총점 : "+total+", 평균 : "+average);

        }
    }
}
