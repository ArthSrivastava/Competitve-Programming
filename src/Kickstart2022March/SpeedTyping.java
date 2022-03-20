package Kickstart2022March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SpeedTyping {
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
    static final int CHAR = 256;
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        int i = 1;
        while (t-- > 0) {
            String I = fr.nextLine();
            String P = fr.nextLine();
//            int[] count1 = new int[CHAR];
//            int[] count2 = new int[CHAR];
            int n1 = I.length();
            int n2 = P.length();
//            for (int k = 0; k < n1; k++) {
//                count1[I.charAt(k)]++;
//            }
//            for (int k = 0; k < n2; k++) {
//                count2[P.charAt(k)]++;
//            }
//            for (int k = 0; k < CHAR; k++) {
//                if(count1[k] > 0)
//                System.out.print(count1[k] + " ");
//            }
//            System.out.println();
//            System.out.println("Count 2:");
//            System.out.println();
//            for (int k = 0; k < CHAR; k++) {
//                if(count2[k] > 0)
//                System.out.print(count2[k] + " ");
//            }
//            int count = 0;
//            for (int k = 0; k < CHAR; k++) {
//                if (count2[k] < count1[k]) {
//                    count = -1;
//                    break;
//                } else {
//                    count += (count2[k] - count1[k]);
//                }
//            }
//            System.out.println(Arrays.toString(count1));
//            System.out.println(Arrays.toString(count2));

            int count = 0;
            int first = 0, second = 0;
            while (first < n1 && second < n2) {
                if (I.charAt(first) != P.charAt(second)) {
                    count++;
                    second++;
                } else {
                    first++;
                    second++;
                }
            }
            if (first < n1) {
                System.out.println("Case #" + i + ": " + "IMPOSSIBLE");
            } else {
                if (second < n2) {
                    count += n2 - second;
                }
                System.out.println("Case #" + i + ": " + count);
            }
            i++;
        }
    }
}
