package AlgorithmUnlockK3Hiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3 {

    public static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        String s = fr.nextLine();
        long count = 0, countVowel = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
                if (isVowel(s.charAt(i))) {
                    countVowel++;
                }
            } else if(isVowel(s.charAt(i))) {
                countVowel++;
            }
        }
        if (count > countVowel) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
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
