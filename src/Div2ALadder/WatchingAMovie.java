package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WatchingAMovie {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int x = fr.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = fr.nextInt();
            }
        }
        int ans = 0;
        int prevR = 1;
        for (int i = 0; i < n; i++) {
            int mod = (arr[i][0] - prevR) % x;
//            if(arr[i][0] - prevR < x) {
//                ans += arr[i][1] - prevR + 1;
//            } else if (mod == 0) {
//                ans += arr[i][1] - arr[i][0] + 1;
//            } else {
//                ans += arr[i][1] - arr[i][0] + 1 + mod;
//            }
            if (mod == 0) {
                ans += arr[i][1] - arr[i][0] + 1;
            } else {
                ans += arr[i][1] - arr[i][0] + 1 + mod;
            }
            prevR = arr[i][1] + 1;
//            System.out.println(mod + " " + ans + " " + prevR);
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
