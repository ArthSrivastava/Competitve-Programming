package Starters_2_March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CarChoice {
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
            int x1 = fr.nextInt();
            int x2 = fr.nextInt();
            int y1 = fr.nextInt();
            int y2 = fr.nextInt();
            float car1 = y1 / (float)x1;
            float car2 = y2 / (float)x2;
//            System.out.println("car1:" + car1 + "car2:" + car2);
            if(car1 > car2)
                System.out.println(1);
            else if(car1 < car2)
                System.out.println(-1);
            else
                System.out.println(0);
            t--;
        }

    }
}
