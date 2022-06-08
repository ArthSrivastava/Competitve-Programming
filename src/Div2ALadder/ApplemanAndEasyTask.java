package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ApplemanAndEasyTask {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        Character[][] arr = new Character[n][n];
        for (int i = 0; i < n; i++) {
            String s = fr.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int c = 0;
                if (i - 1 >= 0 && arr[i - 1][j] == 'o') c++;
                if(j - 1 >= 0 && arr[i][j - 1] == 'o') c++;
                if(i + 1 <= (n - 1) && arr[i + 1][j] == 'o') c++;
                if(j + 1 <= (n - 1) && arr[i][j + 1] == 'o') c++;
                if (c % 2 != 0) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag ? "YES" : "NO");
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
