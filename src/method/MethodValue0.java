package method;

public class MethodValue0 {
    // 자바는 항상 변수의 값을 복사해서 대입한다.
    public static void main(String[] args) {
       int num1 = 5;

       int num2 = num1;
       //num1이라는 변수 자체가 num2에 들어가는 것이 아님
       //num1에 들어가있는 값을 읽고 복사해서 num2에 넣는 것
       //num1변수와 num2변수는 관련이 없음

       num2 = 10;

       System.out.println("num1 = "+num1);
       System.out.println("num2 = "+num2);
    }
}
