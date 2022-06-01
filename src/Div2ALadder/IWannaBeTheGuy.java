package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IWannaBeTheGuy {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int[] freq = new int[101];
        int n = fr.nextInt();
        int p = fr.nextInt();
        int[] littleX = new int[p];
        for (int i = 0; i < p; i++) {
            littleX[i] = fr.nextInt();
            freq[littleX[i]]++;
        }
        int q = fr.nextInt();
        int[] littleY = new int[q];
        for (int i = 0; i < q; i++) {
            littleY[i] = fr.nextInt();
            freq[littleY[i]]++;
        }
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
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
