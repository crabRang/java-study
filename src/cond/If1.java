package cond;

public class If1 {
    public static void main(String[] args) {
        //if문
        int age = 20;

        //if문은 특정조건이 참인지 확인하고, 그 조건이 참일경우 특정 코드블록을 실행한다.
        if(age >= 18){
            //조건이 참일 때 실행되는 코드
            System.out.println("성인입니다.");
        }
        if(age < 18){
            System.out.println("미성년자입니다.");
        }
    }
}
