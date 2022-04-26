package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ShuffleHashing {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String p = fr.nextLine();
            String h = fr.nextLine();
            int n1 = p.length(), n2 = h.length();
            int[] pFreq = new int[26];
            for (int i = 0; i < n1; i++) {
                pFreq[p.charAt(i) - 97]++;
            }
            boolean flag = true;
            boolean found = false;
//                for (int i = 0; i <= n2 - n1; i++) {
//                    int[] tempFreq = new int[26];
//                    boolean flag = true;
//                    for (int j = i; j < i + n1; j++) {
//                        tempFreq[h.charAt(j) - 97]++;
//                    }
////                    System.out.println(Arrays.toString(tempFreq));
//                    for (int k = 0; k < 26; k++) {
//                        if (tempFreq[k] != pFreq[k]) {
//                            flag = false;
//                            break;
//                        }
//                    }
//                    if (flag) {
//                        found = true;
//                        break;
//                    }
//                }

            //Better method by sliding window technique: O(n * 26)
            if (n1 <= n2) {
                int[] tempFreq = new int[26];
                for (int i = 0; i < n1; i++) {
                    tempFreq[h.charAt(i) - 97]++;
                }
                for (int k = 0; k < 26; k++) {
                    if (tempFreq[k] != pFreq[k]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    found = true;
                }
                for (int i = n1; i < n2; i++) {
                    flag = true;
                    tempFreq[h.charAt(i - n1) - 97]--;
                    tempFreq[h.charAt(i) - 97]++;
                    for (int k = 0; k < 26; k++) {
                        if (tempFreq[k] != pFreq[k]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

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
}
