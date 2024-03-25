package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        /*
         * do~while문
         * do{ 코드 }while(조건식);
         *  : while문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행.
         */
        int i = 10;
        while(i < 3){
            System.out.println("현재 숫자는 : "+i);
            i++;
        }
        //조건이 거짓이기 때문에 안의 코드가 실행x
    }
}
