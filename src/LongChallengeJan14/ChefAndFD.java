package LongChallengeJan14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class ChefAndFD {
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
        while(t>0)
        {
            int n = fr.nextInt();
            int x = fr.nextInt();
            int[] fd = new int[n];
            int totalSum = 0;
            int subSum;
            int c = 0;
            for(int i=0; i<n; i++) {
                fd[i] = fr.nextInt();
                totalSum += fd[i];
            }
            if(totalSum<x)
                System.out.println("-1");
            else if (totalSum == x) {
                System.out.println(n);
            } else {
                Arrays.sort(fd);
                int min = Integer.MAX_VALUE;
                int temp = 0;
                for(int i=0; i<n; i++)
                {
                    subSum = 0;
                    c = 0;
                    for(int j=i; j<n; j++)
                    {
                        subSum += fd[j];
                        c++;
                        if (subSum >= x) {
                            temp = c;
                            break;
                        }
                    }
                    if (temp < min) {
                        min = c;
//                        System.out.println(min);
                    }
                }
                System.out.println(min);
            }
            t--;
        }
    }
}
