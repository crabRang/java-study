package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        /*
         * 문제5. 변수 값 교환
         * a = 10, b = 20
         * a와 b의 값을 서로 바꾸어라
         * (temp변수 활용)
         */
        int a = 10;
        int b = 20;
        int temp;

        //시작코드
        temp = a;
        a = b;
        b = temp;
        //종료코드

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
