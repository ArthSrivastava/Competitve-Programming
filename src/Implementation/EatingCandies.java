package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EatingCandies {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
            int low = -1, high = n;
            int temp = 0;
            int sum1 = 0, sum2 = 0;
            int c1 = 0, c2 = 0;
            while (low <= high) {
                if (sum1 < sum2) {
                    low++;
                    sum1 += arr[low];
                    c1++;
                } else if (sum1 > sum2) {
                    high--;
                    sum2 += arr[high];
                    c2++;
                } else {
                    low++;
                    high--;
                    temp = c1 + c2;
                    if (low != high && low < n && high > 0) {
                        sum1 += arr[low];
                        sum2 += arr[high];
                        c1++;
                        c2++;
                    }
                }
            }
            System.out.println(temp);
        }
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
