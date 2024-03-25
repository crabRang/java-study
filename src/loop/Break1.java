package loop;

public class Break1 {
    public static void main(String[] args) {
        // break : 반복문을 즉시 종료하고 나간다.
        // continue : 반복문의 나머지 부분을 건너뛰고 다음반복으로 진행.

        //문제 : 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰값
        int sum = 0;
        int i = 1;

        while(true){
            sum = sum+i;
            if(sum > 10){
                //sum이 10이상이라는 조건을 만족하면 아래코드를 실행하며 break를 사용해 반복문을 나간다.
                System.out.println("[ 합이 10보다 크면 종료 ] i = "+i+", sum = "+sum);
                break;
            }
            i++;
        }
        //조건이 true이기 때문에 break가없으면 빠져나올 수 없다.
    }
}
