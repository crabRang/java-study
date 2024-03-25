package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        /*
         * 문제1. 10개의 자연수를 출력하는 프로그램
         * 변수 : count , for문과 while문 둘다 만들 것
         */

        //while문
        int count = 1;
        while(count <= 10){
            System.out.println(count);
            count++;
            //System.out.println(count++);
        }
    }
}
