package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral {
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
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tmp = 0, tmp2 = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = fr.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                tmp = i;
            }
        }
//        for(int i = tmp; i > 0; i--)
//        {
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = max;
//        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n; i++)
        {
            if (arr[i] <= min) {
                min = arr[i];
                tmp2 = i;
            }
        }
//        System.out.println(tmp2);
//        System.out.println(tmp + " " + (n - tmp2 - 1));
        int count = 0;
        if(tmp > tmp2)
            count = tmp + (n - tmp2 - 1) - 1;
        else
            count = tmp + (n - tmp2 - 1);
        System.out.println(count);
    }
}
