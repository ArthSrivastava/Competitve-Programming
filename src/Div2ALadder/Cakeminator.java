package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cakeminator {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int r = fr.nextInt();
        int c = fr.nextInt();
        Character[][] arr = new Character[r][c];
        int[] row = new int[11];
        int[] col = new int[11];
        for (int i = 0; i < r; i++) {
            String s = fr.nextLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'S') {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
//        for (Character[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
        int cakes = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    cakes++;
                }
            }
        }
        System.out.println(cakes);
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
