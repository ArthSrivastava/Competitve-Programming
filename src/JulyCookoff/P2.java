package JulyCookoff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int m = fr.nextInt();
            int k = fr.nextInt();
            int[] arr = new int[n];
            int[] freqSmaller = new int[k];
            int[] freqGreater = new int[n + 1];
            int c = 0, greater = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] < k) {
                    freqSmaller[arr[i]]++;
                } else if(arr[i] > k) {
                    freqGreater[arr[i]]++;
                }
            }
//            System.out.println("Greater:" + greater);
//            System.out.println("C:" + c);
            boolean flag = true;
            int count = 0, countDistinctSmaller = 0;
//            System.out.println(Arrays.toString(freqSmaller));
            for(int i = 0; i < freqSmaller.length; i++) {
                if (freqSmaller[i] >= 1) {
                    count += Math.max(freqSmaller[i] - 1, 0);
                    countDistinctSmaller++;
                }
            }
            if (countDistinctSmaller < k) {
//                System.out.println("IN");
                System.out.println("NO");
            } else {
                if(m == k) {
                    System.out.println("YES");
                } else if (m > k) {
                    for (int i = k + 1; i <= n; i++) {
                        if (freqGreater[i] > 0) {
                            c += freqGreater[i];
                        }
                    }
//                    System.out.println(Arrays.toString(freqGreater));

                    if (count + c < (m - k)) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static long gcd(long a, long b) {
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
