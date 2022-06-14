package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TL {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int m = fr.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr1[i] = fr.nextInt();
            if(arr1[i] > max1) max1 = arr1[i];
            if(arr1[i] < min1) min1 = arr1[i];
        }
//        System.out.println(max1);
//        System.out.println(min1);
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            arr2[i] = fr.nextInt();
            if(arr2[i] < min2) min2 = arr2[i];
        }
        if (min1 * 2 > max1) {
            max1 += (min1 * 2 - max1);
        }
        if (max1 < min2) {
            System.out.println(max1);
        } else {
            System.out.println(-1);
        }
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
