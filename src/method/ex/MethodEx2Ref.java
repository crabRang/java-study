package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "hello, world!";
        printMessage("hello, world!", 3);
        printMessage("java", 5);
        printMessage(message, 7);

    }
    public static void printMessage(String message, int times){
        for(int i=0; i<times; i++){
            System.out.println(message);
        }
    }
}
