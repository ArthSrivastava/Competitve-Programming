package KiccsDhack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ThefThefinaandThefi {
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
            String s = fr.nextLine();
            char[] str = s.toCharArray();
            t--;
        }
    }

//    private static ArrayList<String> subsequence(String p, String up)
//    {
//        if (up.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        char ch = up.charAt(0);
//        ArrayList<String> left = subsequence(p + ch, up.substring(1));
//        ArrayList<String> right = subsequence(p, up.substring(1));
//        left.addAll(right);
//        return left;
//    }
}
