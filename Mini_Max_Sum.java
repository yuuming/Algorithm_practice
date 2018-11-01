/**
 * Created by yuminakamura on 2018-11-01.
 */

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class Mini_Max_Sum {
    static int minSum = 0;
    static int maxSum = 0;
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        for(int i : arr) {
            System.out.println(i);
        }



        for (int i =0; i < arr.length-1; i++) {

            minSum = minSum + arr[i];
        }

        for (int i =1; i < arr.length; i++) {

            maxSum = maxSum + arr[i];

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        miniMaxSum(arr);
        System.out.println(minSum + " " + minSum);
    }
}
