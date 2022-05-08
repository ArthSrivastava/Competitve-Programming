package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RestoringThreeNumbers {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        long[] arr = new long[4];
        long max = Long.MIN_VALUE;
        int temp = -1;
        for (int i = 0; i < 4; i++) {
            arr[i] = fr.nextLong();
            if (arr[i] > max) {
                temp = i;
                max = arr[i];
            }
        }
        for (int i = 0; i < 4; i++) {
            if (i != temp) {
                System.out.print(max - arr[i] + " ");
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
