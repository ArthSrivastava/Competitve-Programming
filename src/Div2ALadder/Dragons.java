package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Dragons {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int s = fr.nextInt();
        int n = fr.nextInt();
        int[][] arr = new int[n][2];
        int t = n;
        while (t-- > 0) {
            arr[t][0] = fr.nextInt();
            arr[t][1] = fr.nextInt();
        }
        sort2dArray(arr);
        int sum = s;
        boolean flag = true;
//        for(int[] a: arr)
//            System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            if (arr[i][0] < sum) {
                sum += arr[i][1];
            } else {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static void sort2dArray(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer itemIdOne = o1[0];
                Integer itemIdTwo = o2[0];
                return itemIdOne.compareTo(itemIdTwo);
            }
        });
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
