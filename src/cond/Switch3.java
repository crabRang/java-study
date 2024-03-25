package cond;

public class Switch3 {
    public static void main(String[] args) {
        //Switch문에 break가 없는 경우
        int grade = 2;
        int coupon;

        //switch문의 조건식은 참/거짓으로 결과가 나오는 조건이 아니어도 된다
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                //break가 없으면 case 2인경우를 실행 후 빠져나가지 않고 다음문장(case:3)을 실행한다.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : "+coupon);
    }
}
