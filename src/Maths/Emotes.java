package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Emotes {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        long m = fr.nextLong();
        long k = fr.nextLong();
        long[] arr = new long[n];
        int temp = -1;
        Long[] newArr = new Long[n]; //Used wrapper class since Arrays.sort will use heap sort for Objects
                                     //which has worst case complexity of O(nlogn).Using Arrays.sort will give TLE
                                     //in case of sorted arrays (Worst case complexity O(n^2)
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextLong();
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr);
        long largest = newArr[n - 1];
        long secondLargest = newArr[n - 2];
        long pairs = m / (k + 1);
        long leftOut = m % (k + 1);
        long maxScore = (pairs * k + leftOut) * largest + (pairs * secondLargest);
        System.out.println(maxScore);
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
