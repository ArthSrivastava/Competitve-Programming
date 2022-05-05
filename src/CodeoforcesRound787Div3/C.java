package CodeoforcesRound787Div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/1675/C
public class C {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s = fr.nextLine();
            int n = s.length();
            if (s.charAt(0) == '0' || s.charAt(n - 1) == '1') {
                System.out.println(1);
            } else {
                long countQuesMark = 0;
                int temp = -1;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '?') {
                        countQuesMark++;
                    }
                }
                long count = 0;
                if (countQuesMark == n) {
                    count = n;
                } else {
                    for (int i = 0; i < n; i++) {
                        if (s.charAt(i) == '0') {
                            temp = i;
                            break;
                        }
                    }
//                    System.out.println(temp);
                    if (temp != -1) {
                        while (temp >= 0 && s.charAt(temp) != '1') {
                            count++;
                            temp--;
                        }
                        if(temp != -1)
                            count++;
                    } else {
                        int x = -1;
                        for (int i = 0; i < n; i++) {
                            if (s.charAt(i) == '1') {
                                x = i;
                            }
                        }
                        count = n - x;
                    }
                }
                System.out.println(count);
            }
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
