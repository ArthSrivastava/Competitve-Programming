package PrimeSieve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TDPRIMESPrintingSomePrimes {

    //Optimised Sieve, not taking even numbers as only 2 is an even number which is prime
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = 100000000;
        boolean[] visited = new boolean[n + 1];
        sieve(n, visited);
    }

    public static void sieve(int n, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i * i <= n; i += 2) {
            if (!visited[i]) {
                for (int j = i * i; j <= n; j += i) {
                    visited[j] = true;
                }
            }
        }
        int c = 1;
        sb.append("2\n");
        for (int i = 3; i <= n; i += 2) {
            if (!visited[i]) {
                c++;
                if(c % 100 == 1)
                    sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
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
