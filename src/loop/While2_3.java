package loop;

public class While2_3 {
    public static void main(String[] args) {
        // 문제 : i부터 하나씩 증가하는 수를 endNum(마지막수)까지 더해라(i ~ endNum 더하기)
        int sum = 0;
        int i = 50;
        int endNum = 100;

       while(i <= endNum){
           sum = sum + i;
           System.out.println("i = "+i+", sum = "+sum);
           i++;
       }
       //while문을 사용하면 원하는 횟수 만큼 같은 코드를 반복 실행할 수 있다.
    }
}
