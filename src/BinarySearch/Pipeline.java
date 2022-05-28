package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pipeline {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long n = fr.nextLong();
        long k = fr.nextLong();
        long high = k, low = 0;
        long ans = 0;
        long sumToK = (k * (k + 1)) / 2;
        boolean flag = false;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long totalHousesSupplied = sumToK - (((k - mid) * (k - mid + 1)) / 2) - (mid - 1);
//            System.out.println(":::" + totalHousesSupplied);
            if (totalHousesSupplied >= n) {
                ans = mid;
                flag = true;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (flag) {
            System.out.println(ans);
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
