package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
//https://codeforces.com/problemset/problem/349/A
public class CinemaLine {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(25, 0);
        map.put(50, 0);
        map.put(100, 0);
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
         }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.get(arr[i]) + 1);
            if (arr[i] == 50) {
                if (map.get(25) < 1) {
                    flag = false;
                    break;
                } else {
                    map.put(25, map.get(25) - 1);
                }
            } else if (arr[i] == 100) {
                if (map.get(50) > 0 && map.get(25) > 0) {
                    map.put(50, map.get(50) - 1);
                    map.put(25, map.get(25) - 1);
                } else if (map.get(25) >= 3) {
                    map.put(25, map.get(25) - 3);
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
