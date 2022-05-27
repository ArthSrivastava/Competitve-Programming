package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MagicPowder {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        long k = fr.nextInt();
        long[] reqd = new long[n];
        long[] have = new long[n];
        long[] extra = new long[n];
        for (int i = 0; i < n; i++) {
            reqd[i] = fr.nextLong();
        }
        for (int i = 0; i < n; i++) {
            have[i] = fr.nextLong();
        }
        long low = 0, high = 10000000000L, ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            boolean flag = true;
            long temp = k;
            for (int i = 0; i < n; i++) {
                extra[i] = have[i] - mid * reqd[i];
                if (extra[i] < 0) {
                    long diff = -1 * extra[i];
                    if (temp >= diff) {      //Agar 0 bana pa rhe negative value ko iska matlab h voh number of
                        extra[i] = 0;        //cookies bana skte ho tum
                        temp -= diff;
                    }
                }
                if(extra[i] < 0) {
                    flag = false;
                    break;
                }
            }
//            System.out.println("mid: " + mid + " " + Arrays.toString(extra));
            if (flag) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
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
