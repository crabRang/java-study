package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        /*
         * 문제2. 10개의 짝수 출력
         * 변수 : num, for문 while문 둘다 만들 것
         */
        int num = 2;
        int count = 1;

        while(count <= 10){
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
