package AlgorithmUnlockK3Hiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem8 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextLong();
        }
        long[] prefix_sum = new long[n];
        Arrays.sort(arr);
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        long[] newArr = new long[n];
        newArr[0] = arr[0] * n;
        long max = newArr[0];
        for (int i = 1; i < n; i++) {
            newArr[i] = (arr[i] * (n - i)) - prefix_sum[i - 1];
            max = Math.max(newArr[i], max);
        }
        System.out.println(max);
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
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
