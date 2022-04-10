package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PetrAndBook {
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
        int[] pages = new int[7];

        for (int i = 0; i < 7; i++) {
            pages[i] = fr.nextInt();
        }
        int i = 0;
        int sum = pages[0];
        while (sum < n) {
            i++;
            i %= 7;
            sum += pages[i];
        }

        System.out.println(i + 1);
        //Accepted but a little complex and lengthy solution //

//        int[] prefix = new int[7];
//        int day = 0, sum = 0;
//        for (int i = 0; i < 7; i++) {
//            pages[i] = fr.nextInt();
//            sum += pages[i];
//            if (i != 0) {
//                prefix[i] = prefix[i - 1] + pages[i];
//            } else {
//                prefix[i] = pages[i];
//            }
//        }
//        for (int i = 0; i < 7; i++) {
//            if (prefix[i] >= n) {
//                day = i + 1;
//                break;
//            }
//        }
//        if (day != 0) {
//            System.out.println(day);
//        } else {
//            int pagesLeft = n % prefix[6];
//            if (pagesLeft == 0) {
//                int temp = -1;
//                for (int i = 0; i < 7; i++) {
//                    if (sum == prefix[i]) {
//                        temp = i;
//                        break;
//                    }
//                }
//                System.out.println(temp + 1);
//            } else {
////                System.out.println(pagesLeft);
//                for (int i = 0; i < 7; i++) {
//                    if (pagesLeft <= prefix[i]) {
//                        day = i + 1;
//                        break;
//                    }
//                }
//                System.out.println(day);
//            }
//        }
    }
}
