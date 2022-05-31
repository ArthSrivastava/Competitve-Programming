package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dubstep {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.nextLine();
        int l = s.length();
        int k = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < l;) {
            StringBuilder sb = new StringBuilder();
            if (i < l - 2) {
                for (k = i; k < i + 3; k++) {
                    sb.append(s.charAt(k));
                }
                if (sb.compareTo(new StringBuilder("WUB")) == 0) {
                    if(k != l && ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ')
                        ans.append(" ");
                    i = k;
                    continue;
                }
            }
            ans.append(s.charAt(i));
            i++;
        }
        System.out.println(ans);
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
