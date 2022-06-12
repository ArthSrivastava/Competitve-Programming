package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumDifficulty {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n - 1; j++) {
                if (j != i - 1 && j != i && arr[j + 1] - arr[j] > max) {
                    max = arr[j + 1] - arr[j];
                } else if (j < n - 2 && j == i - 1 && arr[j + 2] - arr[j] > max) {
                    max = arr[j + 2] - arr[j];
                }
            }
            if (max < min) {
                min = max;
            }
        }
        System.out.println(min);
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
