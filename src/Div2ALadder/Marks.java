package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Marks {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int m = fr.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = fr.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean flag = true;
                for (int k = 0; k < n; k++) {
                    if (i != k && arr[k][j] > arr[i][j]) {
//                        System.out.println("IN " + arr[k][j] + " " + arr[i][j]);
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
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
