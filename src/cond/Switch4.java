package cond;

public class Switch4 {
    public static void main(String[] args) {
        //자바14부터 사용할 수 있는 새로운 switch문
        //기존 switch문의 코드를 좀더 깔끔하게 바꾼 것
        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 : "+coupon);
    }
}
