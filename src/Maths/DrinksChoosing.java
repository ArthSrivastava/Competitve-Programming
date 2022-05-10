package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class DrinksChoosing {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int k = fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        int[] count = new int[k + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
//        Arrays.sort(count);
        int sets = (n + 1) / 2;
        int ans = 0;
//        System.out.println(Arrays.toString(count));
        for (int i = 1; sets > 0 && i <= k; i++) {
            if (count[i] % 2 == 0) {
                int x = (count[i] + 1) / 2;
                if (sets - x < 0) {
                    ans += sets * 2;
                } else {
                    ans += count[i];
                }
                sets -= x;
            }
        }
        int remaining = 0;
        for (int i = 0; sets > 0 && i <= k; i++) {
            if(count[i] % 2 != 0) {
                int x = count[i] / 2;
                if (sets - x < 0) {
                    ans += sets * 2;
                } else {
                    remaining++;
                    ans += count[i] - 1;
                }
                sets -= x;
            }
        }
        if (remaining <= sets) {
            ans += remaining;
        } else {
            ans += sets;
        }
        System.out.println(ans);
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
