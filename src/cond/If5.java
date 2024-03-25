package cond;

public class If5 {
    public static void main(String[] args) {
        /*
         * 문제 : 올라인 쇼핑몰 할인시스템
         * 1. 아이템 가격이 10,000원 이상일 때 1,000원 할인
         * 2. 나이가 10살 이하일 때 1,000원 할인
         * 핵심 - 한 사용자가 동시에 여러 할인을 받을 수 있음
         * 이런 경우 if문을 따로 사용
         */
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("10,000원 이상 구매 >> 1,000원 할인");
        }
        if(age <= 10){
            discount += 1000;
            System.out.println("10살 이하 >> 1,000원 할인");
        }

        System.out.println("총 할인금액 : "+discount+" 원");

        //이 코드에서는 각각 독립된 if문이 있기 때문에 해당하는 if문을 모두 적용
        //else if를 사용하면 첫번 째로 충족하는 조건만 할인이 적용되고, 나머지는 무시된다
    }
}
