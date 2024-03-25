package cond;

public class If4 {
    public static void main(String[] args) {
        //if~else if 문
        int age = 14;
        
        if(age <= 7){
            System.out.println("미취학");
        }else if(age <= 13){
            System.out.println("초등학생");
        }else if(age <= 16){
            System.out.println("중학생");
        }else if(age <= 19){
            System.out.println("고등학생");
        }else{
            System.out.println("성인");
        }

        /*
        1. if문을 각각 사용하는 경우 : 독립조건일 때
        2. if ~ else if문을 사용하는 경우 : 서로 연관된 조건이어서, 하나로 묶을 때
         */
    }
}
