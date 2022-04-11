package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game23 {
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
        int n = fr.nextInt();
        int m = fr.nextInt();
        int quo = m / n;
        if (m % n != 0) {
            System.out.println(-1);
        } else {
            int count = 0;
//            boolean flag = false;
            while (quo % 2 == 0) {
                count++;
                quo = quo / 2;
            }
            while (quo % 3 == 0) {
                count++;
                quo /= 3;
            }
            if (quo != 1) {
                count = -1;
            }
            System.out.println(count);
        }
    }

}
