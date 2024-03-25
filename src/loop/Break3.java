package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; ; i++){
            sum = sum+i;
            if(sum > 10){
                System.out.println("[ 합이 10보다 크면 종료 ] i = "+i+", sum = "+sum);
                break;
            }
        }
        //카운터 변수가 명확하거나, 반복횟수가 정해진 경우에는 for문을 사용하는 것이 더 효율적이다.
    }
}
