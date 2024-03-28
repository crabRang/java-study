package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        // return문을 만나면 그 즉시 메서드를 빠져나간다.
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age){
        if(age < 18){
            //18세 미만의 경우, 아래 출력문을 출력하고 return문을 만난다.
            //return을 만나면 다음로직을 수행하지않고 해당 메서드를 빠져나온다.
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }
        //18세 이상의 경우, 아래 출력문을 출력하고 메서드가 종료된다.
        //반환타입이 없는 void형이기 때문에 return을 생략할 수 있다.
        System.out.println(age+"살, 입장하세요.");
    }
}
