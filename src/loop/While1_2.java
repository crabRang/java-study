package loop;

public class While1_2 {
    public static void main(String[] args) {
        /*
         * while문
         * while(조건식){ 코드 }
         *  : 조건식이 참이면 코드를 실행(반복), 거짓이면 while문을 벗어난다.
         */
        int count = 0;

        while(count < 3){
            count++;
            System.out.println("현재 숫자 : "+count);
        }
    }
}
