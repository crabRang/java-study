package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        /*
         * 배열 : 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것
         */

        //배열을 사용하려면 배열을 생성해야한다.
        int[] students; //배열변수선언, int형 변수를 5개 담을 수 있는 배열

        //총 5개의 int형 변수가 만들어진다.
        students = new int[5]; //배열생성, 자바는 배열을 생성할 때 내부값을 자동으로 초기화
        //초기화: int - 0, boolean - false, String - null

        /*
         * new int[5]로 배열을 생성하면, 배열의 크기만큼 메모리를 확보
         * -> int형 5개를 사용하면 4byte * 5 = 20byte확보
         * 배열을 생성하고나면 자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)를 반환한다.
         * int[] students 변수는 new int[5]로 생성한 배열의 참조값을 가지고 있는 것.
         */
        System.out.println("students 변수 : "+students); //[I@b4c966a : I - int, 16진수 - 참조값

        //변수 값 대입
        students[0] = 90; //배열에 값을 대입
        // -> 변수에 있는 참조값을 통해 실제 배열에 접근
        // -> 인덱스를 사용해서 해당 위치의 요소에 접근
        // -> 값을 대입
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생 1 점수 : "+students[0]);
        //1. 변수값 읽기
        //2. 변수에 있는 참조값을 통해 실제 배열에 접근, 인덱스를 사용해서 해당 위치의 요소에 접근
        //3. 배열의 값을 읽어옴
        System.out.println("학생 2 점수 : "+students[1]);
        System.out.println("학생 3 점수 : "+students[2]);
        System.out.println("학생 4 점수 : "+students[3]);
        System.out.println("학생 5 점수 : "+students[4]);
    }
}
