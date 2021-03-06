package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dubstep {
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
        String s = fr.nextLine();
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < l - 2; ) {
            if (s.substring(i, i + 3).equals("WUB")) {
                if (i != 0 && i != l - 2) {
                    sb.append(" ");
                }
                while (i < l - 2 && s.substring(i, i + 3).equals("WUB")) {
                    i += 3;
                }
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        if (i < l) {
            sb.append(s.substring(i, l));
        }
        System.out.println(sb.toString());
    }
}
