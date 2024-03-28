package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    /*
     *  문제4. 은행 계좌 입출금
     *  -- 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
     *  -- 출금 시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0; //현재잔액

        while(true){
            System.out.println("----------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("----------------------------------------");
            System.out.print("선택 : ");
            int menu = sc.nextInt();
            int price;

            switch (menu){
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    price = sc.nextInt();
                    balance = deposit(balance, price);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    price = sc.nextInt();
                    balance = withdraw(balance, price);
                    break;
                case 3:
                    System.out.println("현재 잔액 : "+balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴를 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance, int price){
        balance += price;
        System.out.println(price+"원을 입금하였습니다. 현재 잔액 : "+balance+"원");
        return balance;
    }
    public static int withdraw(int balance, int price){
        if(balance >= price){
            balance -= price;
            System.out.println(price+"원을 출금하였습니다. 현재 잔액 : "+balance+"원");
        }else{
            System.out.println(price+"원을 출금하려 했으나, 잔액이 부족합니다. 현재잔액 : "+balance+"원");
        }
        return balance;
    }
}
