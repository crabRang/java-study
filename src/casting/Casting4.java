package casting;

public class Casting4 {
    public static void main(String[] args) {
        /*
         * 형변환은 대입 뿐만 아니라, 계산을 할 때도 발생
         * 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
         *  : int + int = int, double + double = double
         * 2. 서로 다른 타입의 계산은 큰 범위로 자동형변환이 일어난다.
         *  : int + double -> double + double, int + long -> long + long
         */
        int div1 = 3/2; // int/int = int 결과가 int이기 때문에 1
        System.out.println("div1 = "+div1); //1

        double div2 = 3/2; // int/int이지만 double에 대입하였기 때문에 double
        System.out.println("div2 = "+div2); //1.0

        double div3 = 3.0/2; // double/int -> 작은범위인 int가 큰범위인 double로 형변환
        System.out.println("div3 = "+div3); //1.5

        double div4 = (double)3/2; //명시적 형변환 사용. (double)int / int
        System.out.println("div4 = "+div4); //1.5

        //변수를 사용하는 경우에도 형변환을 할 수 있다.
        int a = 3;
        int b = 2;
        double result = (double) a / b; // double / int이므로 더 큰 범위로 형변환
        System.out.println("result = "+result); //1.5
    }
}
