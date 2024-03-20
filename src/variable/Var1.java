package variable; // 소속된 패키지를 선언해주어야 한다.

public class Var1 {
    public static void main(String[] args) {
        System.out.println(20); //변경 10 -> 20
        System.out.println(20); //변경 10 -> 20
        System.out.println(20); //변경 10 -> 20
        //출력값을 변경하고 싶을 경우 10으로 되어있는걸 모두 20으로 변경해주어야 한다.
        //사용자가 입력하고 싶은 값은 항상 바뀌기 때문에 어딘가에 값을 보관해두고 필요할 때 값을 꺼내서 읽을 수 있는 저장소가 필요
    }
}
