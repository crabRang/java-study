package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        /*
         *  문제 7. 홀짝찾기
         *  정수 x가 홀수면 "홀수"를, 짝수면 "짝수"를 출력하는 프로그램
         *  삼항연산자 사용
         */
        int x = 10;

        String result = (x%2 == 0) ? "짝수" : "홀수";
        System.out.println("x : "+x+", "+result);
    }
}
