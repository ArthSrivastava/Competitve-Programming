package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/339/A
public class HelpfulMaths {
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
        int n = s.length();
        char[] str = s.toCharArray();

        int c1 = 0, c2 = 0, c3 = 0;
        for(int i = 0; i < n; i++)
        {
            if (str[i] == '1') {
                c1++;
            } else if (str[i] == '2') {
                c2++;
            } else if (str[i] == '3') {
                c3++;
            }
        }
//        System.out.println(c1 + " " + c2 + " " + c3);
        for(int i = 0; i < c1; i++)
        {
            if(c2 != 0 || c3 != 0)
            System.out.print("1" + "+");
            else{
                if(i != c1 - 1)
                    System.out.print("1" + "+");
                else
                    System.out.println("1");
            }
        }
        for(int i = 0; i < c2; i++)
        {
            if(c3 != 0)
                System.out.print("2" + "+");
            else{
                if(i != c2 - 1)
                    System.out.print("2" + "+");
                else
                    System.out.println("2");
            }
        }
        for(int i = 0; i < c3; i++)
        {
            if(i != c3 - 1)
                System.out.print("3" + "+");
            else
                System.out.println("3");
            }
        }
//        for(int i = 0; i < n; i++)
//        {
//            for(int j = 0; j < n - 2 - i; j+=2) {
//                if (str[j] > str[j + 2]) {
//                    char tmp = str[j];
//                    str[j] = str[j + 2];
//                    str[j + 2] = tmp;
//                }
//            }
//        }
//        for(int i = 0; i < n; i++)
//        {
//            System.out.print(str[i]);
//        }
    }

