package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SumOfRoundNumbers {
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
            int place = 1, count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            if(n <= 9)
            {
                System.out.println(1);
                System.out.println(n);
            }
            else {
                while (n != 0) {
                    int rem = n % 10;
                    int num = rem * place;
                    if (num != 0) {
                        list.add(num);
                        count++;
                    }
                    place *= 10;
                    n = n / 10;
                }
                System.out.println(count);
                for(int e: list)
                {
                    System.out.print(e + " ");
                }
                System.out.println();
            }
            t--;
        }
    }
}
