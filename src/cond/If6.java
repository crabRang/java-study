package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("10,000원 이상 구매 >> 1,000원 할인");
        } else if(age <= 10){
            discount += 1000;
            System.out.println("10살 이하 >> 1,000원 할인");
        } else{
            System.out.println("할인없음");
        }

        System.out.println("총 할인금액 : "+discount+" 원");

        // else if를 사용한 경우, 첫번째 조건이 참이 되었기 때문에 else if는 실행X

        //if문을 사용할 때 실행할 문장이 한줄이면 { }(중괄호)가 없어도 된다. 단, 두줄 이상이면 { }(중괄호)필요
        //일반적으로 가독성+유지보수성을 위해 한줄일 때도 중괄호를 사용한다.
    }
}
