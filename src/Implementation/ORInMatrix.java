package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/486/B
public class ORInMatrix {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int m = fr.nextInt();
        int n = fr.nextInt();
        int[][] b = new int[m][n];
        int[][] a = new int[m][n];
        for (int[] row : a) {
            Arrays.fill(row, -1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = fr.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        a[i][k] = 0;
                    }
                    for (int l = 0; l < m; l++) {
                        a[l][j] = 0;
                    }
                }
            }
        }
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flag = false;
                if (b[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        if (a[i][k] == -1 || a[i][k] == 1) {
                            flag = true;
                            a[i][k] = 1;
                        }
                    }
                    for (int l = 0; l < m; l++) {
                        if (a[l][j] == -1 || a[l][j] == 1) {
                            flag = true;
                            a[l][j] = 1;
                        }
                    }
                } else {
                    flag = true;
                }
                if (!flag) {
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
            for (int[] row : a) {
                for (int e : row) {
                    System.out.print(e + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
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
