package loop;

public class For2 {
    public static void main(String[] args) {
        //문제 : i부터 하나씩 증가하는 수를 endNum까지 더해라(i ~ endNum 더하기) - for문
        int sum = 0;
        int endNum = 3;

        //1+2+3
        for(int i=1; i<=endNum; i++){
            sum += i;
            System.out.println("i : "+i+", sum : "+sum);
        }
        //while문과 비교해보면 for문이 좀더 간결한걸 확인할 수 있다.
        //for문은 초기화, 조건검사, 반복후 작업(증감식)이 한줄에 작성되기 때문
    }
}
