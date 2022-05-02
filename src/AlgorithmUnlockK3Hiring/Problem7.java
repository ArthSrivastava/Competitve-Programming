package AlgorithmUnlockK3Hiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem7 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            String s = fr.nextLine();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextLong();
            }
            char c;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((s.charAt(i) + (arr[i] % 26) > 122)){
//                    if(s.charAt(i) == 'e'){
//                        System.out.println("IN" + arr[i]);}
                    c = (char) (((s.charAt(i) + (arr[i] % 26)) % 122) + 96);
                } else {
                    c = (char)(s.charAt(i) + (arr[i] % 26));
                }
                sb.append(c);
            }
            System.out.println(sb);
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
