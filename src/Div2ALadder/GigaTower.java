package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GigaTower {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long a = fr.nextLong();
        int i = 0;
        while (a <= 8888888888L) {
            if (i != 0 && has8(a)) {
                break;
            }
            a += 1;
            i++;
        }
        System.out.println(i);
        }

    public  static boolean has8(long x) {
        if(x < 0) x *= -1;
        while (x != 0) {
            if (x % 10 == 8) {
                return true;
            }
            x /= 10;
        }
        return false;
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
