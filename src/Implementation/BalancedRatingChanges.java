package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BalancedRatingChanges {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int sumPositive = 0, sumNegative = 0;
        while (n-- > 0) {
            int x = fr.nextInt();
            list2.add(x);
            x /= 2;
            list.add(x);
            if (x > 0) {
                sumPositive += x;
            } else {
                sumNegative += x;
            }
        }
        System.out.println(list2);
        int sum = sumNegative + sumPositive;
        if (sumPositive > Math.abs(sumNegative)) {
            int i = 0;
            while (sum != 0) {
                if (list2.get(i) < 0 && list2.get(i) % 2 != 0) {
                    sum -= 1;
                    list.add(i, list.get(i) - 1);
                }
                i++;
            }
        } else if (sumPositive < Math.abs(sumNegative)) {
            int i = 0;
            do {
                if (list2.get(i) > 0 && list2.get(i) % 2 != 0) {
                    sum += 1;
                    list.add(i, list.get(i) + 1);
                }
                i++;
            } while (sum != 0);
        }
        for (int e : list) {
            System.out.println(e);
        }
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
