package method.ex;

public class MethodEx2 {
    /*
     *  문제2. 반복출력 리펙토링
     *  메서드를 사용해서 리펙토링 해보자
     */
    public static void main(String[] args) {
        String message = "hello, world!";

        for(int i=0; i<3; i++){
            System.out.println(message);
        }

        for(int i=0; i<5; i++){
            System.out.println(message);
        }

        for(int i=0; i<7; i++){
            System.out.println(message);
        }
    }
}
