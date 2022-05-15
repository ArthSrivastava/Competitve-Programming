package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PashaAndStick {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long n = fr.nextLong();
        if (n % 2 != 0) {
            System.out.println(0);
        } else {
//            long x = n / 2; //Looking before half because pair will repeat and half will always give a square
//            long ans = 0;
//            if (x % 2 == 0) {
//                ans = (x / 2) - 1;  //If x is even then number of even before it would be (x / 2) - 1 OR x is divisible by 4 means a square has been counted
//            } else {
//                ans = x / 2; //If x is odd then number of even before it would be (x / 2)
//            }

            //This can be reduced to
            long ans = n / 4;
            if (n % 4 == 0) {
                ans--;
            }
            System.out.println(ans);
        }
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
