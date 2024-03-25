package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        /*
         * 문제2. 10개의 짝수 출력
         * 변수 : num, for문 while문 둘다 만들 것
         */
        /*
        for(int num = 2, count = 1; count <= 10; num += 2, count++){
            System.out.println(num);
        }
         */
        int num = 2;
        for(int count = 1; count<=10; count++){
            System.out.println(num);
            num += 2;
        }
    }
}
