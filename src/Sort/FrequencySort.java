package Sort;

import java.util.Arrays;

public class FrequencySort {

    public static void main(String[] args) {
        int[] x = {1,55,33,38,7,9,51,3,18,47};
        int n = x.length;

        int max = x[0]; // 최댓값
        for (int i = 1; i < n; i++) {
            if (x[i] > max) max = x[i];
        }

        sort(x, n, max);

        println("====finished====");
        println(Arrays.toString(x));
    }

    static void sort(int[] a, int n, int max) {
        int[] f = new int[max + 1]; // 도수분포표
        int[] b = new int[n];       // 목적배열

        for (int i = 0; i < n; i++) f[a[i]]++;                  // 도수분포표
        for (int i = 1; i <= max; i++) f[i] += f[i - 1];        // 누적도수분포표
        for (int i = n - 1; i >= 0; i--) b[--f[a[i]]] = a[i];   // 목적배열
        for (int i = 0; i < n; i++) a[i] = b[i];
    }

    static void println(String txt) {
        System.out.println(txt);
    }

    static void println(int txt) {
        System.out.println(txt);
    }
}
