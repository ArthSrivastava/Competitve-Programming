//https://codeforces.com/problemset/status?my=on
//Solution: https://www.youtube.com/watch?v=8Q-15qf-xjo
package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BowWowAndTheTimetable {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.nextLine();
        int l = s.length();
        int res = l / 2;
        if (l % 2 == 0) {
            System.out.println(res);
        } else {
            int cnt = 0;
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == '1') {
                    cnt++;
                }
            }
            res = (cnt > 1) ? (res + 1) : res;
            System.out.println(res);
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
