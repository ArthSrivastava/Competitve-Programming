package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiverseSubstring {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        String s = fr.nextLine();
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        boolean flag = false;
        for (int i = 0; i < l - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                flag = true;
                sb.append(s.charAt(i));
                sb.append(s.charAt(i + 1));
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
            System.out.println(sb);
        } else {
            System.out.println("NO");
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
