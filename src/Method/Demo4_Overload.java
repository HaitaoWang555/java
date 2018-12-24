package Method;

public class Demo4_Overload {
    public static void main(String[] args) {
        double sum1 = add(10,20.1);
        System.out.println(sum1);

        int sum2 = add(10,20,30);
        System.out.println(sum2);

        double sum3 = add(12.3,13);
        System.out.println(sum3);

        boolean b1 = isEquals(10,10);
        System.out.println(b1);

        boolean b2 = isEquals(10.5,10.5);
        System.out.println(b2);
    }

    /*
        重载:方法名相同,参数列表不同,与返回值类型无关
        重载的分类
        1,参数个数不同
        2,参数类型不同
        3,参数顺序不同
    */

    public static double add(int a,double b) {
        return a + b;
    }


    public static int add(int a,int b,int c) {
        return a + b + c;
    }

    public static double add(double a,int b) {
        return a + b;
    }

    public static boolean isEquals(int a,int b) {
        return a == b;
    }

    public static boolean isEquals(double a,double b) {
        return a == b;
    }
}
