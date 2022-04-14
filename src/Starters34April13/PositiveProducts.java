package Starters34April13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PositiveProducts {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] arr = new long[n + 1];
            long sumPositive = 0, sumNegative = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = fr.nextLong();
                if (arr[i] > 0) {
                    sumPositive += 1;
                } else if (arr[i] < 0) {
                    sumNegative += 1;
                }
            }
//            System.out.println(Arrays.toString(arr));
            long count = 0;

            //My method:
//            for (int i = 1; i < n; i++) {
//                if (arr[i] > 0) {
//                    sumPositive = sumPositive - 1;
//                    count += sumPositive;
//                } else if (arr[i] < 0) {
//                    sumNegative -= 1;
//                    count += sumNegative;
//                }
//            }

            //Another way
            count = ((sumPositive * (sumPositive - 1)) / 2 + (sumNegative * (sumNegative - 1)) / 2);
            System.out.println(count);
        }
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
