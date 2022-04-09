package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextRound {
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
        int n = fr.nextInt();
        int k = fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        if (arr[k - 1] != 0) {
            int lastOccurrence = getLastOccurrence(arr, arr[k - 1]);
//        System.out.println(lastOccurrence);
            System.out.println(lastOccurrence + 1);
        } else {
            int firstOccurrence = getFirstOccurrence(arr, 0);
            if (firstOccurrence != 0) {
                System.out.println(firstOccurrence);
            } else {
                System.out.println(0);
            }
        }
    }

    private static int getFirstOccurrence(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                res = mid;
                e = mid - 1;
            } else if (arr[mid] < x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return res;
    }

    private static int getLastOccurrence(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) {
                res = mid;
                s = mid + 1;
            } else if (arr[mid] < x) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return res;
    }
}
