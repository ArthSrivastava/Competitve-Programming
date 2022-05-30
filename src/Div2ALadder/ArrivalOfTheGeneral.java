package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        int maxIdx = -1, minIdx = -1;
        int max = 0, min = 101;
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIdx = i;
            }
        }
        if (maxIdx == minIdx) {
            System.out.println(0);
        } else {
            if (maxIdx > minIdx) {
                minIdx++;
            }
            int count = maxIdx + (n - 1 - minIdx);
            System.out.println(count);
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
