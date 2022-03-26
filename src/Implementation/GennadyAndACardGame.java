package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GennadyAndACardGame {
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
        String[] cardsInHand = new String[5];
        boolean canPlay = false;
        for (int i = 0; i < 5; i++) {
            cardsInHand[i] = fr.next();
            if (s.charAt(0) == cardsInHand[i].charAt(0) || s.charAt(1) == cardsInHand[i].charAt(1)) {
                canPlay = true;
            }
        }
        if (canPlay) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
