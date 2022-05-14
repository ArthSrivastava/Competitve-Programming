package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrianglesOnARectangle {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int w = fr.nextInt();
            int h = fr.nextInt();
            int a = fr.nextInt();
            int[] h1 = new int[a];
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            for (int i = 0; i < a; i++) {
                h1[i] = fr.nextInt();
                max = Math.max(h1[i], max);
                min = Math.min(h1[i], min);
            }
            long area1 = (max - min) * h;

            int b = fr.nextInt();
            int[] h2 = new int[b];
            max = Long.MIN_VALUE;
            min = Long.MAX_VALUE;
            for (int i = 0; i < b; i++) {
                h2[i] = fr.nextInt();
                max = Math.max(h2[i], max);
                min = Math.min(h2[i], min);
            }
            long area2 = (max - min) * h;

            int c = fr.nextInt();
            int[] h3 = new int[c];
            max = Long.MIN_VALUE;
            min = Long.MAX_VALUE;
            for (int i = 0; i < c; i++) {
                h3[i] = fr.nextInt();
                max = Math.max(h3[i], max);
                min = Math.min(h3[i], min);
            }
            long area3 = (max - min) * w;

            int d = fr.nextInt();
            int[] h4 = new int[d];
            max = Long.MIN_VALUE;
            min = Long.MAX_VALUE;
            for (int i = 0; i < d; i++) {
                h4[i] = fr.nextInt();
                max = Math.max(h4[i], max);
                min = Math.min(h4[i], min);
            }
            long area4 = (max - min) * w;
            long m1 = Math.max(area1, area2);
            long m2 = Math.max(m1, area3);
            long m3 = Math.max(m2, area4);
            System.out.println(m3);
        }

        //140034957268
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
