package Array;

public class Demo8_Array {
    public static void main(String[] args) {
        int[] arr2 = {3,4,5};
        print(arr2);
    }

    public static void print(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        for (int i = 0;i < arr.length ;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
}
