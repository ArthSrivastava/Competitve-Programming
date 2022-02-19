package KiccsDhack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PairofPrimes {
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
            ArrayList<Integer> list = new ArrayList<>();
            boolean[] primes = new boolean[n+1];
            int[] arr = new int[2];
            arr[0] = -1;
            arr[1] = -1;
            sieve(n, primes, list);
//            System.out.println(list);
            boolean flag = false;
            for(int i = 0; i < list.size(); i++)
            {
                for(int j = 0; j < list.size(); j++)
                {
                    if(list.get(i) + list.get(j) == n)
                    {
                        arr[0] = list.get(i);
                        arr[1] = list.get(j);
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            System.out.println(arr[0] + " " + arr[1]);
            t--;
        }
    }
    static void sieve(int n, boolean []primes, ArrayList<Integer> list)

    {
        for(int i=2; i*i<=n; i++)
        {
            if (!primes[i]) {
                for(int j= i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2; i<=n; i++)
        {
            if (!primes[i]) {
                list.add(i);
            }
        }
//        System.out.println(list);
    }
}
