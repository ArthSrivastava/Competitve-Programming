package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeSquare {
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
            if(n % 2 == 0)
            {
                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < n; j++)
                    {
                        if(i == j){
                            System.out.print(1 + " ");
                        }
                        else if(i + j == (n - 1))
                            System.out.print(1 + " ");
                        else
                            System.out.print(0 + " ");
                    }
                    System.out.println();
                }
            }
            else{
                for(int i = 1; i <= n; i++)
                {
                    for(int j = 1; j <= n; j++)
                    {
                        if((i == n / 2 && j == (n + 1) / 2) || (i == (n + 1) / 2 && j == ((n + 1) / 2) + 1))
                        {
                            System.out.print(1 + " ");
                        }
                        else{
                        if (i == j) {
                            System.out.print(1 + " ");
                        } else if (i + j == n + 1)
                            System.out.print(1 + " ");
                        else
                            System.out.print(0 + " ");
                    }
                    }
                    System.out.println();
                }
            }
            t--;
        }
    }
}
