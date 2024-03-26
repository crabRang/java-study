package casting;

public class Casting2 {
    public static void main(String[] args) {
        /*
         * double : 실수, int : 정수
         * double은 1.5를 표현할 수 있는데 int는 불가능하다.
         * 이 경우 double -> int에 대입하면 오류가 발생
         */
        double doubleValue = 1.5;
        int intValue;

        // intValue = doubleValue; //컴파일 오류발생
        // int형은 double보다 범위가 작기때문에, 숫자가 손실되는 문제가 발생할 수 있다.
        // -> 자바에서 컴파일 오류 발생시킴
        intValue = (int)doubleValue;
        System.out.println("intValue = "+intValue); // 1;

        /*
         * 숫자가 손실되는 문제를 감수하고도 값을 대입하고 싶다면
         * 데이터 타입을 강제로 변경할 수 있다.
         * 예를들어, 대략적인 결과를 보고싶어서 소수점을 버리고 정수로만 확인할 경우
         *
         * 형변환은 변경하고 싶은 데이터 타입을 괄호를 사용하여 명시적으로 입력하면 된다.
         * intValue = (int)doubleValue
         * 개발자가 직접 형변환 코드를 입력한다고해서 [ 명시적 형변환 ]이라 한다.
         */
        int z = (int)1.5;
        System.out.println("z = "+z);
    }
}
