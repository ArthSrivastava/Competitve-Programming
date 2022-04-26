package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MiddleOfTheContest {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s1 = fr.nextLine(); //hh : mm
        String s2 = fr.nextLine(); //hh : mm

        int h1 = Integer.parseInt(s1.substring(0, s1.indexOf(":")));
        int m1 = Integer.parseInt(s1.substring(s1.indexOf(":") + 1));
        int h2 = Integer.parseInt(s2.substring(0, s2.indexOf(":")));
        int m2 = Integer.parseInt(s2.substring(s2.indexOf(":") + 1));
        StringBuilder sb = new StringBuilder();
//        int hrs = (h1 + h2) / 2;
//        int min = (m1 + m2) / 2;
//        if ((h1 + h2) % 2 != 0) {
//            min += 30;
//            if (min >= 60) {
//                min = min - 60;
//                hrs += 1;
//            }
//        }

//        if (hrs < 10) {
//            sb.append(0);
//        }
//        sb.append(hrs);
//        sb.append(":");
//        if (min < 10) {
//            sb.append(0);
//        }
//        sb.append(min);
        int t1 = h1 * 60 + m1;
        int t2 = h2 * 60 + m2;
        int t3 = (t1 + t2) / 2;
        int hrs = t3 / 60;
        if (hrs < 10) {
            sb.append(0);
        }
        sb.append(hrs);
        sb.append(":");
        int min = t3 % 60;
        if (min < 10) {
            sb.append(0);
        }
        sb.append(min);
        System.out.println(sb);
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
