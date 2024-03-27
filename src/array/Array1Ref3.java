package array;

public class Array1Ref3 {
    public static void main(String[] args) {

        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; //배열의 생성과 초기화
    /*
        students = new int[5];
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
    */


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
