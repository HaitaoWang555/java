package Loops;

public class Demo1_Break {
    public static void main(String[] args) {
        for (int x = 1;x <= 10 ;x++ ) {
            if (x == 4) {
                break;	//跳出循环
            }
            System.out.println("x = " + x);
        }
    }
}
