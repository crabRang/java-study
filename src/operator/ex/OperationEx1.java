package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        /*
        문제1.
            1. int형 변수 num1, num2, num3를 선언하고 각각 10, 20, 30으로 초기화하세요
            2. 세 변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int 변수에 저장하세요
            3. 세변수의 평균을 계산하고, 그 결과를 average라는 이름의 int 변수에 저장하세요. 평균계산시 소수점이하 버림
            4. sum과 average 변수의 값을 출력하세요.
         */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3; //int끼리 계산할 경우 소수점을 버린다.

        System.out.println("sum = "+sum+", average = "+average);
    }
}
