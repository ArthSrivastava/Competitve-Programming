package Kickstart2022March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InterestingIntegers {
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
        int i = 1;
        while (t-- > 0) {
            int count = 0;
            int a = fr.nextInt();
            int b = fr.nextInt();
            for (int k = a; k <= b; k++) {
                if (digitMul(k) % digitSum(k) == 0) {
                    count++;
                }
            }
            System.out.println("Case #" + i + ": " + count);
            i++;
        }
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }

    private static int digitMul(int n) {
        int mul = 1;
        while (n != 0) {
            int rem = n % 10;
            mul *= rem;
            n = n / 10;
        }
        return mul;
    }
}
