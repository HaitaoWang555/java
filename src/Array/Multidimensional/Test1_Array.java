package Array.Multidimensional;

public class Test1_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};

        for (int i = 0;i < arr.length ;i++ ) {			//获取到每个二维数组中的一维数组
            for (int j = 0;j < arr[i].length ;j++ ) {	//获取每个一维数组中的元素
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
