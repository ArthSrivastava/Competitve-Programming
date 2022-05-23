package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CaisaAndPylons {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = fr.nextLong();
        }
        long dollars = 0, energy = 0;
        if(arr[0] != 0) {
            dollars += arr[0];
        }
        for(int i = 0; i < n - 1; i++) {
            long l = arr[i] - arr[i + 1];
            if (l < 0) {
                if (energy + l >= 0) {
                    energy += l;
                } else {
                    dollars += Math.abs(energy + l);
                    energy = 0;
                }
            } else {
                energy += l;
            }
        }
        System.out.println(dollars);
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
