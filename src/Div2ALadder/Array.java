package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        int countNegative = 0, countZero = 0;
        int negIndex1 = -1, negIndex2 = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
            if (arr[i] < 0) {
                negIndex2 = negIndex1;
                negIndex1 = i;
                countNegative++;
            }
        }
        if (countNegative % 2 != 0) {
            System.out.print(1 + " " + arr[negIndex1] + "\n");
            System.out.print(n - 2 + " ");
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0 && i != negIndex1) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            System.out.println("1" + " 0");
        } else {
            System.out.print(1 + " " + arr[negIndex1] + "\n");
            System.out.print(n - 3 + " ");
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0 && i != negIndex1 && i != negIndex2) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            System.out.println("2" + " 0 " + arr[negIndex2]);
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
