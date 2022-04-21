package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CityDay {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int x = fr.nextInt();
        int y = fr.nextInt();
        long[] rain = new long[n];
        for (int i = 0; i < n; i++) {
            rain[i] = fr.nextInt();
        }
        //Brute Force solution:  0≤x,y≤7, so this in worst case will only take: O(n(x + y))
        int ans = -1;
        for (int i = 0; i < n; i++) {
            boolean left = true;
            boolean right = true;
            for (int j = i - 1; j >= i - x && j >= 0; j--) {
                if (rain[j] < rain[i]) {
                    left = false;
                }
            }
            for (int j = i + 1; j <= i + y && j <= n - 1; j++) {
                if (rain[j] < rain[i]) {
                    right = false;
                }
            }
            if (left && right) {
                ans = i;
                break;
            }
        }
        System.out.println(ans + 1);
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
