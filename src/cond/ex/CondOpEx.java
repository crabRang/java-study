package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        /*
         * 문제 6. 더 큰 숫자 찾기
         * 두개의 정수 a, b - 삼항 연산자를 사용하여 둘 중 큰수를 출력하는 코드를 작성하자.
         * a = 10, b = 20
         */
        int a = 20;
        int b = 10;

        int result = ( a > b ) ? a : b;
        System.out.println("더 큰 숫자는 "+result+"입니다.");
    }
}
