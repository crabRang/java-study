package method;

public class Overloading1 {
    /*
     *  메서드 오버로딩
     * -- 두 수를 더하는 메서드 / 세 수를 더하는 메서드
     * -- 둘 다 더하는 메소드이기 때문에 같은 이름(add)를 사용하고 싶다
     * -- 메서드 이름뿐만아니라 매개변수 정보를 함께 사용해서 메서드를 구분
     *
     *  메서드 시그니처
     * -- 메서드 시크니처 = 메서드 이름 + 매개변수 타입(순서)
     * -- 메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻함
     * -- 쉽게 말해서 메서드를 구분할 수 있는 기준
     * -- 자바입장에서는 메서드를 고유하게 구분할 수 있어야 어떤 메서드를 호출할 지 결정할 수 있다.
     * -- 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다.(반환타입은 포함X)
     */

    //매개변수의 갯수가 다른 오버로딩
    public static void main(String[] args) {
        System.out.println("1 : "+add(1,2));
        System.out.println("2 : "+add(1,2, 3));
    }

    //1번 메서드 : 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    //2번 메서드 : 세 정수를 받아서 합을 반환한다.
    //첫번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a + b + c;
    }
}
