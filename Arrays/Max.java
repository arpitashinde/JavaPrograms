package Arrayprograms;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 252, 44, 3, 5, 6};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,2,4));
    }

    static void swap(int[] arr,int i1,int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public static int maxrange(int[] arr, int start, int end) {
        int max1 = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        return max1;
    }

    public static void rev(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            swap(arr,start, end);
            start++;
            end--;
        }

    }
    public static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}

