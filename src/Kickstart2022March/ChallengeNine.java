package Kickstart2022March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ChallengeNine {
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
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        int i = 1;
        while (t-- > 0) {
            String n = fr.nextLine();
            long sum = digitSum(n);
            String min = "";
            StringBuilder s1 = new StringBuilder(n);
            long numToInsert = (((sum / 9) + 1) * 9) - sum;

            String num = String.valueOf(numToInsert);
            if (sum % 9 == 0) {
                s1.insert(1, "0");
                min = s1.toString();
            } else {
                s1.insert(0, num);
                min = s1.toString();
                boolean hasInserted = true;
                for (int k = 1; k <= n.length(); k++) {
                    s1.deleteCharAt(k - 1);
                    s1.insert(k, num);
//                System.out.println(s1);
                    String newNum = s1.toString();
                    if (newNum.compareTo(min) < 0) {
                        min = newNum;
                    }
                }
            }
            System.out.println("Case #" + i + ": " + min);
            i++;
        }
    }

    private static long digitSum(String n) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i) - '0');
        }
        return sum;
    }
}
