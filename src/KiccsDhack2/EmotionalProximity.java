package KiccsDhack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EmotionalProximity {
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
        while(t > 0)
        {
            double p = fr.nextDouble();
            double x = fr.nextDouble();
            double y = fr.nextDouble();
            int z = fr.nextInt();
            if(z == 1)
            {
                double inc = (p * y) / 100;
                p = p + inc;
                System.out.printf("%.10f", p);
            }
            else{
                double dec = (p * x) / 100;
                p = p - dec;
                System.out.printf("%.10f", p);
            }
            System.out.println();
            t--;
        }
    }
}
