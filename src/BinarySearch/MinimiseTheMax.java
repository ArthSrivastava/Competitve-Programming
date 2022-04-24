package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimiseTheMax {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long dealer = fr.nextLong();
            int type = fr.nextInt();
            long[] vaccines = new long[type];
            long max = Long.MIN_VALUE;
            for (int i = 0; i < type; i++) {
                vaccines[i] = fr.nextLong();
                max = Math.max(max, vaccines[i]);
            }
            long low = 1, high = max;
            long ans = 0;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                int count = 0;
                for (int i = 0; i < type; i++) {
                    if (vaccines[i] % mid == 0) {
                        count += vaccines[i] / mid;
                    } else {
                        count += (vaccines[i] / mid) + 1;
                    }
                }
//                System.out.println(count);
                if (count <= dealer) {
                    ans = mid;
                    high = mid - 1;
                }  else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
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
