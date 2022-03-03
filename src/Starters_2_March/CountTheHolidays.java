package Starters_2_March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CountTheHolidays {
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
            ArrayList<Integer> list = new ArrayList<>(8);
            list.add(6);
            list.add(13);
            list.add(20);
            list.add(27);
            list.add(7);
            list.add(14);
            list.add(21);
            list.add(28);
            int count = 8;
            for(int i = 0; i < n; i++)
            {
                arr[i] = fr.nextInt();
                if(!(list.contains(arr[i])))
                    count++;
            }
            System.out.println(count);
            t--;
        }
    }
}
