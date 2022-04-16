package RuntimeTerror;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PalindromicString9 {
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
        int l = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < l; i++) {
            freq[s.charAt(i) - 97]++;
        }
        if (l == 1) {
            System.out.print(s);
        } else if (l == 2) {
            boolean flag = false;
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(s);
            } else {
                System.out.println(s.charAt(0));
            }
        } else {
            StringBuilder sb = new StringBuilder();
            if (l % 2 == 0) {
                int countEven = 0, sum = 0, count = 0;
                int countOdd = 0;
                for (int i = 0; i < 26; i++) {
                    if (freq[i] != 0 && freq[i] % 2 == 0) {
                        countEven++;
                    } else if(freq[i] != 0) {
                        countOdd++;
                    }
                }
                if (countEven == 1 && countOdd == 0) {
                    System.out.println(s);
                } else if(countEven == 0 && countOdd == 1){
                    System.out.println(s);
                } else {
                    for (int i = 0; i < 26; i++) {
                        if (freq[i] != 0 && freq[i] % 2 == 0) {
                            sb.append((char) (i + 97));
                        }
                    }
                    for (int i = 0; i < 26; i++) {
                        if (freq[i] != 0 && freq[i] % 2 != 0) {
                            sb.append((char) (i + 97));
                            break;
                        }
                    }
                    StringBuilder rv = new StringBuilder(sb);
                    rv.reverse();
                    sb.append(rv);
                    System.out.println(sb);
                }
            }
        }
    }
}
