package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HamBurgersRetry {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.nextLine();
        long[] pieces = new long[3];
        long[] prices = new long[3];
        long[] freq = new long[3];
        for (int i = 0; i < 3; i++) {
            pieces[i] = fr.nextLong();
        }
        for (int i = 0; i < 3; i++) {
            prices[i] = fr.nextLong();
        }
        long r = fr.nextLong();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') freq[0]++;
            else if (s.charAt(i) == 'S') freq[1]++;
            else freq[2]++;
        }
        long low = 0, high = 100000000000000L;
        long ans = 0, extraB = 0, extraS = 0, extraC = 0;
        while(low <= high) {
            long mid = low + (high - low) / 2;
            extraB = mid * freq[0] - pieces[0];
            extraS = mid * freq[1] - pieces[1];
            extraC = mid * freq[2] - pieces[2];
            if(extraB < 0) extraB = 0;
            if(extraS < 0) extraS = 0;
            if(extraC < 0) extraC = 0;
            long extraMoney = (extraB * prices[0]) + (extraS * prices[1]) + (extraC * prices[2]);
//            System.out.println(mid);
//            System.out.println("B:" + extraB + " S:" + extraS + " C:" + extraC);
//            System.out.println(ans);
            if (extraMoney <= r) {
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
