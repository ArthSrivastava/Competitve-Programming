package Starters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int x1 = fr.nextInt();
            int y1 = fr.nextInt();
            int x2 = fr.nextInt();
            int y2 = fr.nextInt();
            boolean flag = false;
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 8; j++) {
                    boolean b = Math.abs(i - x1) == Math.abs(i - x2);
                    boolean b1 = Math.abs(j - y1) == Math.abs(j - y2);
                    if ((b && Math.abs(i - x1) == 1) && (b1 && Math.abs(j - y1) == 2)) {
//                        System.out.println("i:" + i + " " + "j:" + j);
                        flag = true;
                        System.out.println("YES");
                        break;
                    } else if ((b && Math.abs(i - x1) == 2) && (b1 && Math.abs(j - y1) == 1)) {
//                        System.out.println("IN");
//                        System.out.println("i:" + i + " " + "j:" + j);
                        flag = true;
                        System.out.println("YES");
                        break;
                    } else if ((Math.abs(i - x1) == 1 && Math.abs(i - x2) == 2) && (Math.abs(j - y1) == 2 && Math.abs(j - y2) == 1)) {
                        flag = true;
                        System.out.println("YES");
                        break;
                    } else if ((Math.abs(i - x1) == 2 && Math.abs(i - x2) == 1) && (Math.abs(j - y1) == 1 && Math.abs(j - y2) == 2)) {
                        flag = true;
                        System.out.println("YES");
                        break;
                    }
                }
                if(flag) break;
            }
            if (!flag) {
                System.out.println("NO");
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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
