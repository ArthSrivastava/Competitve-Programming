package KiccsDhack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueriesInAnArray {
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
        int n = fr.nextInt();
        int q = fr.nextInt();
        long[] arr = new long[n + 1];
        for(int i = 1; i <= n; i++)
        {
            arr[i] = fr.nextInt();
        }
        while(q > 0)
        {
            int l = fr.nextInt();
            int r = fr.nextInt();
            int x = fr.nextInt();
            int count = 0;
            int mid = 0;
            int temp = r;
            while(l <= r)
            {
                mid = l + (r - l)/2;
                if(arr[mid] >= x)
                {
//                    count++;
//                    temp = r;
                    r = mid - 1;
                }
                else
                    l = mid + 1;
            }
            System.out.println(temp - r);
            q--;
        }
    }
}
