package operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        /*
        문제3.
            int형 변수 score를 선언하고, 80이상이고 100점이하이면 true출력 / 이외 false출력
         */
        int score = 100;
        boolean result = 80 <= score &&  score <= 100;
        System.out.println(result);
    }
}
