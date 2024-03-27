package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        /*
         * 문제9. 상품관리 프로그램
         * 상품등록 : 상품의 이름과 가격을 입력받아 저장한다.
         * 상품목록 : 지금까지 등록한 모든 상품의 목록을 출력한다
         *
         * [ 동작 ]
         * 1. 첫화면에서 사용자에게 3가지 선택을 제시한다 ( 1. 상품등록, 2. 상품목록, 3. 종료)
         * -- 1. 상품등록 : 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
         * -- 2. 상품목록 : 배열에 저장된 모든 상품을 출력한다.
         * -- 3. 종료 : 프로그램을 종료한다.
         *
         * 제약조건 : 상품은 최대 10개까지 등록할 수있다.
         *
         * 사용해야 하는 변수 및 구조
         * -- Scanner scanner : 사용자 입력을 받기위한 Scanner 객체
         * -- String[] productNames : 상품이름을 저장할 String 배열
         * -- int[] productPrices : 상품가격을 저장할 int 배열
         * -- int productCount : 현재 등록된 상품의 개수를 저장할 int 변수
         */
        Scanner sc = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts]; //상품이름
        int[] productPrices = new int[maxProducts]; //상품가격
        int productCount = 0; //상품개수

        while(true){
            System.out.println("[ 1. 상품등록 | 2. 상품목록 | 3. 종료 ]");
            System.out.print("메뉴를 선택하세요 : ");
            int option = sc.nextInt();
            sc.nextLine();

            if(option == 1){
                if(productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = sc.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = sc.nextInt();

                productCount++;
            }else if(option == 2){
                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i=0; i<productCount; i++){
                    System.out.println(productNames[i]+" : "+productPrices[i]+"원");
                }
            }else if(option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("올바른 메뉴를 선택해 주세요.");
            }
        }
    }
}
