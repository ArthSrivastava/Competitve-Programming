package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SupercentralPoint {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = fr.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            int l = 0, r = 0, u = 0, d = 0;
            for (int j = 0; j < n; j++) {
                if(j != i) {
                    if(x == arr[j][0] && y < arr[j][1]) d++;
                    if(x == arr[j][0] && y > arr[j][1]) u++;
                    if(y == arr[j][1] && x < arr[j][0]) l++;
                    if(y == arr[j][1] && x > arr[j][0]) r++;
                }
            }
            if(d > 0 && u > 0 && l > 0 && r > 0) ans++;
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
