package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Counterexample {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long l = fr.nextLong();
        long r = fr.nextLong();
//        ArrayList<Long> list = new ArrayList<>();
//        boolean flag = false;
//        for (long curr = l; curr <= r; curr++) {
//            long next = curr + 1;
//            for (long j = next + 1; j <= r; j++) {
//                if (gcd(next, j) == 1 && gcd(j, curr) != 1) {
//                    flag = true;
//                    list.add(curr);
//                    list.add(next);
//                    list.add(j);
//                    break;
//                }
//            }
//            if(flag) break;
//        }
//        if (flag) {
//            for (long e : list) {
//                System.out.print(e + " ");
//            }
//            System.out.println();
//        } else {
//            System.out.println(-1);
//        }
        if (l % 2 == 0) {
            if (l + 2 > r) {
                System.out.println(-1);
            } else {
                System.out.println(l + " " + (l + 1) + " " + (l + 2));
            }
        } else {
            if (l + 3 > r) {
                System.out.println(-1);
            } else {
                System.out.println((l + 1) + " " + (l + 2) + " " + (l + 3));
            }
        }
    }

    public static long gcd(long a, long b) {
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
