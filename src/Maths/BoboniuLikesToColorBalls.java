package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoboniuLikesToColorBalls {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long[] arr = new long[4];
            int cnt = 0, cntZero = 0;
            for (int i = 0; i < 4; i++) {
                arr[i] = fr.nextLong();
                if (i != 3 && arr[i] % 2 == 0 && arr[i] != 0) {
                    cnt++;
                }
                if (i != 3 && arr[i] == 0) {
                    cntZero++;
                }
            }
            if (cntZero == 3 || cntZero == 4) {
                System.out.println("Yes");
            } else if(arr[3] % 2 == 0) {
                if (cnt > 0) {
                    System.out.println("Yes");
                }
            } else {
                if (cnt > 0) {
                    System.out.println("Yes");
                } else if (cntZero > 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
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
