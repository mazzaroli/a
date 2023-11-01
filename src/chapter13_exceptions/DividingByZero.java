package chapter13_exceptions;

public class DividingByZero {
    public static void main(String[] args) {
        dividingZeroHandling();
    }
    public static void dividingZeroHandling(){
        try {
            int c = 30/0;
        } catch (ArithmeticException e){
            System.out.println("Division by Zero its not allowerd");
        } finally {
            System.out.println("Division is fun");
        }

    }
}
