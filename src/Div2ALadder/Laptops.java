package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Laptops {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[][] arr = new int[n][2];
//        int i = 0;
//        while (i < n) {
//            int a = fr.nextInt();
//            int b = fr.nextInt();
//            arr[i][0] = a;
//            arr[i][1] = b;
//            i++;
//        }
//        sort2dArray(arr);
////        for (int[] a : arr) {
////            System.out.println(Arrays.toString(a));
////        }
//        boolean flag = false;
//        for (int j = 0; j < n; j++) {
//            if (j != n - 1 && arr[j][1] > arr[j + 1][1] && arr[j][0] < arr[j + 1][0]) {
//                flag = true;
//                break;
//            }
//        }
        //Very Easy Editorial Solution
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int a = fr.nextInt();
            int b = fr.nextInt();
            if (a != b) {   //Since all b are distinct
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Happy Alex");
        } else {
            System.out.println("Poor Alex");
        }
    }

    private static void sort2dArray(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] < o2[1]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
