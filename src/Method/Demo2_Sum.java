package Method;

public class Demo2_Sum {
    public static void main(String[] args) {

        int sum = add(10,20);
        System.out.println(sum);

        //add(30,40);						//有返回值方法的单独调用,没有意义
        System.out.println(add(30,40));		//这样调用是可以,but如果需要用这个结果不推荐这样调用

    }

    /*
        如何写方法
        1,明确返回值类型
        2,明确参数列表
    */
    public static int add(int a,int b) {			//int a = 10,int b = 20
        int sum = a + b;
        return sum;									//如果有返回值必须用return语句带回
    }

}
