package Starters29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
//Used Editorial
public class P3 {
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
            Long[] arr = new Long[n];
            long sumOdd = 0, sumEven = 0;
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            for(int i = 1; i <= n; i++)
            {
                arr[i - 1] = fr.nextLong();
                arr[i - 1] = Math.abs(arr[i - 1]);
                if (i % 2 != 0) {
                    min = Math.min(arr[i - 1], min);
                    sumOdd += arr[i - 1];
                } else {
                    max = Math.max(arr[i - 1], max);
                    sumEven += arr[i - 1];
                }
            }
            long sum = sumOdd - sumEven;
            if (max < min) {
                System.out.println(sum);
            } else {
                System.out.println(sum + 2 * (max - min));
            }
        }

    }
}
