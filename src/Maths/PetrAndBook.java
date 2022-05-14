package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PetrAndBook {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = fr.nextInt();
        }
        int i = 0;
        int sum = arr[0];
        while (sum < n) {
            i++;
            i %= 7;
            sum += arr[i];
        }
        System.out.println(i + 1);
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