package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        /*
         * 문제2. 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램
         *  거리 1km 이하 : "도보"
         *  거리 10km 이하 : "자전거"
         *  거리 100km 이하 : "자동차"
         *  거리 100km 초과 : "비행기"
         *  출력 : ㅇㅇ을 이용하세요.
         */
        int distance = 5;

        if(distance <= 1){
            System.out.println("도보를 이용하세요.");
        }else if(distance <= 10){
            System.out.println("자전거를 이용하세요.");
        }else if(distance <= 100){
            System.out.println("자동차를 이용하세요.");
        }else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
