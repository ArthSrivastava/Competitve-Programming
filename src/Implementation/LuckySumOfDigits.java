package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/109/A
public class LuckySumOfDigits {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n > 0 && n % 7 != 0) {
            n -= 4;
            sb.append("4");
        }
        while (n > 0 && n % 7 == 0) {
            n -= 7;
            sb.append("7");
        }
        if (n == 0) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
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
