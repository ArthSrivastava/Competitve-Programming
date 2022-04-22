package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/1529/B
public class SifidAndStrangeSubsequences {
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
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] arr = new long[n];
            int count = 0;
            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextLong();
                if (arr[i] <= 0) {
                    count++;
                } else if (arr[i] < min) {
                    min = arr[i];
                }
            }
            Arrays.sort(arr);
            long minDiff = Long.MAX_VALUE - 1;
            for (int i = 0; i < n; i++) {
                if (i < n - 1 && arr[i + 1] <= 0) {
                    minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
                }
            }
            if (min <= minDiff) {
                count++;
            }
            System.out.println(count);
        }
    }
}
