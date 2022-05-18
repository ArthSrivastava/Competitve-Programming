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
            int cntOdd = 0, cntZero = 0;
            for (int i = 0; i < 4; i++) {
                arr[i] = fr.nextLong();
                if (arr[i] % 2 != 0) {
                    cntOdd++;
                }
                if (arr[i] == 0 && i != 3) {
                    cntZero++;
                }
            }

            //If odd = 0 -> yes
            //odd = 1 -> yes
            //odd = 2 -> no
            //odd = 3 || odd = 4 -> freq of all > 0
            if (cntOdd == 2 || (cntOdd >= 3 && (cntZero > 0))) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
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
