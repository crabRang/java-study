package operator;

public class Operator3 {
    public static void main(String[] args) {
        //연산자의 우선순위
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3) = 7, 연산자의 우선순위에 의해 곱셈이 먼저 계산
        int sum2 = (1 + 2) * 3;
        System.out.println(sum1); //7
        System.out.println(sum2); //9
    }
}
