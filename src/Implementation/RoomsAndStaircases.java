package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoomsAndStaircases {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            String s = fr.nextLine();
            int rooms = 0;
            if (s.charAt(0) == '1' || s.charAt(n - 1) == '1') {
                rooms = n * 2;
                System.out.println(rooms);
            } else {
                int zeroFromStart = 0, zeroFromEnd = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) != '1') {
                        zeroFromStart++;
                    } else {
                        break;
                    }
                }
                for (int i = n - 1; i >= 0; i--) {
                    if (s.charAt(i) != '1') {
                        zeroFromEnd++;
                    } else {
                        break;
                    }
                }
                if (zeroFromStart == n) {
                    rooms = n;
                } else {
                    int min = Math.min(zeroFromStart, zeroFromEnd);
                    rooms = 2 * (n - min);
                }
                System.out.println(rooms);
                }
            }
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
