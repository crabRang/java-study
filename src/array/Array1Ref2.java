package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        /*
         * 배열의 리펙토링
         * 리펙토링 : 기존의 코드기능은 유지하면서, 내부 구조를 개선하여 가독성을 높이고 유지보수를 용이하게 하는 과정.
         * 중복제거, 복잡성줄이기, 이해하기 쉬운 코드로 만들기 위해 수행
         * 리펙토링은 버그를 줄이고, 프로그램의 성능을 향상시킬 수도 있으며 코드설계를 개선하는데 도움이된다.
         * -> 작동하는 기능은 똑같은데, 코드를 개선하는 것
         */

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;


        for(int i=0; i<students.length; i++){ //배열변수.length : 배열의 길이
            System.out.println("학생 "+(i+1)+" 점수 : "+students[i]);
        }
        /*
            System.out.println("학생 1 점수 : "+students[0]);
            System.out.println("학생 2 점수 : "+students[1]);
            System.out.println("학생 3 점수 : "+students[2]);
            System.out.println("학생 4 점수 : "+students[3]);
            System.out.println("학생 5 점수 : "+students[4]);
         */
    }
}
