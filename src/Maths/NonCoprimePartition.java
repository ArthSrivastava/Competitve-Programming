package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NonCoprimePartition {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        if (n == 1 || n == 2) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
//            int even = n / 2;
//            int odd = n - even;
//            System.out.print(even + " ");
//            for (int i = 2; i <= n; i += 2) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            System.out.print(odd + " ");
//            for (int i = 1; i <= n; i += 2) {
//                System.out.print(i + " ");
//            }
            int firstSet = n / 2;
            if (n % 2 != 0) {
                firstSet = (n + 1) / 2;
            }
            int secondSet = n - 1;
            System.out.print(1 + " " + firstSet);
            System.out.println();
            System.out.print(secondSet + " ");
            for(int i = 1; i <= n; i++) {
                if (i == firstSet) {
                    continue;
                }
                System.out.print(i + " ");
            }
            System.out.println();
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
