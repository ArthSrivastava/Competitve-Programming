package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LifeWithoutZeros {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long a = fr.nextLong();
        long b = fr.nextLong();
        long c = a + b;
        a = removeZeroes(a);
        b = removeZeroes(b);
        c = removeZeroes(c);
        if(a + b == c) System.out.println("YES");
        else System.out.println("NO");



        //Correct but a little complex method
//        long t1 = a, t2 = b;
//        boolean flag = true;
//        long rem1 = 0, rem2 = 0;
//        long temp1 = 0, temp2 = 0;
//        int c = 0;
//        long carry = 0;
//        while (t1 != 0 && t2 != 0) {
//            rem1 = t1 % 10;
//            rem2 = t2 % 10;
//            if ((rem1 == 0 && rem2 != 0) || (rem1 != 0 && rem2 == 0)) {
//                flag = false;
//                break;
//            } else if (rem1 == 0 && rem2 == 0) {
//                if (c != 0 && (temp1 + temp2 > 9)) {
//                    flag = false;
//                    break;
//                }
//            } else {
//                if (rem1 + rem2 + carry == 10) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (rem1 + rem2 > 9) {
//                carry = (rem1 + rem2) / 10;
//            }
//            temp1 = rem1;
//            temp2 = rem2;
//            t1 /= 10;
//            t2 /= 10;
//            c++;
//        }
//        if (flag) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }

    private static long removeZeroes(long n) {
        long ret = 0L, ten = 1L;
        while (n != 0) {
            long rem = n % 10;
            if (rem != 0) {
                ret += rem * ten;
                ten *= 10;
            }
            n /= 10;
        }
        return ret;
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
