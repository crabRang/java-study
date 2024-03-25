package loop;

public class While2_1 {
    public static void main(String[] args) {
        // 문제 : 1부터 하나씩 증가하는 수를 3번 더해라 (1~3 더하기)
        int sum = 0;

        sum = sum + 1;
        System.out.println("i = "+1+", sum = "+sum);

        sum = sum + 2;
        System.out.println("i = "+2+", sum = "+sum);

        sum = sum + 3;
        System.out.println("i = "+3+", sum = "+sum);

        //위 코드는 변경하기에 쉽지않다.
    }
}
