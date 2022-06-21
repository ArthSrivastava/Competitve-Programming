package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheChildAndHomework {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String a = fr.nextLine();
        String b = fr.nextLine();
        String c = fr.nextLine();
        String d = fr.nextLine();
        int count = 0;
        int[] length = new int[4];
        length[0] = a.length() - 2;
        length[1] = b.length() - 2;
        length[2] = c.length() - 2;
        length[3] = d.length() - 2;
        char res = 0;
        for (int i = 0; i < 4; i++) {
            int shorter = 0;
            int longer = 0;
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    if (length[i] <= length[j] / 2) {
                        shorter++;
                    } else if (length[i] >= 2 * length[j]) {
                        longer++;
                    }
                }
            }
//            System.out.println(longer);
            if (shorter == 3 || longer == 3) {
                count++;
                res = (char)(65 + i);
            }
        }
        if (count == 1) {
            System.out.println(res);
        } else {
            System.out.println('C');
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
