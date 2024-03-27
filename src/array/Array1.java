package array;

public class Array1 {
    public static void main(String[] args) {
        /*
        배열의 필요성
        : 학생의 점수를 출력하는 간단한 프로그램(배열x)
         */
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        //학생추가
        int student6 = 40;

        System.out.println("학생 1 점수 : "+student1);
        System.out.println("학생 2 점수 : "+student2);
        System.out.println("학생 3 점수 : "+student3);
        System.out.println("학생 4 점수 : "+student4);
        System.out.println("학생 5 점수 : "+student5);
        System.out.println("학생 6 점수 : "+student6);

        //학생을 추가하려면 코드를 추가해야한다.
        //-> 학생 수가 100명이라면 비슷한 변수를 반복해서 추가해야함.
        //-> 변수명을 바꿀 수 없으므로 반복문도 불가능
        //-> 이 문제를 해결하기 위해 배열을 사용
    }
}
