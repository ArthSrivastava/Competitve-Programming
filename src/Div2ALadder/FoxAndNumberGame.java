package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FoxAndNumberGame {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
//        boolean flag = true;
//        while (flag) {
//            int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
//            boolean foundSecondMax = false;
//            int maxIndex = -1, secondMaxIndex = -1;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                    maxIndex = i;
//                }
//            }
//            for (int i = 0; i < n; i++) {
//                if (arr[i] > secondMax && arr[i] < max) {
//                    secondMax = arr[i];
//                    secondMaxIndex = i;
//                    foundSecondMax = true;
//                }
//            }
//            if (!foundSecondMax) {
//                flag = false;
//            } else {
//                arr[maxIndex] = max - secondMax;
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
        int k = gcd(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            k = gcd(k, arr[i]);
        }
        System.out.println(n * k);
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
