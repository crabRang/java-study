package loop;

public class While2_2 {
    public static void main(String[] args) {
        // 문제 : i부터 하나씩 증가하는 수를 3번 더해라(i ~ i+2 더하기)
        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("i = "+i+", sum = "+sum);
        i++;

        sum = sum + i;
        System.out.println("i = "+i+", sum = "+sum);
        i++;

        sum = sum + i;
        System.out.println("i = "+i+", sum = "+sum);
        i++;

        //i의 값만 변경하면 되기때문에, 기존코드보다는 변경점이 적다.
    }
}
