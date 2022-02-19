package KiccsDhack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AlternatingSubsequences {
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
        int t = fr.nextInt();
        while(t > 0)
        {
            int n = fr.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = fr.nextInt();
            }
//            Arrays.sort(arr);
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < n; i+=2)
            {
                sum1 += arr[i];
            }
            for(int i = 1; i < n; i+=2)
            {
                sum2 += arr[i];
            }
            int max = Integer.MIN_VALUE;
            max = Math.max(sum1, sum2);
            System.out.println(max);
            t--;
        }
    }
}
