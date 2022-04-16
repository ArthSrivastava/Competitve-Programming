package RuntimeTerror;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SpecialNumbers16 {
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
            long n = fr.nextLong();
            ArrayList<Long> list = new ArrayList<>();
            long place = 1;
            long count = 0;
            while (n != 0) {
                long rem = n % 10;
                long num = rem * place;
                if(num != 0) {
                    list.add(0, num);
                    count++;
                }
                place = place * 10;
                n = n / 10;
            }
            System.out.println(count);
            for (long e : list) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
