package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/131/A
public class cAPSlOCK {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.nextLine();
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        //Method 1
//        if (s.charAt(0) >= 97) {
//            if (areAllUppercase(s.substring(1))) {
//                sb.delete(0, l);
//                sb.append((char) (s.charAt(0) - 32));
//                sb.append(modifyWord(s, 1));
//            }
//        } else if (areAllUppercase(s)) {
//                sb.delete(0, l);
//                sb.append(modifyWord(s, 0));
//        }

        //Method 2
        boolean flag = true;
        for (int i = 1; i < l; i++) {
            if (s.charAt(i) >= 97) {
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) >= 97) {
                    sb.append((char) (s.charAt(i) - 32));
                } else {
                    sb.append((char) (s.charAt(i) + 32));
                }
            }
        } else {
            sb.append(s);
        }
        System.out.println(sb);
    }

    private static StringBuilder modifyWord(String s, int x) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        for (int i = x; i < l; i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                sb.append((char) (s.charAt(i) + 32));
            }
        }
        return sb;
    }
    private static boolean areAllUppercase(String s) {
        int l = s.length();
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) >= 97) {
                return false;
            }
        }
        return true;
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
