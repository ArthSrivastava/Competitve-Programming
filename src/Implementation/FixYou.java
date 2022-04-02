package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FixYou {
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
            int n = fr.nextInt();
            int m = fr.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                String line = fr.nextLine();
//                System.out.println(line.length());
                for (int j = 0; j < m; j++) {
                    char c;
                    c = line.charAt(j);
                    if (c == 'C') {
                        break;
                    } else if (c == 'R' && j == m - 1) {
                        count++;
                    } else if (c == 'D' && i == n - 1) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
