package scope;

public class Scope1 {
    public static void main(String[] args) {
        /*
        * 지역 변수 : 특정 지역에서만 사용할 수 있는 변수, 그 특정 지역을 벗어나면 사용할 수 없다
        * 지역 : 변수가 선언된 코드블록 { }
        * scope : 범위, 변수의 접근 가능한 범위
        * */
        int m = 10; //m생존 시작
        if(true){
            int x = 20; //x생존 시작
            System.out.println("if m = "+m); //블록 내부에서 외부는 접근 가능, main{ if{ } }
            System.out.println("if x = "+x);
        }  //x 생존 종료
        //System.out.println("if x = "+x); //오류, 변수 x에 접근 불가
        System.out.println("if m = "+m);
    }//m생존 종료
    //int m은 main{}전체에서 접근할 수 있기 때문에 스코프가 넓다.
    //int x는 if{}코드블록 안에서만 접근할 수 있기 때문에 스코프가 좁다.
}
