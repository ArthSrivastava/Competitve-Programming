package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KString {
//    static final int CHAR = 256;

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

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int k = fr.nextInt();
        String s = fr.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 97]++;
        }
        boolean iskString = isKString(count, k);
        if (!iskString) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();

            //First Method:
//            for (int l = 0; l < s.length(); l++) {
//                for (int i = 0; i < 26; i++) {
//                    for (int j = 0; j < count[i] / k; j++) {
//                        sb.append((char)(i + 97));
//                    }
//              }
//                if (sb.length() == s.length()) {
//                    break;
//                }
//                }

            //Second Method:
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < count[i] / k; j++) {
                    sb.append((char) (i + 97));
                }
            }
            for (int i = 0; i < k; i++) {
                res.append(sb);
            }
            System.out.println(res);
        }
    }

    private static boolean isKString(int[] count, int k) {
        for (int i = 0; i < 26; i++) {
            if (count[i] % k != 0) {
                return false;
            }
        }
        return true;
    }
}
