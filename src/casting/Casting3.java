package casting;

public class Casting3 {
    public static void main(String[] args) {
        /*
         * 형변환을 할 때 작은 숫자가 표현할 수 있는 범위를 넘어설 경우
         */
        long maxIntValue = 2147483647; //int의 최고값
        long maxIntOver = 2147483648L; //int의 최고값 + 1 (초과)
        // 리터널의 범위 - int, 초과했기 때문에 리터럴에 L을 붙여줘야함
        int intValue = 0;

        intValue = (int)maxIntValue; //형변환
        System.out.println("maxIntValue casting = "+intValue); //2147483647

        intValue = (int)maxIntOver; //형변환
        System.out.println("maxIntOver = "+intValue); //-2147483648
        /*
         * int로 표현할 수 있는 범위를 넘기 때문에,
         * long -> int 형변환 시 문제발생
         * 오버플로우 : 기존 범위를 초과해서 표현하게 되면 전혀 다른 숫자가 표현됨
         * 오버플로우가 발생하지 않도록 해야함
         */
    }
}
