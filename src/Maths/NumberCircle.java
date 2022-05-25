package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCircle {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        Long[] arr = new Long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = fr.nextLong();
        }
        Arrays.sort(arr);
//        if (arr[n - 2] + arr[0] > arr[n - 1]) {
//            System.out.println("YES");
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
        if (arr[n - 1] < arr[n - 2] + arr[n - 3]) {
            long tmp = arr[n - 1];
            arr[n - 1] = arr[n - 2];
            arr[n - 2] = tmp;
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
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
