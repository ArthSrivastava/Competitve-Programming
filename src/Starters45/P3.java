package Starters45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
            char[] check = new char[n];
            char[] res = new char[n];
            boolean flag = false;
            if (arr[0] == 1) {
                check[0] = 'o';
                check[1] = 'e';
                res = func(check, arr);
                if (firstAndLastCheck(res, arr)) {
                    flag = true;
                    System.out.println("YES");
                }
                check[0] = 'e';
                check[1] = 'o';
                res = func(check, arr);
                if (!flag && firstAndLastCheck(res, arr)) {
                    flag = true;
                    System.out.println("YES");
                }
                if (!flag) {
                    System.out.println("NO");
                }
            } else {
                check[0] = 'e';
                check[1] = 'e';
                res = func(check, arr);
                if (firstAndLastCheck(res, arr)) {
                    flag = true;
                    System.out.println("YES");
                }
                check[0] = 'o';
                check[1] = 'o';
                res = func(check, arr);
                if (!flag && firstAndLastCheck(res, arr)) {
                    flag = true;
                    System.out.println("YES");
                }
                if (!flag) {
                    System.out.println("NO");
                }
            }

        }
    }

    public static char[] func(char[] check, int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] == 0) {
                if (check[i] == 'o') {
                    check[i + 1] = 'o';
                } else {
                    check[i + 1] = 'e';
                }
            } else if (arr[i] == 1) {
                if (check[i] == 'o') {
                    check[i + 1] = 'e';
                } else {
                    check[i + 1] = 'o';
                }
            }
        }
        return check;
    }

    public static boolean firstAndLastCheck(char[] check, int[] arr) {
        int n = check.length;
        if (arr[n - 1] == 0 && ((check[n - 1] == 'o' && check[0] == 'o') || (check[n - 1] == 'e' && check[0] == 'e'))) {
            return true;
        } else if (arr[n - 1] == 1 && ((check[n - 1] == 'o' && check[0] == 'e') || (check[n - 1] == 'e' && check[0] == 'o'))) {
            return true;
        }
        return false;
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
