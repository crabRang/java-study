package method.ex;

public class MethodEx3 {
    /*
     *  문제3. 입출금 리펙토링
     *  입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
     */
    public static void main(String[] args) {
        int balance = 10000;

        //입금 1000
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount+"원을 입금하였습니다. 현재 잔액 : "+balance+"원");

        //출금 2000
        int withrawAmount = 2000;
        if(balance >= withrawAmount){
            balance -= withrawAmount;
            System.out.println(withrawAmount+"원을 출금하였습니다. 현재 잔액 : "+balance+"원");
        }else{
            System.out.println(withrawAmount+"원을 출금하려 했으나, 잔액이 부족합니다.");
        }

        System.out.println("최종 잔액 : "+balance+"원");
    }
}
