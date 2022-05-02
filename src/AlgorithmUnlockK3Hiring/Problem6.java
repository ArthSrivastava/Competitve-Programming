package AlgorithmUnlockK3Hiring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem6 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long n = fr.nextLong();
            int d = fr.nextInt();
            long[] arr = new long[d];
            long sum = 0;
            for (int i = 0; i < d; i++) {
                arr[i] = fr.nextLong();
                sum += arr[i];
            }
            long diff = n;
//            System.out.println(n);
//            System.out.println(sum);
            boolean flag = true;
            if(n > sum && n % sum != 0) {
                long x = n % sum;
                flag = true;
                diff = x;
            } else if (n > sum && n % sum == 0) {
                flag = false;
            }
            long count = arr[0];
            int i = 0;
            if(flag) {
                while (count < diff) {
                    i++;
                    count += arr[i];
//                    System.out.println(i + " " + count);
                }
            }
            if (flag) {
                System.out.println(i + 1);
            } else {
                System.out.println(d);
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
