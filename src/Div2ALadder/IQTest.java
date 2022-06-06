package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IQTest {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        int countEven = 0, countOdd = 0;
        int temp1 = -1, temp2 = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
            if ((arr[i] & 1) != 0) {
                temp1 = i + 1;
                countOdd++;
            } else {
                temp2 = i + 1;
                countEven++;
            }
//            if(countEven > 1) ans = temp1;
//            else ans = temp2;
        }
        if (countEven == 1) {
            System.out.println(temp2);
        } else {
            System.out.println(temp1);
        }
//         System.out.println(ans);
    }

    public static int gcd(int a, int b) {
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
