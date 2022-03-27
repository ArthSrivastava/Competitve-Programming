package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BoringApartments {
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
        while (t-- > 0) {
            String x = fr.nextLine();
//            HashMap<Integer, Integer> map = new HashMap<>();
//            map.put(1, 1);
//            map.put(2, 3);
//            map.put(3, 6);
//            map.put(4, 10);
//            int numOfDigits = getNumOfDigits(x);
//            if (x % 10 == 1) {
//                System.out.println(numOfDigits * (numOfDigits + 1) / 2);
//            } else {
//                int total = ((x % 10) - 1) * 10 + numOfDigits * (numOfDigits + 1) / 2;
//                System.out.println(total);
//            }
            int numOfDigits = x.length();
            int total = (x.charAt(0) - '0' - 1) * 10 + numOfDigits * (numOfDigits + 1) / 2;
            System.out.println(total);
        }
    }

    private static int getNumOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
