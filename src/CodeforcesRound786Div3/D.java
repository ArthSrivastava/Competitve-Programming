package CodeforcesRound786Div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/contest/1674/problem/D
public class D {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = fr.nextLong();
            }
            if (n % 2 == 0) {
                long max = Math.max(a[0], a[1]);
                long min = Long.MAX_VALUE;
                boolean flag = true;
                for (int i = 2; i < n - 1; i += 2) {
                    if (Math.min(a[i], a[i + 1]) >= max) {
                        max = Math.max(a[i], a[i + 1]);
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                long min = Long.MAX_VALUE;
                boolean flag = true;
                if(n == 1) {
                    System.out.println("YES");
                } else {
                    if (a[0] > Math.min(a[1], a[2])) {
                        flag = false;
                    }
                    if (flag) {
                        long max = Math.max(a[1], a[2]);
                        long min1 = Long.MAX_VALUE;
                        boolean check = true;
                        for (int i = 3; i < n - 1; i += 2) {
                            if (Math.min(a[i], a[i + 1]) >= max) {
                                max = Math.max(a[i], a[i + 1]);
                            } else {
                                check = false;
                                break;
                            }
                        }
                        if (check) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                }
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
