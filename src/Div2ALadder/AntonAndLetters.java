package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntonAndLetters {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String set = fr.nextLine();
        int l = set.length();
        int[] freq = new int[26];
        int cnt = 0;
        if (set.charAt(1) == '}') {
            System.out.println(0);
        } else {
        for (int i = 1; i < l; i += 3) {
            freq[set.charAt(i) - 97]++;
            if (freq[set.charAt(i) - 97] == 1) {
                cnt++;
            }
        }
            System.out.println(cnt);
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
