package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        //반환타입 : 반환타입이 있는 메서드는 반드시 return을 사용해서 값을 반환해야한다.
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i){
        if(i % 2 == 1){
            return true;
        }else{
            //이부분이 없으면 return문이 누락되는 문제가 발생할 수 있어 컴파일오류 발생
            return false;
        }
    }
}
