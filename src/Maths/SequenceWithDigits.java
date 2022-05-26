package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SequenceWithDigits {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long a1 = fr.nextLong();
            long k = fr.nextLong();
            long sum = a1;
            for(int i = 0; i < k - 1; i++) {
                int prod = getMinMaxDigit(sum);
                if (prod == 0) {
                    break;
                }
                sum += (long) prod;
            }
            System.out.println(sum);
        }
    }

    private static int getMinMaxDigit(long n) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (n != 0) {
            int rem = (int) (n % 10);
            if (rem < min) {
                min = rem;
            }
            if (rem > max) {
                max = rem;
            }
            n = n / 10;
        }
        return max * min;
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
