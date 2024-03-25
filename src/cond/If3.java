package cond;

public class If3 {
    public static void main(String[] args) {
        /*
        * 문제 : 연령에 따라 다른 메세지를 출력하는 프로그램
        * ~ 7 : "미취학"
        * 8 ~ 13 : "초등학생"
        * 14 ~ 16 : "중학생"
        * 17 ~ 19 : "고등학생"
        * 20 ~ : "성인"
        * */
        int age = 14;

        if(age <= 7){
            System.out.println("미취학");
        }
        if(8 <= age && age <= 13){
            System.out.println("초등학생");
        }
        if(14 <= age && age <= 16){
            System.out.println("중학생");
        }
        if(17 <= age && age <= 19){
            System.out.println("고등학생");
        }
        if(age >= 20){
            System.out.println("성인");
        }

        /*
        위 코드의 단점
        1. 불필요한 조건 검사 : 이미 참인 결과가 있는데 다른 if문도 검사를 해야함
        2. 코드 효율성 : 조건을 중복 체크
                       만약 나이가 8살인경우
                       age <= 7을 통해 검사를 했음에도 8 <= age에서 한번더 검사를 진행
        -> 이런 코드에 else if문을 사용하여 코드 효율성 향상
         */
    }
}
