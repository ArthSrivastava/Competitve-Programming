package LongChallengeJan14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CryingColours {
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
//            int n = fr.nextInt();
//            int[][] box = new int[3][3];
//            for(int i=0; i<3; i++)
//            {
//                for(int j=0; j<3; j++)
//                {
//                    box[i][j] = fr.nextInt();
//
//                }
//            }
//            for(int i=0; i<3; i++)
//            {
//                for(int j=i+1; j<3; j++)
//                {
//                   int tmp = box[i][j];
//                   box[i][j] = box[j][i];
//                   box[j][i] = tmp;
//                }
//            }
//            for(int i=0; i<3; i++)
//            {
//                for(int j=0; j<3; j++)
//                {
//                    System.out.print(box[i][j] + " ");
//                }
//                System.out.println();
//            }
            int[] arr = new int[5];
            System.out.println(arr[1]);
            t--;
        }
    }
}

