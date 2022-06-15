package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Domino {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int s1 = 0, s2 = 0;
        boolean foundOppParityPair = false;
        while (n-- > 0) {
            int x = fr.nextInt();
            int y = fr.nextInt();
            if ((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0)) {
                foundOppParityPair = true;
            }
            s1 += x;
            s2 += y;
        }
        if (s1 % 2 == 0 && s2 % 2 == 0) {
            System.out.println(0);
        } else if ((s1 % 2 != 0 && s2 % 2 == 0) || (s1 % 2 == 0 && s2 % 2 != 0)) {
            System.out.println(-1);
        } else {
            if(foundOppParityPair) System.out.println(1);  //We can swap the opp parity numbers to make both side even since they are 1 unit away from an even number
            else System.out.println(-1);
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
