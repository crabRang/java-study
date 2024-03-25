package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        /*
         * 문제1. 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램
         * 90이상 : "A"
         * 80이상 90미만 : "B"
         * 70이상 80미만 : "C"
         * 60이상 70미만 : "D"
         * 60미만 : "F"
         */
        int score = 50;

        if(score >= 90){
            System.out.println("학점은 A입니다.");
        }else if(80 <= score && score < 90){
            System.out.println("학점은 B입니다.");
        }else if(70 <= score && score < 80){
            System.out.println("학점은 C입니다.");
        }else if(60 <= score && score < 70){
            System.out.println("학점은 D입니다.");
        }else{
            System.out.println("학점은 F입니다");
        }
    }
}
