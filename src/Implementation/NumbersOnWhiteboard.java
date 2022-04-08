package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://codeforces.com/contest/1430/problem/C
public class NumbersOnWhiteboard {
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
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] arr = new int[n];
            int c = 0, sum;
            for (int i = n; i >= 1; i--) {
                arr[c++] = i;
            }
            System.out.println(2);
            System.out.println(arr[1] + " " + arr[0]);
            arr[1] = arr[0];
            for (int i = 1; i < n - 1; i++) {
                sum = (int)(Math.ceil((arr[i] + arr[i + 1]) / 2f));
//                System.out.println(sum);
                System.out.print(arr[i + 1] + " " + arr[i]);
                arr[i + 1] = sum;
                System.out.println();
            }
        }
    }
}
