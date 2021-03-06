package Starters29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2 {
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
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while(t-- > 0)
        {
            int n = fr.nextInt();
            String s = fr.nextLine();
            int count = 0;
            boolean flag = true;
            int i = 0;
            for(i = 0; i < n - 1; )
            {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                    i += 2;
                } else {
                    count++;
                    i++;
                }
            }
            if (i >= n) {
                System.out.println(count);
            } else {
                System.out.println(count + 1);
            }
        }
    }
}
