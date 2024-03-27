package array;

public class ArrayDi2 {
    public static void main(String[] args) {

        //리팩토링2 : 출력 반복문 사용하기2

        //2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행2, 열3

        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2; //0행 1열
        arr[0][2] = 3; //0행 2열
        arr[1][0] = 4; //1행 0열
        arr[1][1] = 5; //1행 1열
        arr[1][2] = 6; //1행 2열

        //중첩for문 사용
        for(int row=0; row<2; row++){
            for(int column=0; column<3; column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }

        /*
        System.out.print(arr[0][0] + " "); //0열출력
        System.out.print(arr[0][1] + " "); //1열출력
        System.out.print(arr[0][2] + " "); //2열출력

        System.out.println();

        System.out.print(arr[1][0] + " "); //0열출력
        System.out.print(arr[1][1] + " "); //1열출력
        System.out.print(arr[1][2] + " "); //2열출력
         */
    }
}
