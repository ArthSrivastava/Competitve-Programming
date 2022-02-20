package KiccsDhack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TypingLetter {
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
            String s = fr.nextLine();
            int count = 1;
            int j = 0;
            if(s.length() == 1)
                System.out.println(count);
            else {
                for (int i = 0; i < s.length();) {
                    j = i + 1;
                    int countChar = 1;
                    boolean flag = false;
                    while(j < s.length() && s.charAt(j) == s.charAt(i))
                    {
                        countChar++;
                        flag = true;
                        j++;
                    }
                    if(flag) {
                        if(isPower(countChar, 0) != -1)
                        {
                            int res = isPower(countChar, 0);
                            count += res;
                        }
                        else if (countChar % 2 == 0) {
                            count += countChar / 2;
                        } else
                            count += (countChar - 1) / 2;
                        i = j;
                    }
                    else {
                        count++;
                        i++;
                    }
                }
                System.out.println(count);
            }
            t--;
        }
    }

    public static int isPower(int n, int count) //First method
    {
        if(n==1)
            return count;
        else if(n%2!=0)
        {
            return -1;
        }

        return isPower(n/2, ++count);
    }
}
