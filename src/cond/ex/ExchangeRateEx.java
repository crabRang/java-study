package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        /*
         * 문제3. 특정 금액을 미국달러에서 한국 원으로 변환하는 프로그램 (환욜은 1달러당 1,300원)
         *  달러가 0미만 : "잘못된 금액입니다."
         *  달러가 0 : "환전할 금액이 없습니다."
         *  달러가 0이상 : "환전금액은 (계산된 원화 금액)원 입니다."
         */
        int dollar = 3;

        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        }else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else{
            System.out.println("환전 금액은 "+(dollar * 1300)+"원 입니다");
        }
    }
}
