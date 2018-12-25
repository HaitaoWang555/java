package Array;

public class Demo7_Exception {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // java.lang.ArrayIndexOutOfBoundsException
        // 当访问数组中不存在的索引,会出现索引越界异常
        // System.out.println(arr[-1]);

        arr = null;                     // java.lang.NullPointerException
        System.out.println(arr[0]);		// 当数组引用赋值为null,再去调用数组中的元素就会出现空指针异常
    }
}
