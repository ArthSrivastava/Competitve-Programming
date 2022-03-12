package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DigitGame {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            String num = fr.nextLine();
            char[] nums = num.toCharArray();
            boolean hasEven = false;
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0 && nums[i - 1] % 2 == 0) {
                        hasEven = true;
                    }
                }
                if (hasEven) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                boolean hasOdd = false;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0 && nums[i - 1] % 2 != 0) {
                        hasOdd = true;
                    }
                }
                if (hasOdd) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }

}