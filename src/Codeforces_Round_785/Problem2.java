package Codeforces_Round_785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://codeforces.com/contest/1673/problem/B
public class Problem2 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s = fr.nextLine();
            int n = s.length();
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 97]++;
            }
            int[][] arr = new int[n][26];
            int[] prev = new int[26];
            Arrays.fill(prev, -1);
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    for (int k = 0; k < 26; k++) {
                        arr[i][k] = arr[i - 1][k];
                    }
                }
                arr[i][s.charAt(i) - 97]++;
                if (prev[s.charAt(i) - 97] != -1) {
                    for (int j = 0; j < 26; j++) {
                        if ((arr[i][j] - arr[prev[s.charAt(i) - 97]][j] == 0) && freq[j] > 0) {
                            flag = true;
                            break;
                        }
                    }
                }
                prev[s.charAt(i) - 97] = i;
                if (flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
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
