package Codeforces_Round_785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Problem1 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s = fr.nextLine();
            int n = s.length();
            long ans = 0;
            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    ans += s.charAt(i) - 96;
                }
                System.out.println("Alice " + ans);
            } else {
                String s1 = s.substring(0, n - 1);
                String s2 = s.substring(1);
                long ans1 = 0, ans2 = 0;
                if (n > 1) {
                    for (int i = 0; i < s1.length(); i++) {
                        ans1 += s1.charAt(i) - 96;
                    }
                    for (int i = 0; i < s2.length(); i++) {
                        ans2 += s2.charAt(i) - 96;
                    }
                }
                if (ans1 != 0 && ans1 >= ans2) {
                    System.out.println("Alice " + (ans1 - (s.charAt(n - 1) - 96)));
                } else if (ans2 > ans1) {
                    System.out.println("Alice " + (ans2 - (s.charAt(0) - 96)));
                } else {
                    System.out.println("Bob " + (s.charAt(0) - 96));
                }

            }
        }
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
