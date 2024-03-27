package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        //리팩토링3 : 선언, 초기화

        /*
        int[][] arr = new int[2][3]; //행2, 열3

        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2; //0행 1열
        arr[0][2] = 3; //0행 2열
        arr[1][0] = 4; //1행 0열
        arr[1][1] = 5; //1행 1열
        arr[1][2] = 6; //1행 2열
         */

        //2차원배열, 초기화
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };// 행2, 열3

        for(int row = 0; row < arr.length; row++){ //arr.length = 2
            for(int column = 0; column < arr[row].length; column++){ //arr[row].length = 3
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
}
