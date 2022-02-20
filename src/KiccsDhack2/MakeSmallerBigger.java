package KiccsDhack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class MakeSmallerBigger {
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
            long a = fr.nextLong();
            long b = fr.nextLong();
            long x = fr.nextLong();
            long y = fr.nextLong();
            int countA = 0, countB = 0;
//            long temp = a, temp2 = b;
            BigInteger A, B, X, Y;
            A = BigInteger.valueOf(a);
            B = BigInteger.valueOf(b);
            X = BigInteger.valueOf(x);
            Y = BigInteger.valueOf(y);
            if(a >= b)
                System.out.println(0);
            else{
               if(x != 1)
               {
                   while(A.compareTo(B) < 0) {
                       A = A.multiply(X);
                       countA++;
                   }
                   if(y != 1)
                   {
                        while(b > a)
                        {
                            b = b / y;
                            countB++;
                        }
                   System.out.println(Math.min(countA, countB));
                   }
                   else{
                       System.out.println(countA);
                   }
               }
               else if(y != 1)
               {
                   while(b > a)
                   {
                       b = b / y;
                       countB++;
                   }
                   System.out.println(countB);
               }
               else{
                   System.out.println(-1);
               }
            }

            t--;
        }
    }
}
