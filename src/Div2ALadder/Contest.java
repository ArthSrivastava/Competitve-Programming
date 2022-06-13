package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Contest {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int a = fr.nextInt();
        int b = fr.nextInt();
        int c = fr.nextInt();
        int d = fr.nextInt();
        int max1 = Math.max((3 * a) / 10, a - (a * c) / 250);
        int max2 = Math.max((3 * b) / 10, b - (b * d) / 250);
        if(max1 > max2) System.out.println("Misha");
        else if(max2 > max1) System.out.println("Vasya");
        else System.out.println("Tie");
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
