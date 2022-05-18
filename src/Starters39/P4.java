package Starters39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            String s = fr.nextLine();
            //modulo 1000000007
            boolean flag = false;
            long pos = 0;
            for (int i = 0; i < n; i++) {
                if (!isVowel(s.charAt(i))) {
                    flag = true;
                    int c = getMinDistVowel(s.charAt(i));
                    if(c > 1)
                        pos++;
                }
            }
            if (!flag) {
                System.out.println(1);
            } else {
                System.out.println(binpow3(2, pos));
            }
        }
    }
    private static long binpow3(long a,long b)
    {
        long mod = 1000000007;
        long res=1;
        a=a%mod;
        while(b>0)
        {
            if((b&1) % 2 != 0)
                res=res*a%mod;
            a=a*a%mod;
            b = b>>1;
        }
        return res;
    }
    private static int getMinDistVowel(char c) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        int cnt = 1;
        int min = Integer.MAX_VALUE;
        for (char ch : vowel) {
            if (Math.abs(ch - c) < min) {
                min = Math.abs(ch - c);
            } else if (Math.abs(ch - c) == min) {
                cnt++;
            }
        }
        return cnt;
    }

    private static boolean isVowel(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }
    public int gcd(int a, int b) {
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
