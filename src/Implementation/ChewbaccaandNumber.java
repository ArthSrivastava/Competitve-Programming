package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChewbaccaandNumber {
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
        long x = fr.nextLong();
        long place = 1;
        int n = digits(x);
        int count = 1;
        long res = x;
        long diff = 0;
        while(x != 0)
        {
            int rem = (int)(x % 10);
            if(rem >= 5)
            {
                if(count != n || rem != 9) {
                    int inv = 9 - rem;
                    diff = rem - inv;
                    diff *= place;
                    res = res - diff;
                }
            }
            count++;
            place *= 10;
            x = x / 10;
        }
        System.out.println(res);
    }

    private static int digits(long n)
    {
        int count = 0;
        while(n != 0)
        {
            count++;
            n = n / 10;
        }
        return count;
    }
}
