package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PoisonedDagger {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long h = fr.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextLong();
            }
            long ans = 0;
            long low = 0, high = 1000000000000000000L;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long damage = 0;
                boolean flag = false;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] + mid > arr[i + 1]) {
                        damage += (arr[i + 1] - arr[i]);
                    } else {
                        damage += mid;
                    }
                    if (damage >= h) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    damage += mid;
                    if (damage >= h) {
                        flag = true;
                    }
                }
                if (flag) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
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
