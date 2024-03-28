package method;

public class MethodCasting2 {
    /*
     *  메서드와 형변환
     *  : 메서드를 호출할 때도 형변환이 적용된다.
     */
    //자동형변환
    public static void main(String[] args) {
        int number = 1;
        printNumber(number); // int에서 double로 자동형변환
    }
    public static void printNumber(double n){
        System.out.println("숫자 : "+n);
    }
}
