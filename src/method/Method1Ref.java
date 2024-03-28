package method;

public class Method1Ref {
    public static void main(String[] args) {
        /*
         * 메서드 : 함수의 한 종류, 필요한 기능을 미리 정의해두고 필요할 때마다 호출해서 사용
         */
        int sum1 = add(5, 10); //메서드 호출
        System.out.println("결과 1 출력 = "+sum1);

        int sum2 = add(15, 20);
        System.out.println("결과 2 출력 = "+sum2);
        /*
         * 메서드 호출
         * -- 메서드를 호출할 때는 메서드에 넘기는 값과, 메서드 매개변수의 타입과 갯수가 맞아야한다.
         * -- 호출단 : call("hello", 10) / 메서드정의 : int call(String str, int age)
         * -- 인수(Argument) : "hello", 10를 의미한다. 아규먼트, 인수, 인자로 표현
         *                    들어가는 수, 메서드 내부로 들어가는 값을 의미
         * -- 매개변수(parameter) : String str, int age와 같은 메서드를 정의할 때 선언한 변수
         *                        메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입왼다.
         *                        중간에서 전달하는 변수, 메서드 호출부와 메서드 내부 사이에서
         *                        값을 전달하는 역할을 하는 변수
         */

    }

    //add 메서드, 제어자 반환타입 메서드이름(매개면수 목록){ 메서드본문 }
    public static int add(int a, int b){ //메서드 선언
        /*
         * public : 제어자, 다른 클래스에서 호출할 수 있음
         * static : 객체를 생성하지 않고 호출 할 수 있는 정적 메서드
         * int : 반환(return)타입
         * (int a, int b) : 파라미터, 메서드 선언에 사용되는 변수(입력값이 필요없으면 매개변수 지정X)
         */

        //메서드 본문 : { }코드블럭
        /*
         * 메서드가 수행해야 하는 코드블럭
         * 메서드를 호출하면 메서드 본문이 순서대로 실행된다.
         * 메서드를 호출하는 곳에서는 메서드선언은 알지만 메서드 본문은 모른다.
         * 실행결과를 반환하려면 return문 다음에 반환할 결과를 적어주면 된다.
         */
        System.out.println(a+" + "+b+" 연산 수행");
        int sum = a+b;
        return sum;
    }
}
