package CodeforcesGlobalRound20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s2 = fr.nextLine();
            int n = s2.length();
            boolean flag = true;
            if (s2.charAt(0) == 'B' || s2.charAt(n - 1) == 'A') {
                flag = false;
            }
            long ca = 0, cb = 0;
            if (flag) {
                for (int i = 0; i < n - 1; i++) {
                    if (s2.charAt(i) == 'A') {
                        ca++;
                    }
                    if (s2.charAt(i + 1) == 'B') {
                        cb++;
                    } else {
                        if (cb > ca) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag && cb <= ca && cb != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
