package PrimeSieve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TDKPRIMEFindingTheKthPrime {

    //Optimised Sieve, not taking even numbers as only 2 is an even number which is prime
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int n = 86028121;
        boolean[] visited = new boolean[n + 1];
        for (int i = 3; i * i <= n; i += 2) {
            if (!visited[i]) {
                for (int j = i * i; j <= n; j += i) {
                    visited[j] = true;
                }
            }
        }
        int limit = 5000000;
        int c = 1;
        long[] primes = new long[limit + 1];
        primes[0] = 2;
        for (int i = 3; i <= n; i += 2) {
            if (!visited[i]) {
                primes[c++] = i;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            sb.append(primes[k - 1] + "\n");
        }
        System.out.println(sb);
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
