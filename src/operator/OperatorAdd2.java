package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;
        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = "+a+", b = "+b);
        //a의 값을 먼저 증가시켰기 때문에 a = 2, 그리고 그 a값을 b에 넣었기 때문에 b = 2

        //후위 증감 연산자 사용 예
        a = 1;
        b = 0;
        b = a++; //a의 현재값을 b에 먼저 대입하고, 그 후 a를 증가시킴
        System.out.println("a = "+a+", b = "+b);
        //a의 값이 먼저 b에 대입되었기 때문에 b = 1, 그 후 a의 값을 증감시켰기 때문에 a = 2;

        //증감연산자를 단독으로 사용하는 경우, 다른 연산이 없기때문에 본인의 값만 증가한다
        //따라서 전위, 후위 둘다 결과가 같다 ( a++, ++a )
    }
}
