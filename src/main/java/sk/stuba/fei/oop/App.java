package sk.stuba.fei.oop;

public class App {

    static int compare(int firstNum, int secondNum){
        if (firstNum > secondNum){
            return 1;
        }
        else if (firstNum == secondNum){
            return 0;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        int result = compare(4, 5);
        System.out.println(result);
    }
}
