package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hamburgers {
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
        long nb = fr.nextLong();
        long ns = fr.nextLong();
        long nc = fr.nextLong();
        long pb = fr.nextLong();
        long ps = fr.nextLong();
        long pc = fr.nextLong();
        long rb = fr.nextLong();
        long low = 0;
        long high = 100000000000000L;
        int[] freq = new int[3]; // Size 3: index: 0 -> Bread, 1 -> Sausage, 2 -> Cheese
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                freq[0]++;
            } else if (s.charAt(i) == 'S') {
                freq[1]++;
            } else {
                freq[2]++;
            }
        }
        long totalIngredients = nb + ns + nc;
        long ans = 0;
//        System.out.println(high);
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long extraBread = (freq[0] * mid) - nb;
            long extraSausage = (freq[1] * mid) - ns;
            long extraCheese = (freq[2] * mid) - nc;
//            System.out.println(mid);
            if (extraBread < 0) {
                extraBread = 0;
            }
            if (extraSausage < 0) {
                extraSausage = 0;
            }
            if(extraCheese < 0) {
                extraCheese = 0;
            }
            long totalMoney = extraBread * pb + extraSausage * ps + extraCheese * pc;
//            if(mid == 970881267037344831L) {
//                System.out.print("Mid:" + mid + " extraBread:" + extraBread + " extraSausage:" + extraSausage + " extraCheese:" + extraCheese);
//                System.out.println(" totalMoney:" + totalMoney);
//            }
            if (totalMoney > rb) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
