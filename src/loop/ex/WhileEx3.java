package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        /*
         * 문제3. 1부터 max까지 누적 합 계산
         * max: 마지막 값, sum : 누적 합, i : 1부터 max까지 증가하는 변수
         */
        int max = 100;
        int i = 1;
        int sum = 0;

        while(i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
