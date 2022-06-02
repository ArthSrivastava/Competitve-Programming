package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IlyaAndBankAccount {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long n = fr.nextLong();
//        long a1 = n / 10;
//        long rem = Math.abs(n % 10);
//        long x = n / 100;
//        String s = String.valueOf(x);
//        s += rem;
//        if (n >= 0) {
//            System.out.println(n);
//        } else {
//            long a2 = Long.parseLong(s);
//            if (x == 0) {
//                a2 *= -1;
//            }
//            long max1 = Math.max(a1, a2);
//            long max2 = Math.max(max1, n);
////            System.out.println(a2 + " a1:" + a1);
//            System.out.println(max2);

        //Better solution
        if (n >= 0) {
            System.out.println(n);
        } else {
            long a1 = n / 10;
            long a2 = (n / 100) * 10 + (n % 10);
            long max1 = Math.max(a1, a2);
            long max2 = Math.max(max1, n);
            System.out.println(max2);
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
