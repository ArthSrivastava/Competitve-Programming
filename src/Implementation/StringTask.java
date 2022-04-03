package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTask {
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
        String s = fr.nextLine();
        StringBuilder sb = new StringBuilder();
//        if (!isVowel(s.charAt(0))) {
//            sb.append(".");
//            }
            for (int i = 0; i < s.length(); i++) {
                if (!isVowel(s.charAt(i))) {
                    sb.append(".");
                    if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                        char c = (char) (s.charAt(i) + 32);
                        sb.append(c);
                    } else {
                        sb.append(s.charAt(i));
                    }
                }
        }
        System.out.println(sb);
    }

    private static boolean isVowel(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'y') || (c == 'A') || (c == 'E') || (c == 'I') ||
        (c == 'O') || (c == 'U') || (c == 'Y');
    }

}
