package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PresentFromLena {
    private static void solve() {
        FastReader fr = new FastReader();
        int n = fr.nextInt();

        //Upper triangle
        for (int i = 0; i <= n; i++) {
            for (int sp = 0; sp < 2 * (n - i); sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
                for (int j = i - 1; j >= 0; j--) {
                    if (j != 0) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print(j);
                    }
                }
            System.out.println();
        }

        //Lower triangle
        int x = 2;
        for (int i = n - 1; i >= 0; i--) {
            for (int sp = 0; sp < x; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (j != 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
            x += 2;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        solve();
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
