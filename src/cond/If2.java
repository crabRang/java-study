package cond;

public class If2 {
    public static void main(String[] args) {
        //if ~ else
        int age = 20;

        if(age >= 18) {
            //조건이 참일 때 실행되는 코드
            System.out.println("성인입니다.");
        }else { //else문은 if문에서 만족하는 조건이 없을 때 실행하는 코드를 제공
            //만족하는 조건이 없을 때 실행되는 코드
            System.out.println("미성년자 입니다.");
        }
    }
}
