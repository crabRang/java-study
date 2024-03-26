package casting;

public class Casting1 {
    public static void main(String[] args) {
        /*
         * 형변환
         *   작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다
         *    ( int -> long -> double )
         *   큰 범위에서 작은 범위에 값을 대입할 경우에는 문제가 발생할 수 있다.
         *    : 소수점 버림, 오버플로우
         */
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = "+longValue); //10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = "+doubleValue); //10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = "+doubleValue); //20.0

        // 자바는 기본적으로 같은 타입에 값을 대입
        // 다른타입에 값을 대입할 경우, 작은 범위 숫자타입을 큰 범위 숫자타입에는 대입이 가능
        /*
         * 자동형변환
         * doubleValue = intValue
         * doubleValue = (double)intValue //형맞추기
         * doubleValue = (double)10 //변수 값 읽기
         * doubleValue = 10.0 //형변환
         *
         * 작은 범위 숫자타입에서 큰 범위 숫자 타입으로의 대입은
         * 따로 형을 명시하지 않아도 형변환이 자동으로일어난다.
         * -> 자동형변환, 묵시적 형변환
         */
    }
}
