package Starters36_27_April_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem4 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int  t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long r = fr.nextLong();
            long[] a = new long[n];
            long[] b = new long[n];
            long minElement = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = fr.nextLong();
                minElement = Math.min(minElement, a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i] = fr.nextLong();
            }
            long count = 0;
            int temp = -1;
            while(r >= minElement) {
                boolean flag = false;
//                long prevMin = min;
                long min = Long.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (r >= a[i] && a[i] - b[i] < min) {
                        flag = true;
                        temp = i;
                        min = a[i] - b[i];
//                        System.out.println(min);
                    }
                }

                if (flag) {
                    while (r >= a[temp]) {
                        count++;
                        r = r - a[temp] + b[temp];
//                System.out.println(r);
                    }
                } else {
                    break;
                }
        }
//            HashMap<Long, Integer> map = new HashMap<>();
//                boolean flag = false;
////                long prevMin = min;
//                long min = Long.MAX_VALUE;
//                for (int i = 0; i < n; i++) {
//                    if (r >= a[i] && a[i] - b[i] < min) {
//                        flag = true;
//                        temp = i;
//                        min = a[i] - b[i];
////                        System.out.println(min);
//                    }
//                }
//                    while (r >= a[temp]) {
//                        count++;
//                        r = r - a[temp] + b[temp];
////                System.out.println(r);
//                    }
//            System.out.println(count);
            }
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
