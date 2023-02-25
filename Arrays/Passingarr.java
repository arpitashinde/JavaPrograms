package Arrayprograms;

import java.util.Arrays;

public class Passingarr {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7,8,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int arr[]){
        arr[0]=44;
    }
}
