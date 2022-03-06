package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BoyOrGirl {
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
        String s = fr.nextLine();
        int n = s.length();
        int count = 0;
//        int[] freq = new int[26];
//        for(int i = 0; i < n; i++)
//        {
//            freq[s.charAt(i) - 97]++;
//        }
//        for(int i = 0; i < 26; i++)
//        {
//            if (freq[i] != 0) {
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(freq));
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for(int i = 0; i < n - 1; i++)
        {
            if(str[i] != str[i + 1])
                count++;
        }
        if((count + 1) % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
