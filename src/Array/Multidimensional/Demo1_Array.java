package Array.Multidimensional;

public class Demo1_Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
		/*
		这是一个二维数组
		这个二维数组中有3个一维数组
		每个一维数组中有2个元素

		[[I@19bb25a									//二维数组的地址值
		[I@da6bf4									//一维数组的地址值
		0											//元素值
		*/
        System.out.println(arr);					//二维数组
        System.out.println(arr[0]);					//二维数组中的第一个一维数组
        System.out.println(arr[0][0]);				//二维数组中的第一个一维数组的第一个元素
    }
}
