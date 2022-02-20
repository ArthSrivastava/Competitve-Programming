package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NewYearMeeting {
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
        int x1 = fr.nextInt();
        int x2 = fr.nextInt();
        int x3 = fr.nextInt();
//        int d12 = Math.abs(x1 - x2);
//        int d23 = Math.abs(x2 - x3);
//        int d31 = Math.abs(x3 - x1);
//        int sum1 = d12 + d23;
//        int sum2 = d12 + d31;
//        int sum3 = d23 + d31;
//        int min1 = Math.min(sum1, sum2);
//        int min2 = Math.min(min1, sum3);
//        System.out.println(min2);
        int[] arr = {x1, x2, x3};
        Arrays.sort(arr);
        int sum = Math.abs(arr[1] - arr[0]) + Math.abs(arr[2] - arr[1]);
        System.out.println(sum);
    }
}
