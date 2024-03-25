package cond;

public class Switch1 {
    public static void main(String[] args) {
        /*
         * 문제 : 등급에 따라 다른 쿠폰을 발급하는 프로그램
         * 1등급 : 쿠폰 1,000
         * 2등급 : 쿠폰 2,000
         * 3등급 : 무폰 3,000
         * 위의 등급이 아닐 경우 : 쿠폰 500
         * 각 쿠폰이 할당된 후에는 "발급받은 쿠폰 "+쿠폰값을 출력
         */
        //if문 ver
        int grade = 2;
        int coupon;

        if(grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : "+coupon);
        //위 경우 switch문을 사용하면 좀 더 편하게 사용할 수 있다.
    }
}
