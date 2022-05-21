package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BerlandPoker {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int m = fr.nextInt();
            int k = fr.nextInt();
            int numOfCard = n / k;
            if (m == 0) {
                System.out.println(0);
            } else if (numOfCard % m == 0) {
                System.out.println(m);
            } else {
                if (m > numOfCard) {
                    int rem = m - numOfCard;
                    if ((k - 1) >= rem) {
                        System.out.println(numOfCard - 1);
                    } else {
                        if (k != 2) {
                            int extra = 0;
                            if ((rem % (k - 1)) != 0) {
                                extra = (rem / (k - 1)) + 1;
                            } else {
                                extra = rem / (k - 1);
                            }
                            System.out.println(numOfCard - extra);
                        } else {
                            System.out.println(numOfCard - rem);
                        }

                    }
                } else {
                    System.out.println(m);
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
