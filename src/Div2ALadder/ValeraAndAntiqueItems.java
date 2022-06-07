package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class ValeraAndAntiqueItems {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int v = fr.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int seller = 1;
        while (n-- > 0) {
            int k = fr.nextInt();
            int[] arr = new int[k];
            boolean flag = false;
            for (int i = 0; i < k; i++) {
                arr[i] = fr.nextInt();
                if (!flag && arr[i] < v) {
                    count++;
                    list.add(seller);
                    flag = true;
                }
            }
            seller++;
        }
//        Collections.sort(list);
        System.out.println(list.size());
        for (int e : list) {
            System.out.print(e + " ");
        }
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
