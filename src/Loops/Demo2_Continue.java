package Loops;

public class Demo2_Continue {
    public static void main(String[] args) {
        for (int x = 1;x <= 10 ;x++ ) {
            if (x == 4) {
                continue;							//终止本次循环,继续下次循环
            }

            System.out.println("x = " + x);
        }
    }
}
