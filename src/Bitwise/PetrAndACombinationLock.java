package Bitwise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PetrAndACombinationLock {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        int c = 0;
        while (n-- > 0) {
            int a = fr.nextInt();
            arr[c++] = a;
        }
        boolean flag = check(arr, 0, 0);
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean check(int[] arr, int sum, int index) {
        if(index == arr.length) {
            return sum % 360 == 0;
        }
        return check(arr, sum + arr[index], index + 1) || check(arr, sum - arr[index], index + 1);
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
