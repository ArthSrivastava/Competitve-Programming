package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FoxAndSnake {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int m = fr.nextInt();
        int c = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (i % 2 != 0) {
                    System.out.print("#");
                } else {
                    if (c % 2 == 0) {
                        if (j == m) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if (j == 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                }
            }
            if (i % 2 == 0) {
                c++;
            }
            System.out.println();
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
