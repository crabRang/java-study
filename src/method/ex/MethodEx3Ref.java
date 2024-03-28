package method.ex;

public class MethodEx3Ref {
    /*
     *  문제3. 입출금 리펙토링
     *  입금(deposit)과, 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
     */
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withraw(balance, 2000);

        System.out.println("최종 잔액 : "+balance+"원");
    }

    //입금
    public static int deposit(int balance, int price){
        balance += price;
        System.out.println(price+"원을 입금하였습니다. 현재 잔액 : "+balance+"원");
        return balance;
    }

    //출금
    public static int withraw(int balance, int price){
        if(balance >= price){
            balance -= price;
            System.out.println(price+"원을 출금하였습니다. 현재 잔액 : "+balance+"원");
        }else{
            System.out.println(price+"원을 출금하려 했으나, 잔액이 부족합니다. 현재 잔액 : "+balance+"원");
        }
        return balance;
    }

    //로직이 나눠져있기 때문에 유지보수가 용이하다.
    //이런 리펙토링을 메서드 추출이라고 한다. 재사용뿐만이 아니라 구조적으로 읽기 쉽고 유지보수가 용이하다.
}
