package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4_1 {
    public static void main(String[] args) {
        /*
         * 문제10. 사용자로부터 상품정보를 입력받고, 총가격을 출력하는 프로그램 작성(if)
         * 사용자 옵션(option) 1:상품입력, 2:결제, 3:프로그램종료
         * 1. 상품입력 : 상품명, 가격, 수량 입력
         * 2. 결제 : 총 비용을 출력하고 0으로 초기화(결제했다고 가정)
         * 3. 종료 : "프로그램을 종료합니다" 출력
         * 4. 그외 : "올바른 옵션을 선택해주세요." 출력
         */
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;

        while(true){
            System.out.println("1 : 상품입력, 2 : 결제, 3 : 프로그램 종료");
            int option = sc.nextInt();

            if(option == 1){
                sc.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                String product = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = sc.nextInt();

                totalPrice += (price * quantity);

                System.out.println("상품명 : "+product+" 가격 : "+price+" 수량 : "+quantity+" 합계 : "+(price * quantity));

            }else if(option == 2){
                System.out.println("총 합계 : "+totalPrice);
                totalPrice = 0;
            }else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }

        }

    }
}
