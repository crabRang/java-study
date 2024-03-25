package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        /*
         * 문제5. 피라미드 출력
         * rows 수만큼 피라미드 출력
         */
        int rows = 5;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
