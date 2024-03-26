package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if(m > 0){
            int temp = m * 2;
            System.out.println("temp = "+temp);
        }
        System.out.println("m = "+m);
    }
    /*
     * temp의 스코프를 if문 내로 변경했기때문에 temp메모리를 빨리 제거
     * -> 메모리를 효율적으로 사용, temp변수를 생각하는 범위를 줄여서 유지보수 하기에 좋음
     */
}
