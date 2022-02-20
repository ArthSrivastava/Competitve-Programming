package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoftDrinking {
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
        int n, k, l, c, d, p, nl, np;
        n = fr.nextInt();
        k = fr.nextInt();
        l = fr.nextInt();
        c = fr.nextInt();
        d = fr.nextInt();
        p = fr.nextInt();
        nl = fr.nextInt();
        np = fr.nextInt();
        int totalDrink = k * l;
        int sd1 = totalDrink / nl;
        int totalLime = c * d;
        int sd2 = totalLime;
        int sd3 = p / np;
        int min1 = Math.min(sd1, sd2);
        int min2 = Math.min(sd3, min1);
        System.out.println(min2/n);
    }
}
