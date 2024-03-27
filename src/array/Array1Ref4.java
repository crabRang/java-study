package array;

public class Array1Ref4 {
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50}; //배열 선언과 함께 사용시 new int[]생략가능
        /*
        int[] students;
        students = {90, 80, 70, 60, 50} 이건 불가능
         */
        //이제 학생의 점수를 추가해도 { }내부의 내용만 변경하고 나머지 코드는 변셩하지 않아도 된다.

        for(int i=0; i<students.length; i++){
            System.out.println("학생 "+(i+1)+" 점수 : "+students[i]);
        }
    }
}
