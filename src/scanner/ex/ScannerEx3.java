package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        /*
         * 문제3. 사용자로부터 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity)를 입력받아
         * 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
         * 음식의 총가격 : totalPrice = foodPrice * foodQuantity
         * 출력 : [음식이름][수량]개를 주문하셨습니다. 총 가격은 [총가격]원 입니다.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = sc.nextLine();

        System.out.print("음식의 가격을 입력해주세요 : ");
        int foodPrice = sc.nextInt();

        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName +" "+foodQuantity+"개를 주문하셨습니다. 총가격은 "+totalPrice+"원 입니다.");
    }
}
