package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CutRibbon {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int a = fr.nextInt();
        int b = fr.nextInt();
        int c = fr.nextInt();
//        int ans = getMaxSteps(n, a, b, c, 0); //Recursive solution but gives TLE, can be solved with DP
        //Iterative solution
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i * a <= n; i++) {
            for (int j = 0; i * a + j * b <= n; j++) {
                int rem = n - (i * a + j * b);
                if(rem % c == 0) {
                    int k = rem / c;
                    ans = Math.max(ans, i + j + k);
                }
            }
        }
        System.out.println(ans);
    }

    private static int getMaxSteps(int n, int a, int b, int c, int count) {
        if(n == 0) return count;
        if (n < 0 || (n < a && n < b && n < c)) {
            return 0;
        }
        int max1 = Math.max(getMaxSteps(n - a, a, b, c,count + 1), getMaxSteps(n - b, a, b, c, count + 1));
        int max2 = Math.max(getMaxSteps(n - c, a, b, c, count + 1), max1);
        return max2;
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
