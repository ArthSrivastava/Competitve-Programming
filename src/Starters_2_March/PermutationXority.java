package Starters_2_March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// USED EDITORIAL
public class PermutationXority {
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
            if (n == 2)
                System.out.print(-1);
            else if (n % 2 != 0) {
                for (int i = n; i >= 1; i--) {
                        System.out.print(i + " ");
                }
            } else {
                int[] arr = new int[n];
                arr[0] = 2;
                arr[1] = 3;
                arr[2] = 1;
                arr[3] = 4;
                int k = 4;
                if (n != 4) {
                    for (int i = 5; i <= n; i++) {
                        arr[k] = i;
                        k++;
                    }
                }
                for(int i = 0; i < n; i++)
                {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
