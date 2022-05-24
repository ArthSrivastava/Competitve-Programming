package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class GCDLength {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int a = fr.nextInt();
            int b = fr.nextInt();
            int c = fr.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(1 , 1);
            map.put(2 , 10);
            map.put(3 , 100);
            map.put(4 , 1000);
            map.put(5 , 10000);
            map.put(6 , 100000);
            map.put(7 , 1000000);
            map.put(8 , 10000000);
            map.put(9 , 100000000);
            if (a <= b) {
                long x = map.get(a);
                long y = map.get(b) + map.get(c);
                System.out.println(x + " " + y);
            } else {
                long x = map.get(b);
                long y = map.get(a) + map.get(c);
                System.out.println(y + " " + x);
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
