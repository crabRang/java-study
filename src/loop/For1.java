package loop;

public class For1 {
    public static void main(String[] args) {
        /*
         * for문
         * for( 초기식; 조건식; 증감식){ 코드 }
         * 1. 초기식 실행(반복횟수초기화)
         * 2. 조건식 검증 - 참이면 코드실행, 거짓이면 for문을 빠져나간다
         * 3. 코드 실행
         * 4. 코드 종료후 증감식 실행
         * 5. 다시 2부터 시작
         */

        //1부터 10까지 출력하는 코드
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}
