package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayingWithDice {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int a = fr.nextInt();
        int b = fr.nextInt();
        //Maths Solution
//        int mid = (a + b) / 2;
//        if (a == b) {
//            System.out.println("0" + " 6 " + "0");
//        } else if ((a + b) % 2 != 0) {
//            if(a < b)
//                System.out.println(mid + " 0 " + (6 - mid));
//            else System.out.println((6 - mid) + " 0 " + mid);
//        } else {
//            int draw = 1;
//            if (a > b) {
//                b = mid - 1;
//                a = 6 - b - 1;
//            } else {
//                a = mid - 1;
//                b = 6 - a - 1;
//            }
//            System.out.println(a + " " + draw + " " + b);
//            }

        //Solution 2 using brute force:
        int cA = 0, cD = 0, cB = 0;
        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) < Math.abs(b - i)) {
                cA++;
            } else if (Math.abs(a - i) > Math.abs(b - i)) {
                cB++;
            } else {
                cD++;
            }
        }
        System.out.println(cA + " " + cD + " " + cB);
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
