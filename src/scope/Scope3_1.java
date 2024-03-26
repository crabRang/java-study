package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        /*
         * 스코프의 존재 이유
         */
        int m = 10;
        int temp = 0;
        if(m > 0){
            temp = m * 2;
            System.out.println("temp = "+temp);
        }
        System.out.println("m = "+m);
        /*
         * int temp는 if문 내부에서만 임시로 사용하기 때문에
         * 코드가 복잡해지고, 메모리 사용이 비효율적이다.
         *  1. 비효율적인 메모리 사용 : temp변수가 main() 코드블록이 종료될 떄 까지 메모리에 유지
         *  2. 코드 복잡성 증가 : if에서만 사용되는 데 main() 코드블럭 내내 temp를 신경써주어야 함.
         */
    }
}
