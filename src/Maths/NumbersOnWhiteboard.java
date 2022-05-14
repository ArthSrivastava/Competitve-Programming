package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumbersOnWhiteboard {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] arr = new long[n];
            int c = 0;
            for (int i = n; i >= 1; i--) {
                arr[c++] = i;
            }
            System.out.println(2);
            System.out.println(arr[1] + " " + arr[0]);
            arr[1] = arr[0];
            long sum = 0;
            for (int i = 1; i < n - 1; i++) {
                sum = (arr[i] + arr[i + 1] + 1) / 2;
                System.out.println(arr[i + 1] + " " + arr[i]);
                arr[i + 1] = sum;
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
