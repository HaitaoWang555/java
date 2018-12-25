package Array.Multidimensional;

public class Demo4_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}}; //这是一个二维数组,这个二维数组中每个大括号都代表一个一维数组
        System.out.println(arr);				//[[I@19bb25a,二维数组的地址值
        System.out.println(arr[0]);				//[I@da6bf4,一维数组的地址值
        System.out.println(arr[0][0]);			//1,一维数组中的元素值
    }
}
