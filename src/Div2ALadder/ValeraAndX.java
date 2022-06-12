package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class ValeraAndX {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        char[][] arr = new char[n][n];
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map1.put(i, 0);
            map2.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            String s = fr.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
                if(i == j || i + j == n - 1) map1.put(arr[i][j] - 97, map1.get(arr[i][j] - 97) + 1);
                else map2.put(arr[i][j] - 97, map2.get(arr[i][j] - 97) + 1);
            }
        }
        int c1 = 0, c2 = 0;
        boolean flag = true;
//        System.out.println(map1);
//        System.out.println(map2);
        for (int i = 0; i < 26; i++) {
            if (map1.get(i) != 0 && map2.get(i) != 0) {
                flag = false;
                break;
            }
            if(map1.get(i) > 0) c1++;
            if(map2.get(i) > 0) c2++;
        }
        if (flag && c1 == 1 && c2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
//        int[] freqDia = new int[26];
//        int[] freqRest = new int[26];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || (i + j == n - 1)) {
//                    freqDia[arr[i][j] - 97]++;
//                } else {
//                    freqRest[arr[i][j] - 97]++;
//                }
//            }
//        }
//        int c1 = 0, c2 =0;
//        for (int i = 0; i < 26; i++) {
//            if(freqDia[i] > 0 && freqRest[i] == 0) c1++;
//            if(freqRest[i] > 0 && freqDia[i] == 0) c2++;
//        }
//        if (c1 == 1 && c2 == 1) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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
