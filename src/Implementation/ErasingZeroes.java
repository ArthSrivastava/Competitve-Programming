package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ErasingZeroes {
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
        while (t-- > 0) {
            String s = fr.nextLine();
            int n = s.length();
            int temp = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    temp = i;
                    break;
                }
            }
//            System.out.println(temp);
            int temp2 = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    temp2 = i;
                    break;
                }
            }
            int count = 0;
            while (temp < temp2) {
                if (s.charAt(temp) == '0') {
                    count++;
                }
                temp++;
            }
            System.out.println(count);
        }
    }
}
