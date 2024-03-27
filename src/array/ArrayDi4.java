package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        //리팩토링4 : 배열의 크기와 상관없이 배열에 순서대로 1씩 증가하는 값을 입력

        /*
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
         */
        int[][] arr = new int[2][3];
        int i=1;
        //순서대로 1씩 증가하는 값을 입력한다
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
                //1부터 시작한 i가 후의 증감연산자를 사용해서 2, 3, 4, ... 대입
            }
        }

        for(int row = 0; row < arr.length; row++){ //arr.length = 2
            for(int column = 0; column < arr[row].length; column++){ //arr[row].length = 3
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
}
