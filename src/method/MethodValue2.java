package method;

public class MethodValue2 {
    public static void main(String[] args) {
       int number = 5;

       System.out.println("1. changeNumber 호출 전, number = "+number); //5
       changeNumber(number);
       System.out.println("4. changeNumber 호출 후,, number : "+number); //5
        /*
         *  main()에 정의한 변수와 메서드의 매개변수의 이름이 둘 다 number로 같다.
         *  main()도 사실은 메서드, 각각의 메서드 안에서 사용하는 변수는 소로 완전히 분리된 다른 변수
         *  즉, main()과 changeNumber() 의 number는 서로 다른 변수이다.
         */

    }
    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, number : "+number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number : "+number); //10
    }
}
