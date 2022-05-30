package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Games {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[][] uniform = new int[n][2];
        int[] homeUni = new int[101];
        int[] guestUni = new int[101];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                uniform[i][j] = fr.nextInt();
            }
                homeUni[uniform[i][0]]++;
                guestUni[uniform[i][1]]++;
        }
        int count = 0;
//        for (int i = 0; i < n; i++) {
//            int elementToSearch = uniform[i][1];
//            for (int k = 0; k < n; k++) {
//                if (uniform[k][0] == elementToSearch && k != i) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(homeUni));
//        System.out.println(Arrays.toString(guestUni));
        for (int i = 0; i <= 100; i++) {
            count += homeUni[i] * guestUni[i];
        }
        System.out.println(count);
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
