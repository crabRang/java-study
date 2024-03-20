package variable;

public class Var6 {
    public static void main(String[] args) {
        //변수는 반드시 초기화하고 사용해야한다.
        int a;
        //System.out.println(a); //주석을 풀면 컴파일 에러발생
        //컴파일 에러가 발생하여 컴파일되지 않았으므로 out폴더에 build파일도 생성되지 않는다.
        //error : variable a might not have been initialized - 변수가 초기화 되지 않았다는 오류
        /*
            컴퓨터에서 메모리는 여러 시스템이 함께 사용하는 공간이다. 그래서 어떠한 값들이 계속 저장된다.
            변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다. 그런데 그 공간에 기존에 어떤 값이 있었는지는 알 수 없다.
            따라서 초기화를 하지 않으면 이상한값이 출력될 수 있기 때문에 자바는 변수를 초기화하도록 강제한다.
        */
    }
}
