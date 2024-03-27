package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        /*
         * 향상된 for문
         * for( 변수 : 배열 또는 컬렉션){ }
         */

        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for(int i=0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println();

        //향상된 for문, for-each문
        for(int number : numbers){
            System.out.println(number);
        }
        /*
         * 향상된 for문은 배열의 인덱스를 사용하지않고, 종료 조건을 주지 않아도 된다.
         * -> 단순히 해당 배열을 처음부터 끝까지 탐색
         * :의 오른쪽에 탐색할 배열을 선택하고, :왼쪽에 있는 number에 담는다
         * numbers 배열의 끝에 도달해서 더이상 값이 없으면 종료
         * 단축어 : iter 을 누르면 자동으로 변수 : 배열이 들어가짐
         */

        //for-each문을 사용할 수 없는 경우 : index값이 필요할 때
        for(int i=0; i < numbers.length; i++ ){
            System.out.println("number "+i+" 번의 결과는"+numbers[i]);
            //증가하는 i값을 출력해야 하므로 for-each대신 for문을 사용하는것이 좋다.
        }
    }
}
