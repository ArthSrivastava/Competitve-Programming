package CodeforcesRound786Div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/contest/1674/problem/C
public class C {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s1 = fr.nextLine();
            String s2 = fr.nextLine();
            int countA = 0;
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == 'a') {
                    countA++;
                }
            }
            if (s1.length() >= 1 && countA > 0 && countA <= s2.length() && s2.length() > 1) {
                System.out.println(-1);
            } else if (s1.length() == 1 && s2.length() >= 1 && countA == 0) {
                System.out.println(2);
            } else {
                if (s2.length() == 1 && countA == 1) {
                    System.out.println(1);
                } else {
                    long total = (long) Math.pow(2, s1.length());
                    System.out.println(total);
                }
            }
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
