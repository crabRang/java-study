package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("[ 프로그램 동작 ]");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("[ 프로그램을 시작합니다. ]");
        return; //void의 경우 생략 가능
    }

    public static void printFooter(){
        System.out.println("[ 프로그램을 종료합니다. ]");
    }
    /*
     * 매개변수가 없는 경우
     * -- 선언 : public static void printHeader()와 같이 매개변수를 비워두고 정의하면 된다.
     * -- 호출 : printHeader();와 같이 인수를 비워두고 호출하면 된다.
     * 반환타입이 없는 경우
     * -- 선언 : public static void printHeader()와 같이 반환 타입을 void로 정의하면 된다.
     * -- 호출 : printHeader();와 같이 메서드만 호출하고 반환 값을 받지 않으면 된다.
     *          String str = printHeader(); 처럼 반환값을 받으면 컴파일오류 발생
     * 모든 메서드는 항상 return을 호출해야한다. 그런데 반환타입 void의 경우에는 생략가능.
     * 반환 타입이 없는경우에는 return을 마지막줄에 넣어준다. return을 만나면 해당 메서드 종료.
     */
}
