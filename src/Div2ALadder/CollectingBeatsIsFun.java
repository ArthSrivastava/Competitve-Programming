package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CollectingBeatsIsFun {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int k = fr.nextInt();
        int[] freq = new int[10];
        char[][] arr = new char[4][4];
        for (int i = 0;  i < 4; i++) {
            String s = fr.nextLine();
            for (int j = 0; j < 4; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] != '.') {
                    freq[arr[i][j] - '0']++;
                }
            }
        }
        System.out.println(Arrays.toString(freq));
        boolean flag = true;
        for (int i = 1; i < 10; i++) {
            if (freq[i] > 2 * k) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
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
