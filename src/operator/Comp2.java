package operator;

public class Comp2 {
    public static void main(String[] args) {
        /*
        문자열 비교
        문자열을 비교할 때 == 을 사용하면 성공할때도 있고, 실패할때도 있다
        문자열을 비교할 때는 .equals() 메서드를 사용한다.
        */
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열변수와 리터럴 비교
        boolean result3 = str1.equals(str2); //문자열변수와 문자열변수 비교

        System.out.println("result1 = "+result1);
        System.out.println("result2 = "+result2);
        System.out.println("result2 = "+result3);
    }
}
