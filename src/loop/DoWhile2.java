package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        /*
         * do~while문
         * do{ 코드 }while(조건식);
         *  : while문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행.
         */
        int i = 10;
        do{
            System.out.println("현재 숫자는 : "+i);
            i++;
        } while(i<3);
        //조건과 상관없이 코드블럭이 한번 실행된다.
        //한번 실행 후 조건이 거짓이기 때문에 do~while문을 빠져나온다.
    }
}
