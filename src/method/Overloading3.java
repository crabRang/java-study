package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1 : "+add(1, 2));
        System.out.println("2 : "+add(1.2, 1.5));
    }

    // 이 메서드가 없어도 int는 double로 자동형변환이 되기 때문에
    // 2번메서드에 1.0/2.0으로 형변환되어 들어간다.
    public static int add(int a, int b){
        System.out.println("1번호출");
        return a + b;
    }
    public static double add(double a, double b){
        System.out.println("2번호출");
        return a + b;
    }

    // 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고,
    // 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다.
}
