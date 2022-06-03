package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PashmakAndGarden {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int x1 = fr.nextInt();
        int y1 = fr.nextInt();
        int x2 = fr.nextInt();
        int y2 = fr.nextInt();
        if (x1 != x2 && y1 != y2 && Math.abs(x1 - x2) != Math.abs(y1 - y2)) {
            System.out.println(-1);
        } else if (x1 == x2) {
            int x3 = x1 + Math.abs(y1 - y2);
            int x4 = x2 + Math.abs(y1 - y2);
            System.out.println(x3 + " " + y1 + " " + x4 + " " + y2);
        } else if (y1 == y2) {
            int y3 = y1 + Math.abs(x1 - x2);
            int y4 = y2 + Math.abs(x1 - x2);
            System.out.println(x1 + " " + y3 + " " + x2 + " " + y4);
        } else {
            System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
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
