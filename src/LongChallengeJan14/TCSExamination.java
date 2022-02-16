package LongChallengeJan14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class TCSExamination {
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
            int[] dragon = new int[3];
            int[] sloth = new int[3];
            int sumD = 0, sumS = 0;
            for(int i=0; i<3; i++)
            {
                dragon[i] = fr.nextInt();
                sumD += dragon[i];
            }
            for(int i=0; i<3; i++)
            {
                sloth[i] = fr.nextInt();
                sumS += sloth[i];
            }
            if(sumD>sumS)
                System.out.println("Dragon");
            else if(sumS>sumD)
                System.out.println("Sloth");
            else {
                if (dragon[0] > sloth[0]) {
                    System.out.println("Dragon");
                } else if (dragon[0] < sloth[0]) {
                    System.out.println("Sloth");
                }
                else{
                    if (dragon[1] > sloth[1]) {
                        System.out.println("Dragon");
                    } else if (dragon[1] < sloth[1]) {
                        System.out.println("Sloth");
                    }
                    else{
                        System.out.println("Tie");
                    }
                }
            }
            t--;
        }
    }
}

