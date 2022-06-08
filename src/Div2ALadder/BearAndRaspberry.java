package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BearAndRaspberry {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int c = fr.nextInt();
        int[] arr = new int[n];
        int nextNumSmaller = -1;
        int nextNumIndex = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i != n - 1 && arr[i + 1] < arr[i] && (arr[i] - arr[i + 1]) > max) {
                nextNumSmaller = arr[i];
                nextNumIndex = i;
                max = arr[i] - arr[i + 1];
            }
        }
//        System.out.println(nextNumSmaller);
        if (nextNumSmaller == -1) {
            System.out.println(0);
        } else {
            int ans = nextNumSmaller - arr[nextNumIndex + 1] - c;
            if(ans < 0) System.out.println(0);
            else System.out.println(ans);
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
